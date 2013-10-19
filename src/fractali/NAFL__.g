lexer grammar NAFL;
@header {
    package fractali;
}

T32 : 'lsystem' ;
T33 : 'productions' ;
T34 : 'axiom' ;
T35 : 'angle' ;
T36 : 'formula' ;
T37 : 'c' ;
T38 : '(' ;
T39 : ',' ;
T40 : ')' ;
T41 : 'z' ;
T42 : '+' ;
T43 : '-' ;
T44 : '^' ;
T45 : 'ifs' ;

// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 86
ARROW 	:	 '->';
// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 87
LINE    :    'A'..'Z';
// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 88
RULE
  : (ROTATE|LINE) (ROTATE | LINE)+
  ;
// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 91
fragment ROTATE    :    ('/' | '\\');
// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 92
ANGLE_NUMBER    :    '1'..'9' '0'..'9'? | ('1'..'2' '0'..'9' | '3' '0'..'5') '0'..'9';
// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 93
NUMBER    :    ('+' | '-')? '0' | ('1'..'9' '0'..'9'*);
// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 94
DOUBLE
    :   ('+' | '-')? ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   ('+' | '-')? '.' ('0'..'9')+ EXPONENT?
    |   ('+' | '-')? ('0'..'9')+ EXPONENT
    ;

// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 100
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 102
WS  :   (' ' | '\t' | '\r'| '\n')
        {skip();};


// $ANTLR src "C:\Users\Razvan\Documents\NetBeansProjects\Fractali\src\antlr\NAFL.g" 106
EQUALS
	:	'='
	;