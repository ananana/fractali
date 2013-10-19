grammar NAFL;

options {
	output = AST;
}

tokens {
	PROG;

	LSYSTEM;
	IFS;
	FORMULA;

	AXIOM;
	RULE;
	ANGLE;
	PRODUCTION;
	PRODUCTIONS;

        ZTERM;
        ADD;
        SUB;
        CINIT;
        MANDELBROT;
        JULIA;
        CTERM;
        ZPOLY;

        ONE;
        DBL;
}


@header {
    package fractali;
}

@lexer::header {
    package fractali;
}


	

program     :     lsystem_type | ifs_type | formula_type;
lsystem_type    :    'lsystem' axiom_rule angle_rule production_rule
			-> ^(LSYSTEM axiom_rule angle_rule production_rule);
production
	:	  LINE ARROW RULE -> ^(PRODUCTION LINE RULE)
    | LINE ARROW LINE -> ^(PRODUCTION LINE LINE);
production_rule    :    'productions' production+ -> ^(PRODUCTIONS production+);
axiom_rule    :    'axiom' RULE
			-> ^(AXIOM RULE)
                    | 'axiom' LINE
                        -> ^(AXIOM LINE);


angle_rule    :    'angle' angle -> ^(ANGLE angle);
angle        :    ANGLE_NUMBER;


formula_type    :    'formula' formula -> ^(FORMULA formula)
                     | 'formula' c_init formula -> ^(FORMULA formula c_init)
                     | 'formula' formula c_init -> ^(FORMULA formula c_init);
double_val : d = DOUBLE -> ^(DBL $d) | n = NUMBER -> ^(DBL $n)
           | a = ANGLE_NUMBER -> ^(DBL $a);
c_init : 'c' '=' '(' d1=double_val ',' d2=double_val ')' -> ^(CINIT $d1 $d2);
formula :	'z' '=' z_expr '+' c_expr -> ^(ADD z_expr c_expr)
                | 'z' '=' z_expr '-' c_expr -> ^(SUB z_expr c_expr);
z_expr :	z_pow_expr z_sgn_pow_expr+ -> ^(ZPOLY ^(ADD z_pow_expr) z_sgn_pow_expr+)
		| '-' z_pow_expr z_sgn_pow_expr+ -> ^(ZPOLY ^(SUB z_pow_expr) z_sgn_pow_expr+)
                | z_pow_expr -> ^(ZPOLY ^(ADD z_pow_expr))
                | '-' z_pow_expr -> ^(ZPOLY ^(SUB z_pow_expr));
z_sgn_pow_expr 
	:	 '+' z_pow_expr -> ^(ADD z_pow_expr)
	         | '-' z_pow_expr -> ^(SUB z_pow_expr);
z_pow_expr 
	:	('z' '^' NUMBER) -> ^(ZTERM NUMBER)
	        |('z' '^' ANGLE_NUMBER) -> ^(ZTERM ANGLE_NUMBER)
	        | 'z' -> ^(ZTERM ONE);
c_expr 	:	'c' '^' NUMBER -> ^(CTERM NUMBER)
                | 'c' '^' ANGLE_NUMBER -> ^(CTERM ANGLE_NUMBER)
                | 'c' -> ^(CTERM ONE);
ifs_type    :    'ifs';

ARROW 	:	 '->';
LINE    :    'A'..'Z';
RULE
  : (ROTATE|LINE) (ROTATE | LINE)+
  ;
fragment ROTATE    :    ('/' | '\\');
ANGLE_NUMBER    :    '1'..'9' '0'..'9'? | ('1'..'2' '0'..'9' | '3' '0'..'5') '0'..'9';
NUMBER    :    ('+' | '-')? '0' | ('1'..'9' '0'..'9'*);
DOUBLE
    :   ('+' | '-')? ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   ('+' | '-')? '.' ('0'..'9')+ EXPONENT?
    |   ('+' | '-')? ('0'..'9')+ EXPONENT
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
WS  :   (' ' | '\t' | '\r'| '\n')
        {skip();};


EQUALS
	:	'='
	;