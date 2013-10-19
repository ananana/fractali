// $ANTLR 3.0.1 C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g 2010-06-14 00:34:36

	package fractali;
	import java.util.Vector;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class NAFLTranslator extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "LSYSTEM", "IFS", "FORMULA", "AXIOM", "RULE", "ANGLE", "PRODUCTION", "PRODUCTIONS", "ZTERM", "ADD", "SUB", "CINIT", "MANDELBROT", "JULIA", "CTERM", "ZPOLY", "ONE", "DBL", "LINE", "ARROW", "ANGLE_NUMBER", "DOUBLE", "NUMBER", "ROTATE", "EXPONENT", "WS", "EQUALS", "'lsystem'", "'productions'", "'axiom'", "'angle'", "'formula'", "'c'", "'('", "','", "')'", "'z'", "'+'", "'-'", "'^'", "'ifs'"
    };
    public static final int ZPOLY=20;
    public static final int EXPONENT=29;
    public static final int RULE=9;
    public static final int FORMULA=7;
    public static final int ANGLE=10;
    public static final int NUMBER=27;
    public static final int LSYSTEM=5;
    public static final int SUB=15;
    public static final int JULIA=18;
    public static final int EQUALS=31;
    public static final int ONE=21;
    public static final int ROTATE=28;
    public static final int CINIT=16;
    public static final int EOF=-1;
    public static final int LINE=23;
    public static final int ZTERM=13;
    public static final int IFS=6;
    public static final int AXIOM=8;
    public static final int PRODUCTIONS=12;
    public static final int PROG=4;
    public static final int WS=30;
    public static final int DBL=22;
    public static final int PRODUCTION=11;
    public static final int DOUBLE=26;
    public static final int ARROW=24;
    public static final int ANGLE_NUMBER=25;
    public static final int MANDELBROT=17;
    public static final int CTERM=19;
    public static final int ADD=14;

        public NAFLTranslator(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g"; }



    // $ANTLR start fractal
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:14:1: fractal returns [Fractal f] : ( ^( LSYSTEM ax= axiom_rule an= angle_rule pr= production_rule ) | ^( FORMULA ff= formula ) | ^( FORMULA ff= formula c= c_init ) );
    public final Fractal fractal() throws RecognitionException {
        Fractal f = null;

        String ax = null;

        int an = 0;

        production_rule_return pr = null;

        formula_return ff = null;

        c_init_return c = null;


        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:14:29: ( ^( LSYSTEM ax= axiom_rule an= angle_rule pr= production_rule ) | ^( FORMULA ff= formula ) | ^( FORMULA ff= formula c= c_init ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:15:2: ^( LSYSTEM ax= axiom_rule an= angle_rule pr= production_rule )
                    {
                     f = null;
                    match(input,LSYSTEM,FOLLOW_LSYSTEM_in_fractal49); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_axiom_rule_in_fractal53);
                    ax=axiom_rule();
                    _fsp--;

                    pushFollow(FOLLOW_angle_rule_in_fractal57);
                    an=angle_rule();
                    _fsp--;

                    pushFollow(FOLLOW_production_rule_in_fractal61);
                    pr=production_rule();
                    _fsp--;


                    match(input, Token.UP, null); 

                                String[] prodsL = pr.prodsL.toArray(new String[0]);
                                String[] prodsR = pr.prodsR.toArray(new String[0]);
                                f = new LSystemFractal(ax, prodsL, prodsR, an);
                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:22:10: ^( FORMULA ff= formula )
                    {
                    match(input,FORMULA,FOLLOW_FORMULA_in_fractal77); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_formula_in_fractal81);
                    ff=formula();
                    _fsp--;


                    match(input, Token.UP, null); 

                                int[] zExp = new int[ff.zExp.size()];
                                boolean[] zSgn = new boolean[ff.zSgn.size()];
                                for(int i=0; i<ff.zSgn.size(); i++) {
                                    zExp[i] = ff.zExp.get(i);
                                    zSgn[i] = ff.zSgn.get(i);
                                }
                                f = new FormulaFractal(zExp, zSgn, ff.cExp, ff.cSgn, FormulaFractal.formulaType.MANDELBROT);
                            

                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:32:10: ^( FORMULA ff= formula c= c_init )
                    {
                    match(input,FORMULA,FOLLOW_FORMULA_in_fractal104); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_formula_in_fractal108);
                    ff=formula();
                    _fsp--;

                    pushFollow(FOLLOW_c_init_in_fractal112);
                    c=c_init();
                    _fsp--;


                    match(input, Token.UP, null); 

                                int[] zExp = new int[ff.zExp.size()];
                                boolean[] zSgn = new boolean[ff.zSgn.size()];
                                for(int i=0; i<ff.zSgn.size(); i++) {
                                    zExp[i] = ff.zExp.get(i);
                                    zSgn[i] = ff.zSgn.get(i);
                                }
                                f = new FormulaFractal(zExp, zSgn, ff.cExp, ff.cSgn, FormulaFractal.formulaType.JULIA, c.re, c.im);
                            

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return f;
    }
    // $ANTLR end fractal


    // $ANTLR start axiom_rule
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:45:1: axiom_rule returns [String ax] : ( ^( AXIOM r= RULE ) | ^( AXIOM l= LINE ) );
    public final String axiom_rule() throws RecognitionException {
        String ax = null;

        CommonTree r=null;
        CommonTree l=null;

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:45:31: ( ^( AXIOM r= RULE ) | ^( AXIOM l= LINE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==AXIOM) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==LINE) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==RULE) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("45:1: axiom_rule returns [String ax] : ( ^( AXIOM r= RULE ) | ^( AXIOM l= LINE ) );", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("45:1: axiom_rule returns [String ax] : ( ^( AXIOM r= RULE ) | ^( AXIOM l= LINE ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("45:1: axiom_rule returns [String ax] : ( ^( AXIOM r= RULE ) | ^( AXIOM l= LINE ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:46:2: ^( AXIOM r= RULE )
                    {
                    ax = null;
                    match(input,AXIOM,FOLLOW_AXIOM_in_axiom_rule141); 

                    match(input, Token.DOWN, null); 
                    r=(CommonTree)input.LT(1);
                    match(input,RULE,FOLLOW_RULE_in_axiom_rule145); 

                    match(input, Token.UP, null); 
                    ax = r.getText();

                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:48:11: ^( AXIOM l= LINE )
                    {
                    match(input,AXIOM,FOLLOW_AXIOM_in_axiom_rule161); 

                    match(input, Token.DOWN, null); 
                    l=(CommonTree)input.LT(1);
                    match(input,LINE,FOLLOW_LINE_in_axiom_rule165); 

                    match(input, Token.UP, null); 
                    ax = l.getText();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ax;
    }
    // $ANTLR end axiom_rule


    // $ANTLR start angle_rule
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:50:1: angle_rule returns [int angle] : ^( ANGLE a= ANGLE_NUMBER ) ;
    public final int angle_rule() throws RecognitionException {
        int angle = 0;

        CommonTree a=null;

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:50:31: ( ^( ANGLE a= ANGLE_NUMBER ) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:51:2: ^( ANGLE a= ANGLE_NUMBER )
            {
            angle = 0;
            match(input,ANGLE,FOLLOW_ANGLE_in_angle_rule189); 

            match(input, Token.DOWN, null); 
            a=(CommonTree)input.LT(1);
            match(input,ANGLE_NUMBER,FOLLOW_ANGLE_NUMBER_in_angle_rule193); 

            match(input, Token.UP, null); 
            angle = Integer.parseInt(a.getText());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return angle;
    }
    // $ANTLR end angle_rule

    public static class production_rule_return extends TreeRuleReturnScope {
        public Vector<String> prodsL;
        public Vector<String> prodsR;
    };

    // $ANTLR start production_rule
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:54:1: production_rule returns [Vector<String> prodsL, Vector<String> prodsR] : ^( PRODUCTIONS (pr= production )+ ) ;
    public final production_rule_return production_rule() throws RecognitionException {
        production_rule_return retval = new production_rule_return();
        retval.start = input.LT(1);

        production_return pr = null;


        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:54:72: ( ^( PRODUCTIONS (pr= production )+ ) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:55:3: ^( PRODUCTIONS (pr= production )+ )
            {

            	 	retval.prodsL = new Vector<String>();
            	 	retval.prodsR = new Vector<String>();
            	 
            match(input,PRODUCTIONS,FOLLOW_PRODUCTIONS_in_production_rule215); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:59:17: (pr= production )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PRODUCTION) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:59:18: pr= production
            	    {
            	    pushFollow(FOLLOW_production_in_production_rule220);
            	    pr=production();
            	    _fsp--;

            	     retval.prodsL.add(pr.l); retval.prodsR.add(pr.r); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end production_rule

    public static class production_return extends TreeRuleReturnScope {
        public String l;
        public String r;
    };

    // $ANTLR start production
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:61:1: production returns [String l, String r] : ( ^( PRODUCTION l1= LINE l2= LINE ) | ^( PRODUCTION line= LINE rule= RULE ) );
    public final production_return production() throws RecognitionException {
        production_return retval = new production_return();
        retval.start = input.LT(1);

        CommonTree l1=null;
        CommonTree l2=null;
        CommonTree line=null;
        CommonTree rule=null;

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:61:40: ( ^( PRODUCTION l1= LINE l2= LINE ) | ^( PRODUCTION line= LINE rule= RULE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PRODUCTION) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==DOWN) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==LINE) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==LINE) ) {
                            alt4=1;
                        }
                        else if ( (LA4_3==RULE) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("61:1: production returns [String l, String r] : ( ^( PRODUCTION l1= LINE l2= LINE ) | ^( PRODUCTION line= LINE rule= RULE ) );", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("61:1: production returns [String l, String r] : ( ^( PRODUCTION l1= LINE l2= LINE ) | ^( PRODUCTION line= LINE rule= RULE ) );", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("61:1: production returns [String l, String r] : ( ^( PRODUCTION l1= LINE l2= LINE ) | ^( PRODUCTION line= LINE rule= RULE ) );", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("61:1: production returns [String l, String r] : ( ^( PRODUCTION l1= LINE l2= LINE ) | ^( PRODUCTION line= LINE rule= RULE ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:62:2: ^( PRODUCTION l1= LINE l2= LINE )
                    {
                    match(input,PRODUCTION,FOLLOW_PRODUCTION_in_production238); 

                    match(input, Token.DOWN, null); 
                    l1=(CommonTree)input.LT(1);
                    match(input,LINE,FOLLOW_LINE_in_production242); 
                    l2=(CommonTree)input.LT(1);
                    match(input,LINE,FOLLOW_LINE_in_production246); 

                    match(input, Token.UP, null); 
                     retval.l = l1.getText(); retval.r = l2.getText(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:63:4: ^( PRODUCTION line= LINE rule= RULE )
                    {
                    match(input,PRODUCTION,FOLLOW_PRODUCTION_in_production255); 

                    match(input, Token.DOWN, null); 
                    line=(CommonTree)input.LT(1);
                    match(input,LINE,FOLLOW_LINE_in_production259); 
                    rule=(CommonTree)input.LT(1);
                    match(input,RULE,FOLLOW_RULE_in_production263); 

                    match(input, Token.UP, null); 
                     retval.l = line.getText(); retval.r = rule.getText(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end production

    public static class formula_return extends TreeRuleReturnScope {
        public Vector<Integer> zExp;
        public Vector<Boolean> zSgn;
        public int cExp;
        public boolean cSgn;
    };

    // $ANTLR start formula
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:66:1: formula returns [Vector<Integer> zExp, Vector<Boolean> zSgn, int cExp, boolean cSgn] : ( ^( ADD z= z_expr c= c_expr ) | ^( SUB z= z_expr c= c_expr ) );
    public final formula_return formula() throws RecognitionException {
        formula_return retval = new formula_return();
        retval.start = input.LT(1);

        z_expr_return z = null;

        int c = 0;


        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:66:85: ( ^( ADD z= z_expr c= c_expr ) | ^( SUB z= z_expr c= c_expr ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ADD) ) {
                alt5=1;
            }
            else if ( (LA5_0==SUB) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("66:1: formula returns [Vector<Integer> zExp, Vector<Boolean> zSgn, int cExp, boolean cSgn] : ( ^( ADD z= z_expr c= c_expr ) | ^( SUB z= z_expr c= c_expr ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:67:5: ^( ADD z= z_expr c= c_expr )
                    {
                    match(input,ADD,FOLLOW_ADD_in_formula283); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_z_expr_in_formula287);
                    z=z_expr();
                    _fsp--;

                    pushFollow(FOLLOW_c_expr_in_formula291);
                    c=c_expr();
                    _fsp--;


                    match(input, Token.UP, null); 

                            retval.zExp = z.zExp;
                            retval.zSgn = z.zSgn;
                            retval.cExp = c;
                            retval.cSgn = true;
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:74:6: ^( SUB z= z_expr c= c_expr )
                    {
                    match(input,SUB,FOLLOW_SUB_in_formula306); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_z_expr_in_formula310);
                    z=z_expr();
                    _fsp--;

                    pushFollow(FOLLOW_c_expr_in_formula314);
                    c=c_expr();
                    _fsp--;


                    match(input, Token.UP, null); 

                            retval.zExp = z.zExp;
                            retval.zSgn = z.zSgn;
                            retval.cExp = c;
                            retval.cSgn = false;
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end formula

    public static class z_expr_return extends TreeRuleReturnScope {
        public Vector<Integer> zExp;
        public Vector<Boolean> zSgn;
    };

    // $ANTLR start z_expr
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:81:1: z_expr returns [Vector<Integer> zExp, Vector<Boolean> zSgn] : ^( ZPOLY (z= z_sgn_pow_expr )+ ) ;
    public final z_expr_return z_expr() throws RecognitionException {
        z_expr_return retval = new z_expr_return();
        retval.start = input.LT(1);

        z_sgn_pow_expr_return z = null;


        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:81:60: ( ^( ZPOLY (z= z_sgn_pow_expr )+ ) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:82:5: ^( ZPOLY (z= z_sgn_pow_expr )+ )
            {

                    retval.zExp = new Vector<Integer>();
                    retval.zSgn = new Vector<Boolean>();
                
            match(input,ZPOLY,FOLLOW_ZPOLY_in_z_expr342); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:86:13: (z= z_sgn_pow_expr )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=ADD && LA6_0<=SUB)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:86:14: z= z_sgn_pow_expr
            	    {
            	    pushFollow(FOLLOW_z_sgn_pow_expr_in_z_expr347);
            	    z=z_sgn_pow_expr();
            	    _fsp--;

            	     retval.zExp.add(z.exp); retval.zSgn.add(z.sgn);

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end z_expr

    public static class z_sgn_pow_expr_return extends TreeRuleReturnScope {
        public int exp;
        public boolean sgn;
    };

    // $ANTLR start z_sgn_pow_expr
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );
    public final z_sgn_pow_expr_return z_sgn_pow_expr() throws RecognitionException {
        z_sgn_pow_expr_return retval = new z_sgn_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree n=null;

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:87:46: ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ADD) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==ZTERM) ) {
                        int LA7_5 = input.LA(4);

                        if ( (LA7_5==DOWN) ) {
                            int LA7_7 = input.LA(5);

                            if ( (LA7_7==ANGLE_NUMBER||LA7_7==NUMBER) ) {
                                alt7=1;
                            }
                            else if ( (LA7_7==ONE) ) {
                                alt7=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );", 7, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );", 7, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==SUB) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==DOWN) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==ZTERM) ) {
                        int LA7_6 = input.LA(4);

                        if ( (LA7_6==DOWN) ) {
                            int LA7_8 = input.LA(5);

                            if ( (LA7_8==ANGLE_NUMBER||LA7_8==NUMBER) ) {
                                alt7=2;
                            }
                            else if ( (LA7_8==ONE) ) {
                                alt7=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );", 7, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );", 7, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );", 7, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("87:1: z_sgn_pow_expr returns [int exp, boolean sgn] : ( ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) ) | ^( ADD ^( ZTERM ONE ) ) | ^( SUB ^( ZTERM ONE ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:88:5: ^( ADD ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) )
                    {
                    match(input,ADD,FOLLOW_ADD_in_z_sgn_pow_expr367); 

                    match(input, Token.DOWN, null); 
                    match(input,ZTERM,FOLLOW_ZTERM_in_z_sgn_pow_expr370); 

                    match(input, Token.DOWN, null); 
                    n=(CommonTree)input.LT(1);
                    if ( input.LA(1)==ANGLE_NUMBER||input.LA(1)==NUMBER ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_z_sgn_pow_expr374);    throw mse;
                    }


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                            retval.exp = Integer.parseInt(n.getText());
                            retval.sgn = true;
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:93:6: ^( SUB ^( ZTERM n= ( NUMBER | ANGLE_NUMBER ) ) )
                    {
                    match(input,SUB,FOLLOW_SUB_in_z_sgn_pow_expr394); 

                    match(input, Token.DOWN, null); 
                    match(input,ZTERM,FOLLOW_ZTERM_in_z_sgn_pow_expr397); 

                    match(input, Token.DOWN, null); 
                    n=(CommonTree)input.LT(1);
                    if ( input.LA(1)==ANGLE_NUMBER||input.LA(1)==NUMBER ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_z_sgn_pow_expr401);    throw mse;
                    }


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                            retval.exp = Integer.parseInt(n.getText());
                            retval.sgn = false;
                        

                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:98:6: ^( ADD ^( ZTERM ONE ) )
                    {
                    match(input,ADD,FOLLOW_ADD_in_z_sgn_pow_expr421); 

                    match(input, Token.DOWN, null); 
                    match(input,ZTERM,FOLLOW_ZTERM_in_z_sgn_pow_expr424); 

                    match(input, Token.DOWN, null); 
                    match(input,ONE,FOLLOW_ONE_in_z_sgn_pow_expr426); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                            retval.exp = 1;
                            retval.sgn = true;
                        

                    }
                    break;
                case 4 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:103:6: ^( SUB ^( ZTERM ONE ) )
                    {
                    match(input,SUB,FOLLOW_SUB_in_z_sgn_pow_expr442); 

                    match(input, Token.DOWN, null); 
                    match(input,ZTERM,FOLLOW_ZTERM_in_z_sgn_pow_expr445); 

                    match(input, Token.DOWN, null); 
                    match(input,ONE,FOLLOW_ONE_in_z_sgn_pow_expr447); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                            retval.exp = 1;
                            retval.sgn = false;
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end z_sgn_pow_expr


    // $ANTLR start c_expr
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:108:1: c_expr returns [int cExp] : ( ^( CTERM n= ( NUMBER | ANGLE_NUMBER ) ) | ^( CTERM ONE ) );
    public final int c_expr() throws RecognitionException {
        int cExp = 0;

        CommonTree n=null;

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:108:26: ( ^( CTERM n= ( NUMBER | ANGLE_NUMBER ) ) | ^( CTERM ONE ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CTERM) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOWN) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==ANGLE_NUMBER||LA8_2==NUMBER) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==ONE) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: c_expr returns [int cExp] : ( ^( CTERM n= ( NUMBER | ANGLE_NUMBER ) ) | ^( CTERM ONE ) );", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: c_expr returns [int cExp] : ( ^( CTERM n= ( NUMBER | ANGLE_NUMBER ) ) | ^( CTERM ONE ) );", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("108:1: c_expr returns [int cExp] : ( ^( CTERM n= ( NUMBER | ANGLE_NUMBER ) ) | ^( CTERM ONE ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:109:5: ^( CTERM n= ( NUMBER | ANGLE_NUMBER ) )
                    {
                    match(input,CTERM,FOLLOW_CTERM_in_c_expr470); 

                    match(input, Token.DOWN, null); 
                    n=(CommonTree)input.LT(1);
                    if ( input.LA(1)==ANGLE_NUMBER||input.LA(1)==NUMBER ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_c_expr474);    throw mse;
                    }


                    match(input, Token.UP, null); 

                            cExp = Integer.parseInt(n.getText());
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:113:6: ^( CTERM ONE )
                    {
                    match(input,CTERM,FOLLOW_CTERM_in_c_expr493); 

                    match(input, Token.DOWN, null); 
                    match(input,ONE,FOLLOW_ONE_in_c_expr495); 

                    match(input, Token.UP, null); 

                            cExp = 1;
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cExp;
    }
    // $ANTLR end c_expr

    public static class c_init_return extends TreeRuleReturnScope {
        public double re;
        public double im;
    };

    // $ANTLR start c_init
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:117:1: c_init returns [double re, double im] : ^( CINIT ding= double_vachgj dong= double_vachgj ) ;
    public final c_init_return c_init() throws RecognitionException {
        c_init_return retval = new c_init_return();
        retval.start = input.LT(1);

        double ding = 0.0;

        double dong = 0.0;


        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:117:38: ( ^( CINIT ding= double_vachgj dong= double_vachgj ) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:118:5: ^( CINIT ding= double_vachgj dong= double_vachgj )
            {
            match(input,CINIT,FOLLOW_CINIT_in_c_init517); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_double_vachgj_in_c_init521);
            ding=double_vachgj();
            _fsp--;

            pushFollow(FOLLOW_double_vachgj_in_c_init525);
            dong=double_vachgj();
            _fsp--;


            match(input, Token.UP, null); 

                    retval.re = ding;
                    retval.im = dong;
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end c_init


    // $ANTLR start double_vachgj
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:123:1: double_vachgj returns [double dd] : ( ^( DBL d= DOUBLE ) | ^( DBL n= NUMBER ) | ^( DBL a= ANGLE_NUMBER ) );
    public final double double_vachgj() throws RecognitionException {
        double dd = 0.0;

        CommonTree d=null;
        CommonTree n=null;
        CommonTree a=null;

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:123:34: ( ^( DBL d= DOUBLE ) | ^( DBL n= NUMBER ) | ^( DBL a= ANGLE_NUMBER ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DBL) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case DOUBLE:
                        {
                        alt9=1;
                        }
                        break;
                    case NUMBER:
                        {
                        alt9=2;
                        }
                        break;
                    case ANGLE_NUMBER:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("123:1: double_vachgj returns [double dd] : ( ^( DBL d= DOUBLE ) | ^( DBL n= NUMBER ) | ^( DBL a= ANGLE_NUMBER ) );", 9, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("123:1: double_vachgj returns [double dd] : ( ^( DBL d= DOUBLE ) | ^( DBL n= NUMBER ) | ^( DBL a= ANGLE_NUMBER ) );", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("123:1: double_vachgj returns [double dd] : ( ^( DBL d= DOUBLE ) | ^( DBL n= NUMBER ) | ^( DBL a= ANGLE_NUMBER ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:124:5: ^( DBL d= DOUBLE )
                    {
                    match(input,DBL,FOLLOW_DBL_in_double_vachgj547); 

                    match(input, Token.DOWN, null); 
                    d=(CommonTree)input.LT(1);
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_double_vachgj551); 

                    match(input, Token.UP, null); 
                     dd = Double.parseDouble(d.getText()); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:125:7: ^( DBL n= NUMBER )
                    {
                    match(input,DBL,FOLLOW_DBL_in_double_vachgj563); 

                    match(input, Token.DOWN, null); 
                    n=(CommonTree)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_double_vachgj567); 

                    match(input, Token.UP, null); 
                     dd = Double.parseDouble(n.getText());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFLTranslator.g:126:7: ^( DBL a= ANGLE_NUMBER )
                    {
                    match(input,DBL,FOLLOW_DBL_in_double_vachgj579); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)input.LT(1);
                    match(input,ANGLE_NUMBER,FOLLOW_ANGLE_NUMBER_in_double_vachgj583); 

                    match(input, Token.UP, null); 
                     dd = Double.parseDouble(a.getText());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return dd;
    }
    // $ANTLR end double_vachgj


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\106\uffff";
    static final String DFA1_eofS =
        "\106\uffff";
    static final String DFA1_minS =
        "\1\5\1\uffff\1\2\1\16\2\2\2\24\2\2\2\16\4\2\4\15\4\2\4\25\30\3\2"+
        "\23\2\2\2\25\12\3\2\uffff";
    static final String DFA1_maxS =
        "\1\7\1\uffff\1\2\1\17\2\2\2\24\2\2\2\17\4\2\4\15\4\2\4\33\20\3\10"+
        "\17\2\23\2\2\2\33\10\3\2\20\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\102\uffff\1\2\1\3";
    static final String DFA1_specialS =
        "\106\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\uffff\1\2",
            "",
            "\1\3",
            "\1\4\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\16\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34\3\uffff\1\35\1\uffff\1\35",
            "\1\36\3\uffff\1\37\1\uffff\1\37",
            "\1\41\3\uffff\1\40\1\uffff\1\40",
            "\1\42\3\uffff\1\43\1\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\12\uffff\1\14\1\15",
            "\1\64\12\uffff\1\14\1\15",
            "\1\64\12\uffff\1\14\1\15",
            "\1\64\12\uffff\1\14\1\15",
            "\1\65\12\uffff\1\16\1\17",
            "\1\65\12\uffff\1\16\1\17",
            "\1\65\12\uffff\1\16\1\17",
            "\1\65\12\uffff\1\16\1\17",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\73\3\uffff\1\72\1\uffff\1\72",
            "\1\74\3\uffff\1\75\1\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\103",
            "\1\104\14\uffff\1\105",
            "\1\104\14\uffff\1\105",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "14:1: fractal returns [Fractal f] : ( ^( LSYSTEM ax= axiom_rule an= angle_rule pr= production_rule ) | ^( FORMULA ff= formula ) | ^( FORMULA ff= formula c= c_init ) );";
        }
    }
 

    public static final BitSet FOLLOW_LSYSTEM_in_fractal49 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_axiom_rule_in_fractal53 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_angle_rule_in_fractal57 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_production_rule_in_fractal61 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULA_in_fractal77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_fractal81 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULA_in_fractal104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_fractal108 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_c_init_in_fractal112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AXIOM_in_axiom_rule141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_in_axiom_rule145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AXIOM_in_axiom_rule161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LINE_in_axiom_rule165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANGLE_in_angle_rule189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ANGLE_NUMBER_in_angle_rule193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRODUCTIONS_in_production_rule215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_production_in_production_rule220 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_PRODUCTION_in_production238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LINE_in_production242 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LINE_in_production246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRODUCTION_in_production255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LINE_in_production259 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_in_production263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_formula283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z_expr_in_formula287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_c_expr_in_formula291 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_in_formula306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z_expr_in_formula310 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_c_expr_in_formula314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ZPOLY_in_z_expr342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z_sgn_pow_expr_in_z_expr347 = new BitSet(new long[]{0x000000000000C008L});
    public static final BitSet FOLLOW_ADD_in_z_sgn_pow_expr367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ZTERM_in_z_sgn_pow_expr370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_z_sgn_pow_expr374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_in_z_sgn_pow_expr394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ZTERM_in_z_sgn_pow_expr397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_z_sgn_pow_expr401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_z_sgn_pow_expr421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ZTERM_in_z_sgn_pow_expr424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONE_in_z_sgn_pow_expr426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_in_z_sgn_pow_expr442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ZTERM_in_z_sgn_pow_expr445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONE_in_z_sgn_pow_expr447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CTERM_in_c_expr470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_c_expr474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CTERM_in_c_expr493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONE_in_c_expr495 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CINIT_in_c_init517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_double_vachgj_in_c_init521 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_double_vachgj_in_c_init525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DBL_in_double_vachgj547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_in_double_vachgj551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DBL_in_double_vachgj563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_double_vachgj567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DBL_in_double_vachgj579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ANGLE_NUMBER_in_double_vachgj583 = new BitSet(new long[]{0x0000000000000008L});

}