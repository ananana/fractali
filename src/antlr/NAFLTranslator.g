tree grammar NAFLTranslator;

options {
	tokenVocab = NAFL;
	ASTLabelType = CommonTree;
}

@header {
	package fractali;
	import java.util.Vector;
}


fractal returns [Fractal f] :
	{ $f  = null;}
	^(LSYSTEM ax=axiom_rule an=angle_rule pr=production_rule)
	{
            String[] prodsL = $pr.prodsL.toArray(new String[0]);
            String[] prodsR = $pr.prodsR.toArray(new String[0]);
            $f = new LSystemFractal($ax.ax, prodsL, prodsR, $an.angle);
        }
        |^(FORMULA ff=formula)
        {
            int[] zExp = new int[$ff.zExp.size()];
            boolean[] zSgn = new boolean[$ff.zSgn.size()];
            for(int i=0; i<$ff.zSgn.size(); i++) {
                zExp[i] = $ff.zExp.get(i);
                zSgn[i] = $ff.zSgn.get(i);
            }
            $f = new FormulaFractal(zExp, zSgn, $ff.cExp, $ff.cSgn, FormulaFractal.formulaType.MANDELBROT);
        }
        |^(FORMULA ff=formula c=c_init)
        {
            int[] zExp = new int[$ff.zExp.size()];
            boolean[] zSgn = new boolean[$ff.zSgn.size()];
            for(int i=0; i<$ff.zSgn.size(); i++) {
                zExp[i] = $ff.zExp.get(i);
                zSgn[i] = $ff.zSgn.get(i);
            }
            $f = new FormulaFractal(zExp, zSgn, $ff.cExp, $ff.cSgn, FormulaFractal.formulaType.JULIA, $c.re, $c.im);
        }
;

// L-sisteme
axiom_rule returns [String ax]:
	{$ax = null;}
	^(AXIOM r=RULE) {$ax = $r.text;}
        | ^(AXIOM l=LINE) {$ax = $l.text;};
     
angle_rule returns [int angle]:
	{$angle = 0;}
	^(ANGLE a=ANGLE_NUMBER)	{$angle = Integer.parseInt($a.text);};

production_rule returns [Vector<String> prodsL, Vector<String> prodsR] :
	 {
	 	$prodsL = new Vector<String>();
	 	$prodsR = new Vector<String>();
	 }
	 ^(PRODUCTIONS (pr=production { $prodsL.add($pr.l); $prodsR.add($pr.r); })+);

production returns [String l, String r]:
	^(PRODUCTION l1=LINE l2=LINE) { $l = $l1.text; $r = $l2.text; }
	| ^(PRODUCTION line=LINE rule=RULE) { $l = $line.text; $r = $rule.text; };

//formule
formula returns [Vector<Integer> zExp, Vector<Boolean> zSgn, int cExp, boolean cSgn]:
    ^(ADD z=z_expr c=c_expr)
    {
        $zExp = $z.zExp;
        $zSgn = $z.zSgn;
        $cExp = $c.cExp;
        $cSgn = true;
    }
    |^(SUB z=z_expr c=c_expr)
    {
        $zExp = $z.zExp;
        $zSgn = $z.zSgn;
        $cExp = $c.cExp;
        $cSgn = false;
    };
z_expr returns[Vector<Integer> zExp, Vector<Boolean> zSgn] :
    {
        $zExp = new Vector<Integer>();
        $zSgn = new Vector<Boolean>();
    }
    ^(ZPOLY (z=z_sgn_pow_expr { $zExp.add($z.exp); $zSgn.add($z.sgn);})+);
z_sgn_pow_expr returns[int exp, boolean sgn] :
    ^(ADD ^(ZTERM n=(NUMBER|ANGLE_NUMBER)))
    {
        $exp = Integer.parseInt($n.text);
        $sgn = true;
    }
    |^(SUB ^(ZTERM n=(NUMBER|ANGLE_NUMBER)))
    {
        $exp = Integer.parseInt($n.text);
        $sgn = false;
    }
    |^(ADD ^(ZTERM ONE))
    {
        $exp = 1;
        $sgn = true;
    }
    |^(SUB ^(ZTERM ONE))
    {
        $exp = 1;
        $sgn = false;
    };
c_expr returns [int cExp]:
    ^(CTERM n=(NUMBER|ANGLE_NUMBER))
    {
        $cExp = Integer.parseInt($n.text);
    }
    |^(CTERM ONE)
    {
        $cExp = 1;
    };
c_init returns [double re, double im]:
    ^(CINIT ding=double_vachgj dong=double_vachgj)
    {
        $re = $ding.dd;
        $im = $dong.dd;
    };
double_vachgj returns[double dd] :
    ^(DBL d=DOUBLE) { $dd = Double.parseDouble($d.text); }
    | ^(DBL n=NUMBER) { $dd = Double.parseDouble($n.text);}
    | ^(DBL a=ANGLE_NUMBER) { $dd = Double.parseDouble($a.text);};