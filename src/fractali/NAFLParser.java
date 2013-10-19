// $ANTLR 3.0.1 C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g 2010-06-14 00:34:35

    package fractali;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class NAFLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "LSYSTEM", "IFS", "FORMULA", "AXIOM", "RULE", "ANGLE", "PRODUCTION", "PRODUCTIONS", "ZTERM", "ADD", "SUB", "CINIT", "MANDELBROT", "JULIA", "CTERM", "ZPOLY", "ONE", "DBL", "LINE", "ARROW", "ANGLE_NUMBER", "DOUBLE", "NUMBER", "ROTATE", "EXPONENT", "WS", "EQUALS", "'lsystem'", "'productions'", "'axiom'", "'angle'", "'formula'", "'c'", "'('", "','", "')'", "'z'", "'+'", "'-'", "'^'", "'ifs'"
    };
    public static final int ZPOLY=20;
    public static final int EXPONENT=29;
    public static final int FORMULA=7;
    public static final int RULE=9;
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
    public static final int IFS=6;
    public static final int AXIOM=8;
    public static final int ZTERM=13;
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

        public NAFLParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start program
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:45:1: program : ( lsystem_type | ifs_type | formula_type );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        lsystem_type_return lsystem_type1 = null;

        ifs_type_return ifs_type2 = null;

        formula_type_return formula_type3 = null;



        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:45:13: ( lsystem_type | ifs_type | formula_type )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 45:
                {
                alt1=2;
                }
                break;
            case 36:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("45:1: program : ( lsystem_type | ifs_type | formula_type );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:45:19: lsystem_type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lsystem_type_in_program206);
                    lsystem_type1=lsystem_type();
                    _fsp--;

                    adaptor.addChild(root_0, lsystem_type1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:45:34: ifs_type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifs_type_in_program210);
                    ifs_type2=ifs_type();
                    _fsp--;

                    adaptor.addChild(root_0, ifs_type2.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:45:45: formula_type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formula_type_in_program214);
                    formula_type3=formula_type();
                    _fsp--;

                    adaptor.addChild(root_0, formula_type3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end program

    public static class lsystem_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lsystem_type
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:46:1: lsystem_type : 'lsystem' axiom_rule angle_rule production_rule -> ^( LSYSTEM axiom_rule angle_rule production_rule ) ;
    public final lsystem_type_return lsystem_type() throws RecognitionException {
        lsystem_type_return retval = new lsystem_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal4=null;
        axiom_rule_return axiom_rule5 = null;

        angle_rule_return angle_rule6 = null;

        production_rule_return production_rule7 = null;


        Object string_literal4_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_production_rule=new RewriteRuleSubtreeStream(adaptor,"rule production_rule");
        RewriteRuleSubtreeStream stream_angle_rule=new RewriteRuleSubtreeStream(adaptor,"rule angle_rule");
        RewriteRuleSubtreeStream stream_axiom_rule=new RewriteRuleSubtreeStream(adaptor,"rule axiom_rule");
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:46:17: ( 'lsystem' axiom_rule angle_rule production_rule -> ^( LSYSTEM axiom_rule angle_rule production_rule ) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:46:22: 'lsystem' axiom_rule angle_rule production_rule
            {
            string_literal4=(Token)input.LT(1);
            match(input,32,FOLLOW_32_in_lsystem_type227); 
            stream_32.add(string_literal4);

            pushFollow(FOLLOW_axiom_rule_in_lsystem_type229);
            axiom_rule5=axiom_rule();
            _fsp--;

            stream_axiom_rule.add(axiom_rule5.getTree());
            pushFollow(FOLLOW_angle_rule_in_lsystem_type231);
            angle_rule6=angle_rule();
            _fsp--;

            stream_angle_rule.add(angle_rule6.getTree());
            pushFollow(FOLLOW_production_rule_in_lsystem_type233);
            production_rule7=production_rule();
            _fsp--;

            stream_production_rule.add(production_rule7.getTree());

            // AST REWRITE
            // elements: angle_rule, axiom_rule, production_rule
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:4: -> ^( LSYSTEM axiom_rule angle_rule production_rule )
            {
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:47:7: ^( LSYSTEM axiom_rule angle_rule production_rule )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(LSYSTEM, "LSYSTEM"), root_1);

                adaptor.addChild(root_1, stream_axiom_rule.next());
                adaptor.addChild(root_1, stream_angle_rule.next());
                adaptor.addChild(root_1, stream_production_rule.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lsystem_type

    public static class production_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start production
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:48:1: production : ( LINE ARROW RULE -> ^( PRODUCTION LINE RULE ) | LINE ARROW LINE -> ^( PRODUCTION LINE LINE ) );
    public final production_return production() throws RecognitionException {
        production_return retval = new production_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE8=null;
        Token ARROW9=null;
        Token RULE10=null;
        Token LINE11=null;
        Token ARROW12=null;
        Token LINE13=null;

        Object LINE8_tree=null;
        Object ARROW9_tree=null;
        Object RULE10_tree=null;
        Object LINE11_tree=null;
        Object ARROW12_tree=null;
        Object LINE13_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RULE=new RewriteRuleTokenStream(adaptor,"token RULE");
        RewriteRuleTokenStream stream_LINE=new RewriteRuleTokenStream(adaptor,"token LINE");

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:49:2: ( LINE ARROW RULE -> ^( PRODUCTION LINE RULE ) | LINE ARROW LINE -> ^( PRODUCTION LINE LINE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LINE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ARROW) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==LINE) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("48:1: production : ( LINE ARROW RULE -> ^( PRODUCTION LINE RULE ) | LINE ARROW LINE -> ^( PRODUCTION LINE LINE ) );", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("48:1: production : ( LINE ARROW RULE -> ^( PRODUCTION LINE RULE ) | LINE ARROW LINE -> ^( PRODUCTION LINE LINE ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("48:1: production : ( LINE ARROW RULE -> ^( PRODUCTION LINE RULE ) | LINE ARROW LINE -> ^( PRODUCTION LINE LINE ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:49:6: LINE ARROW RULE
                    {
                    LINE8=(Token)input.LT(1);
                    match(input,LINE,FOLLOW_LINE_in_production258); 
                    stream_LINE.add(LINE8);

                    ARROW9=(Token)input.LT(1);
                    match(input,ARROW,FOLLOW_ARROW_in_production260); 
                    stream_ARROW.add(ARROW9);

                    RULE10=(Token)input.LT(1);
                    match(input,RULE,FOLLOW_RULE_in_production262); 
                    stream_RULE.add(RULE10);


                    // AST REWRITE
                    // elements: LINE, RULE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:22: -> ^( PRODUCTION LINE RULE )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:49:25: ^( PRODUCTION LINE RULE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(PRODUCTION, "PRODUCTION"), root_1);

                        adaptor.addChild(root_1, stream_LINE.next());
                        adaptor.addChild(root_1, stream_RULE.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:50:7: LINE ARROW LINE
                    {
                    LINE11=(Token)input.LT(1);
                    match(input,LINE,FOLLOW_LINE_in_production280); 
                    stream_LINE.add(LINE11);

                    ARROW12=(Token)input.LT(1);
                    match(input,ARROW,FOLLOW_ARROW_in_production282); 
                    stream_ARROW.add(ARROW12);

                    LINE13=(Token)input.LT(1);
                    match(input,LINE,FOLLOW_LINE_in_production284); 
                    stream_LINE.add(LINE13);


                    // AST REWRITE
                    // elements: LINE, LINE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:23: -> ^( PRODUCTION LINE LINE )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:50:26: ^( PRODUCTION LINE LINE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(PRODUCTION, "PRODUCTION"), root_1);

                        adaptor.addChild(root_1, stream_LINE.next());
                        adaptor.addChild(root_1, stream_LINE.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class production_rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start production_rule
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:51:1: production_rule : 'productions' ( production )+ -> ^( PRODUCTIONS ( production )+ ) ;
    public final production_rule_return production_rule() throws RecognitionException {
        production_rule_return retval = new production_rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;
        production_return production15 = null;


        Object string_literal14_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_production=new RewriteRuleSubtreeStream(adaptor,"rule production");
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:51:20: ( 'productions' ( production )+ -> ^( PRODUCTIONS ( production )+ ) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:51:25: 'productions' ( production )+
            {
            string_literal14=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_production_rule307); 
            stream_33.add(string_literal14);

            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:51:39: ( production )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==LINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:51:39: production
            	    {
            	    pushFollow(FOLLOW_production_in_production_rule309);
            	    production15=production();
            	    _fsp--;

            	    stream_production.add(production15.getTree());

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


            // AST REWRITE
            // elements: production
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 51:51: -> ^( PRODUCTIONS ( production )+ )
            {
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:51:54: ^( PRODUCTIONS ( production )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(PRODUCTIONS, "PRODUCTIONS"), root_1);

                if ( !(stream_production.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_production.hasNext() ) {
                    adaptor.addChild(root_1, stream_production.next());

                }
                stream_production.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class axiom_rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start axiom_rule
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:52:1: axiom_rule : ( 'axiom' RULE -> ^( AXIOM RULE ) | 'axiom' LINE -> ^( AXIOM LINE ) );
    public final axiom_rule_return axiom_rule() throws RecognitionException {
        axiom_rule_return retval = new axiom_rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal16=null;
        Token RULE17=null;
        Token string_literal18=null;
        Token LINE19=null;

        Object string_literal16_tree=null;
        Object RULE17_tree=null;
        Object string_literal18_tree=null;
        Object LINE19_tree=null;
        RewriteRuleTokenStream stream_RULE=new RewriteRuleTokenStream(adaptor,"token RULE");
        RewriteRuleTokenStream stream_LINE=new RewriteRuleTokenStream(adaptor,"token LINE");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:52:15: ( 'axiom' RULE -> ^( AXIOM RULE ) | 'axiom' LINE -> ^( AXIOM LINE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==LINE) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("52:1: axiom_rule : ( 'axiom' RULE -> ^( AXIOM RULE ) | 'axiom' LINE -> ^( AXIOM LINE ) );", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("52:1: axiom_rule : ( 'axiom' RULE -> ^( AXIOM RULE ) | 'axiom' LINE -> ^( AXIOM LINE ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:52:20: 'axiom' RULE
                    {
                    string_literal16=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_axiom_rule332); 
                    stream_34.add(string_literal16);

                    RULE17=(Token)input.LT(1);
                    match(input,RULE,FOLLOW_RULE_in_axiom_rule334); 
                    stream_RULE.add(RULE17);


                    // AST REWRITE
                    // elements: RULE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:4: -> ^( AXIOM RULE )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:53:7: ^( AXIOM RULE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(AXIOM, "AXIOM"), root_1);

                        adaptor.addChild(root_1, stream_RULE.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:54:23: 'axiom' LINE
                    {
                    string_literal18=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_axiom_rule369); 
                    stream_34.add(string_literal18);

                    LINE19=(Token)input.LT(1);
                    match(input,LINE,FOLLOW_LINE_in_axiom_rule371); 
                    stream_LINE.add(LINE19);


                    // AST REWRITE
                    // elements: LINE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 55:25: -> ^( AXIOM LINE )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:55:28: ^( AXIOM LINE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(AXIOM, "AXIOM"), root_1);

                        adaptor.addChild(root_1, stream_LINE.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end axiom_rule

    public static class angle_rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start angle_rule
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:58:1: angle_rule : 'angle' angle -> ^( ANGLE angle ) ;
    public final angle_rule_return angle_rule() throws RecognitionException {
        angle_rule_return retval = new angle_rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal20=null;
        angle_return angle21 = null;


        Object string_literal20_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_angle=new RewriteRuleSubtreeStream(adaptor,"rule angle");
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:58:15: ( 'angle' angle -> ^( ANGLE angle ) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:58:20: 'angle' angle
            {
            string_literal20=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_angle_rule418); 
            stream_35.add(string_literal20);

            pushFollow(FOLLOW_angle_in_angle_rule420);
            angle21=angle();
            _fsp--;

            stream_angle.add(angle21.getTree());

            // AST REWRITE
            // elements: angle
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:34: -> ^( ANGLE angle )
            {
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:58:37: ^( ANGLE angle )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ANGLE, "ANGLE"), root_1);

                adaptor.addChild(root_1, stream_angle.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end angle_rule

    public static class angle_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start angle
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:59:1: angle : ANGLE_NUMBER ;
    public final angle_return angle() throws RecognitionException {
        angle_return retval = new angle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANGLE_NUMBER22=null;

        Object ANGLE_NUMBER22_tree=null;

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:59:14: ( ANGLE_NUMBER )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:59:19: ANGLE_NUMBER
            {
            root_0 = (Object)adaptor.nil();

            ANGLE_NUMBER22=(Token)input.LT(1);
            match(input,ANGLE_NUMBER,FOLLOW_ANGLE_NUMBER_in_angle445); 
            ANGLE_NUMBER22_tree = (Object)adaptor.create(ANGLE_NUMBER22);
            adaptor.addChild(root_0, ANGLE_NUMBER22_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end angle

    public static class formula_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formula_type
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:62:1: formula_type : ( 'formula' formula -> ^( FORMULA formula ) | 'formula' c_init formula -> ^( FORMULA formula c_init ) | 'formula' formula c_init -> ^( FORMULA formula c_init ) );
    public final formula_type_return formula_type() throws RecognitionException {
        formula_type_return retval = new formula_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal23=null;
        Token string_literal25=null;
        Token string_literal28=null;
        formula_return formula24 = null;

        c_init_return c_init26 = null;

        formula_return formula27 = null;

        formula_return formula29 = null;

        c_init_return c_init30 = null;


        Object string_literal23_tree=null;
        Object string_literal25_tree=null;
        Object string_literal28_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_c_init=new RewriteRuleSubtreeStream(adaptor,"rule c_init");
        RewriteRuleSubtreeStream stream_formula=new RewriteRuleSubtreeStream(adaptor,"rule formula");
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:62:17: ( 'formula' formula -> ^( FORMULA formula ) | 'formula' c_init formula -> ^( FORMULA formula c_init ) | 'formula' formula c_init -> ^( FORMULA formula c_init ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:62:22: 'formula' formula
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_formula_type460); 
                    stream_36.add(string_literal23);

                    pushFollow(FOLLOW_formula_in_formula_type462);
                    formula24=formula();
                    _fsp--;

                    stream_formula.add(formula24.getTree());

                    // AST REWRITE
                    // elements: formula
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:40: -> ^( FORMULA formula )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:62:43: ^( FORMULA formula )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORMULA, "FORMULA"), root_1);

                        adaptor.addChild(root_1, stream_formula.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:63:24: 'formula' c_init formula
                    {
                    string_literal25=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_formula_type495); 
                    stream_36.add(string_literal25);

                    pushFollow(FOLLOW_c_init_in_formula_type497);
                    c_init26=c_init();
                    _fsp--;

                    stream_c_init.add(c_init26.getTree());
                    pushFollow(FOLLOW_formula_in_formula_type499);
                    formula27=formula();
                    _fsp--;

                    stream_formula.add(formula27.getTree());

                    // AST REWRITE
                    // elements: formula, c_init
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:49: -> ^( FORMULA formula c_init )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:63:52: ^( FORMULA formula c_init )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORMULA, "FORMULA"), root_1);

                        adaptor.addChild(root_1, stream_formula.next());
                        adaptor.addChild(root_1, stream_c_init.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:64:24: 'formula' formula c_init
                    {
                    string_literal28=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_formula_type534); 
                    stream_36.add(string_literal28);

                    pushFollow(FOLLOW_formula_in_formula_type536);
                    formula29=formula();
                    _fsp--;

                    stream_formula.add(formula29.getTree());
                    pushFollow(FOLLOW_c_init_in_formula_type538);
                    c_init30=c_init();
                    _fsp--;

                    stream_c_init.add(c_init30.getTree());

                    // AST REWRITE
                    // elements: formula, c_init
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:49: -> ^( FORMULA formula c_init )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:64:52: ^( FORMULA formula c_init )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORMULA, "FORMULA"), root_1);

                        adaptor.addChild(root_1, stream_formula.next());
                        adaptor.addChild(root_1, stream_c_init.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end formula_type

    public static class double_val_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start double_val
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:65:1: double_val : (d= DOUBLE -> ^( DBL $d) | n= NUMBER -> ^( DBL $n) | a= ANGLE_NUMBER -> ^( DBL $a) );
    public final double_val_return double_val() throws RecognitionException {
        double_val_return retval = new double_val_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token d=null;
        Token n=null;
        Token a=null;

        Object d_tree=null;
        Object n_tree=null;
        Object a_tree=null;
        RewriteRuleTokenStream stream_DOUBLE=new RewriteRuleTokenStream(adaptor,"token DOUBLE");
        RewriteRuleTokenStream stream_ANGLE_NUMBER=new RewriteRuleTokenStream(adaptor,"token ANGLE_NUMBER");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:65:12: (d= DOUBLE -> ^( DBL $d) | n= NUMBER -> ^( DBL $n) | a= ANGLE_NUMBER -> ^( DBL $a) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case DOUBLE:
                {
                alt6=1;
                }
                break;
            case NUMBER:
                {
                alt6=2;
                }
                break;
            case ANGLE_NUMBER:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("65:1: double_val : (d= DOUBLE -> ^( DBL $d) | n= NUMBER -> ^( DBL $n) | a= ANGLE_NUMBER -> ^( DBL $a) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:65:14: d= DOUBLE
                    {
                    d=(Token)input.LT(1);
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_double_val559); 
                    stream_DOUBLE.add(d);


                    // AST REWRITE
                    // elements: d
                    // token labels: d
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:25: -> ^( DBL $d)
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:65:28: ^( DBL $d)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(DBL, "DBL"), root_1);

                        adaptor.addChild(root_1, stream_d.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:65:40: n= NUMBER
                    {
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_double_val576); 
                    stream_NUMBER.add(n);


                    // AST REWRITE
                    // elements: n
                    // token labels: n
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:51: -> ^( DBL $n)
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:65:54: ^( DBL $n)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(DBL, "DBL"), root_1);

                        adaptor.addChild(root_1, stream_n.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:66:14: a= ANGLE_NUMBER
                    {
                    a=(Token)input.LT(1);
                    match(input,ANGLE_NUMBER,FOLLOW_ANGLE_NUMBER_in_double_val604); 
                    stream_ANGLE_NUMBER.add(a);


                    // AST REWRITE
                    // elements: a
                    // token labels: a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:31: -> ^( DBL $a)
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:66:34: ^( DBL $a)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(DBL, "DBL"), root_1);

                        adaptor.addChild(root_1, stream_a.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end double_val

    public static class c_init_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start c_init
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:67:1: c_init : 'c' '=' '(' d1= double_val ',' d2= double_val ')' -> ^( CINIT $d1 $d2) ;
    public final c_init_return c_init() throws RecognitionException {
        c_init_return retval = new c_init_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal31=null;
        Token char_literal32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal35=null;
        double_val_return d1 = null;

        double_val_return d2 = null;


        Object char_literal31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal35_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_double_val=new RewriteRuleSubtreeStream(adaptor,"rule double_val");
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:67:8: ( 'c' '=' '(' d1= double_val ',' d2= double_val ')' -> ^( CINIT $d1 $d2) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:67:10: 'c' '=' '(' d1= double_val ',' d2= double_val ')'
            {
            char_literal31=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_c_init620); 
            stream_37.add(char_literal31);

            char_literal32=(Token)input.LT(1);
            match(input,EQUALS,FOLLOW_EQUALS_in_c_init622); 
            stream_EQUALS.add(char_literal32);

            char_literal33=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_c_init624); 
            stream_38.add(char_literal33);

            pushFollow(FOLLOW_double_val_in_c_init628);
            d1=double_val();
            _fsp--;

            stream_double_val.add(d1.getTree());
            char_literal34=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_c_init630); 
            stream_39.add(char_literal34);

            pushFollow(FOLLOW_double_val_in_c_init634);
            d2=double_val();
            _fsp--;

            stream_double_val.add(d2.getTree());
            char_literal35=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_c_init636); 
            stream_40.add(char_literal35);


            // AST REWRITE
            // elements: d2, d1
            // token labels: 
            // rule labels: d1, retval, d2
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_d1=new RewriteRuleSubtreeStream(adaptor,"token d1",d1!=null?d1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_d2=new RewriteRuleSubtreeStream(adaptor,"token d2",d2!=null?d2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:58: -> ^( CINIT $d1 $d2)
            {
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:67:61: ^( CINIT $d1 $d2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CINIT, "CINIT"), root_1);

                adaptor.addChild(root_1, stream_d1.next());
                adaptor.addChild(root_1, stream_d2.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class formula_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formula
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:68:1: formula : ( 'z' '=' z_expr '+' c_expr -> ^( ADD z_expr c_expr ) | 'z' '=' z_expr '-' c_expr -> ^( SUB z_expr c_expr ) );
    public final formula_return formula() throws RecognitionException {
        formula_return retval = new formula_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        z_expr_return z_expr38 = null;

        c_expr_return c_expr40 = null;

        z_expr_return z_expr43 = null;

        c_expr_return c_expr45 = null;


        Object char_literal36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_z_expr=new RewriteRuleSubtreeStream(adaptor,"rule z_expr");
        RewriteRuleSubtreeStream stream_c_expr=new RewriteRuleSubtreeStream(adaptor,"rule c_expr");
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:68:9: ( 'z' '=' z_expr '+' c_expr -> ^( ADD z_expr c_expr ) | 'z' '=' z_expr '-' c_expr -> ^( SUB z_expr c_expr ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:68:11: 'z' '=' z_expr '+' c_expr
                    {
                    char_literal36=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_formula655); 
                    stream_41.add(char_literal36);

                    char_literal37=(Token)input.LT(1);
                    match(input,EQUALS,FOLLOW_EQUALS_in_formula657); 
                    stream_EQUALS.add(char_literal37);

                    pushFollow(FOLLOW_z_expr_in_formula659);
                    z_expr38=z_expr();
                    _fsp--;

                    stream_z_expr.add(z_expr38.getTree());
                    char_literal39=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_formula661); 
                    stream_42.add(char_literal39);

                    pushFollow(FOLLOW_c_expr_in_formula663);
                    c_expr40=c_expr();
                    _fsp--;

                    stream_c_expr.add(c_expr40.getTree());

                    // AST REWRITE
                    // elements: c_expr, z_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:37: -> ^( ADD z_expr c_expr )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:68:40: ^( ADD z_expr c_expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ADD, "ADD"), root_1);

                        adaptor.addChild(root_1, stream_z_expr.next());
                        adaptor.addChild(root_1, stream_c_expr.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:69:19: 'z' '=' z_expr '-' c_expr
                    {
                    char_literal41=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_formula693); 
                    stream_41.add(char_literal41);

                    char_literal42=(Token)input.LT(1);
                    match(input,EQUALS,FOLLOW_EQUALS_in_formula695); 
                    stream_EQUALS.add(char_literal42);

                    pushFollow(FOLLOW_z_expr_in_formula697);
                    z_expr43=z_expr();
                    _fsp--;

                    stream_z_expr.add(z_expr43.getTree());
                    char_literal44=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_formula699); 
                    stream_43.add(char_literal44);

                    pushFollow(FOLLOW_c_expr_in_formula701);
                    c_expr45=c_expr();
                    _fsp--;

                    stream_c_expr.add(c_expr45.getTree());

                    // AST REWRITE
                    // elements: z_expr, c_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:45: -> ^( SUB z_expr c_expr )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:69:48: ^( SUB z_expr c_expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(SUB, "SUB"), root_1);

                        adaptor.addChild(root_1, stream_z_expr.next());
                        adaptor.addChild(root_1, stream_c_expr.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class z_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start z_expr
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );
    public final z_expr_return z_expr() throws RecognitionException {
        z_expr_return retval = new z_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal52=null;
        z_pow_expr_return z_pow_expr46 = null;

        z_sgn_pow_expr_return z_sgn_pow_expr47 = null;

        z_pow_expr_return z_pow_expr49 = null;

        z_sgn_pow_expr_return z_sgn_pow_expr50 = null;

        z_pow_expr_return z_pow_expr51 = null;

        z_pow_expr_return z_pow_expr53 = null;


        Object char_literal48_tree=null;
        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_z_pow_expr=new RewriteRuleSubtreeStream(adaptor,"rule z_pow_expr");
        RewriteRuleSubtreeStream stream_z_sgn_pow_expr=new RewriteRuleSubtreeStream(adaptor,"rule z_sgn_pow_expr");
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:70:8: ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                switch ( input.LA(2) ) {
                case 44:
                    {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==NUMBER) ) {
                        int LA10_7 = input.LA(4);

                        if ( (LA10_7==42) ) {
                            int LA10_4 = input.LA(5);

                            if ( (LA10_4==37) ) {
                                alt10=3;
                            }
                            else if ( (LA10_4==41) ) {
                                alt10=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 4, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA10_7==43) ) {
                            int LA10_5 = input.LA(5);

                            if ( (LA10_5==41) ) {
                                alt10=1;
                            }
                            else if ( (LA10_5==37) ) {
                                alt10=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA10_3==ANGLE_NUMBER) ) {
                        int LA10_8 = input.LA(4);

                        if ( (LA10_8==42) ) {
                            int LA10_4 = input.LA(5);

                            if ( (LA10_4==37) ) {
                                alt10=3;
                            }
                            else if ( (LA10_4==41) ) {
                                alt10=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 4, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA10_8==43) ) {
                            int LA10_5 = input.LA(5);

                            if ( (LA10_5==41) ) {
                                alt10=1;
                            }
                            else if ( (LA10_5==37) ) {
                                alt10=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 42:
                    {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==37) ) {
                        alt10=3;
                    }
                    else if ( (LA10_4==41) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5==41) ) {
                        alt10=1;
                    }
                    else if ( (LA10_5==37) ) {
                        alt10=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA10_0==43) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==41) ) {
                    switch ( input.LA(3) ) {
                    case 44:
                        {
                        int LA10_11 = input.LA(4);

                        if ( (LA10_11==ANGLE_NUMBER) ) {
                            int LA10_14 = input.LA(5);

                            if ( (LA10_14==42) ) {
                                int LA10_12 = input.LA(6);

                                if ( (LA10_12==37) ) {
                                    alt10=4;
                                }
                                else if ( (LA10_12==41) ) {
                                    alt10=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 12, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA10_14==43) ) {
                                int LA10_13 = input.LA(6);

                                if ( (LA10_13==41) ) {
                                    alt10=2;
                                }
                                else if ( (LA10_13==37) ) {
                                    alt10=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 13, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 14, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA10_11==NUMBER) ) {
                            int LA10_15 = input.LA(5);

                            if ( (LA10_15==42) ) {
                                int LA10_12 = input.LA(6);

                                if ( (LA10_12==37) ) {
                                    alt10=4;
                                }
                                else if ( (LA10_12==41) ) {
                                    alt10=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 12, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA10_15==43) ) {
                                int LA10_13 = input.LA(6);

                                if ( (LA10_13==41) ) {
                                    alt10=2;
                                }
                                else if ( (LA10_13==37) ) {
                                    alt10=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 13, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 42:
                        {
                        int LA10_12 = input.LA(4);

                        if ( (LA10_12==37) ) {
                            alt10=4;
                        }
                        else if ( (LA10_12==41) ) {
                            alt10=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 43:
                        {
                        int LA10_13 = input.LA(4);

                        if ( (LA10_13==41) ) {
                            alt10=2;
                        }
                        else if ( (LA10_13==37) ) {
                            alt10=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 6, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("70:1: z_expr : ( z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ ) | '-' z_pow_expr ( z_sgn_pow_expr )+ -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ ) | z_pow_expr -> ^( ZPOLY ^( ADD z_pow_expr ) ) | '-' z_pow_expr -> ^( ZPOLY ^( SUB z_pow_expr ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:70:10: z_pow_expr ( z_sgn_pow_expr )+
                    {
                    pushFollow(FOLLOW_z_pow_expr_in_z_expr718);
                    z_pow_expr46=z_pow_expr();
                    _fsp--;

                    stream_z_pow_expr.add(z_pow_expr46.getTree());
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:70:21: ( z_sgn_pow_expr )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==42) ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==41) ) {
                                alt8=1;
                            }


                        }
                        else if ( (LA8_0==43) ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==41) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:70:21: z_sgn_pow_expr
                    	    {
                    	    pushFollow(FOLLOW_z_sgn_pow_expr_in_z_expr720);
                    	    z_sgn_pow_expr47=z_sgn_pow_expr();
                    	    _fsp--;

                    	    stream_z_sgn_pow_expr.add(z_sgn_pow_expr47.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    // AST REWRITE
                    // elements: z_pow_expr, z_sgn_pow_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:37: -> ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:70:40: ^( ZPOLY ^( ADD z_pow_expr ) ( z_sgn_pow_expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ZPOLY, "ZPOLY"), root_1);

                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:70:48: ^( ADD z_pow_expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(ADD, "ADD"), root_2);

                        adaptor.addChild(root_2, stream_z_pow_expr.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_z_sgn_pow_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_z_sgn_pow_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_z_sgn_pow_expr.next());

                        }
                        stream_z_sgn_pow_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:71:5: '-' z_pow_expr ( z_sgn_pow_expr )+
                    {
                    char_literal48=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_z_expr742); 
                    stream_43.add(char_literal48);

                    pushFollow(FOLLOW_z_pow_expr_in_z_expr744);
                    z_pow_expr49=z_pow_expr();
                    _fsp--;

                    stream_z_pow_expr.add(z_pow_expr49.getTree());
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:71:20: ( z_sgn_pow_expr )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==42) ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1==41) ) {
                                alt9=1;
                            }


                        }
                        else if ( (LA9_0==43) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==41) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:71:20: z_sgn_pow_expr
                    	    {
                    	    pushFollow(FOLLOW_z_sgn_pow_expr_in_z_expr746);
                    	    z_sgn_pow_expr50=z_sgn_pow_expr();
                    	    _fsp--;

                    	    stream_z_sgn_pow_expr.add(z_sgn_pow_expr50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    // AST REWRITE
                    // elements: z_sgn_pow_expr, z_pow_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:36: -> ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:71:39: ^( ZPOLY ^( SUB z_pow_expr ) ( z_sgn_pow_expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ZPOLY, "ZPOLY"), root_1);

                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:71:47: ^( SUB z_pow_expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(SUB, "SUB"), root_2);

                        adaptor.addChild(root_2, stream_z_pow_expr.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_z_sgn_pow_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_z_sgn_pow_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_z_sgn_pow_expr.next());

                        }
                        stream_z_sgn_pow_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:72:19: z_pow_expr
                    {
                    pushFollow(FOLLOW_z_pow_expr_in_z_expr782);
                    z_pow_expr51=z_pow_expr();
                    _fsp--;

                    stream_z_pow_expr.add(z_pow_expr51.getTree());

                    // AST REWRITE
                    // elements: z_pow_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:30: -> ^( ZPOLY ^( ADD z_pow_expr ) )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:72:33: ^( ZPOLY ^( ADD z_pow_expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ZPOLY, "ZPOLY"), root_1);

                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:72:41: ^( ADD z_pow_expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(ADD, "ADD"), root_2);

                        adaptor.addChild(root_2, stream_z_pow_expr.next());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 4 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:73:19: '-' z_pow_expr
                    {
                    char_literal52=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_z_expr814); 
                    stream_43.add(char_literal52);

                    pushFollow(FOLLOW_z_pow_expr_in_z_expr816);
                    z_pow_expr53=z_pow_expr();
                    _fsp--;

                    stream_z_pow_expr.add(z_pow_expr53.getTree());

                    // AST REWRITE
                    // elements: z_pow_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:34: -> ^( ZPOLY ^( SUB z_pow_expr ) )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:73:37: ^( ZPOLY ^( SUB z_pow_expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ZPOLY, "ZPOLY"), root_1);

                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:73:45: ^( SUB z_pow_expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(SUB, "SUB"), root_2);

                        adaptor.addChild(root_2, stream_z_pow_expr.next());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class z_sgn_pow_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start z_sgn_pow_expr
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:74:1: z_sgn_pow_expr : ( '+' z_pow_expr -> ^( ADD z_pow_expr ) | '-' z_pow_expr -> ^( SUB z_pow_expr ) );
    public final z_sgn_pow_expr_return z_sgn_pow_expr() throws RecognitionException {
        z_sgn_pow_expr_return retval = new z_sgn_pow_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal54=null;
        Token char_literal56=null;
        z_pow_expr_return z_pow_expr55 = null;

        z_pow_expr_return z_pow_expr57 = null;


        Object char_literal54_tree=null;
        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_z_pow_expr=new RewriteRuleSubtreeStream(adaptor,"rule z_pow_expr");
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:75:2: ( '+' z_pow_expr -> ^( ADD z_pow_expr ) | '-' z_pow_expr -> ^( SUB z_pow_expr ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            else if ( (LA11_0==43) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("74:1: z_sgn_pow_expr : ( '+' z_pow_expr -> ^( ADD z_pow_expr ) | '-' z_pow_expr -> ^( SUB z_pow_expr ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:75:5: '+' z_pow_expr
                    {
                    char_literal54=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_z_sgn_pow_expr838); 
                    stream_42.add(char_literal54);

                    pushFollow(FOLLOW_z_pow_expr_in_z_sgn_pow_expr840);
                    z_pow_expr55=z_pow_expr();
                    _fsp--;

                    stream_z_pow_expr.add(z_pow_expr55.getTree());

                    // AST REWRITE
                    // elements: z_pow_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:20: -> ^( ADD z_pow_expr )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:75:23: ^( ADD z_pow_expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ADD, "ADD"), root_1);

                        adaptor.addChild(root_1, stream_z_pow_expr.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:76:13: '-' z_pow_expr
                    {
                    char_literal56=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_z_sgn_pow_expr862); 
                    stream_43.add(char_literal56);

                    pushFollow(FOLLOW_z_pow_expr_in_z_sgn_pow_expr864);
                    z_pow_expr57=z_pow_expr();
                    _fsp--;

                    stream_z_pow_expr.add(z_pow_expr57.getTree());

                    // AST REWRITE
                    // elements: z_pow_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:28: -> ^( SUB z_pow_expr )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:76:31: ^( SUB z_pow_expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(SUB, "SUB"), root_1);

                        adaptor.addChild(root_1, stream_z_pow_expr.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class z_pow_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start z_pow_expr
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:77:1: z_pow_expr : ( ( 'z' '^' NUMBER ) -> ^( ZTERM NUMBER ) | ( 'z' '^' ANGLE_NUMBER ) -> ^( ZTERM ANGLE_NUMBER ) | 'z' -> ^( ZTERM ONE ) );
    public final z_pow_expr_return z_pow_expr() throws RecognitionException {
        z_pow_expr_return retval = new z_pow_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal58=null;
        Token char_literal59=null;
        Token NUMBER60=null;
        Token char_literal61=null;
        Token char_literal62=null;
        Token ANGLE_NUMBER63=null;
        Token char_literal64=null;

        Object char_literal58_tree=null;
        Object char_literal59_tree=null;
        Object NUMBER60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal62_tree=null;
        Object ANGLE_NUMBER63_tree=null;
        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_ANGLE_NUMBER=new RewriteRuleTokenStream(adaptor,"token ANGLE_NUMBER");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:78:2: ( ( 'z' '^' NUMBER ) -> ^( ZTERM NUMBER ) | ( 'z' '^' ANGLE_NUMBER ) -> ^( ZTERM ANGLE_NUMBER ) | 'z' -> ^( ZTERM ONE ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==44) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==ANGLE_NUMBER) ) {
                        alt12=2;
                    }
                    else if ( (LA12_2==NUMBER) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("77:1: z_pow_expr : ( ( 'z' '^' NUMBER ) -> ^( ZTERM NUMBER ) | ( 'z' '^' ANGLE_NUMBER ) -> ^( ZTERM ANGLE_NUMBER ) | 'z' -> ^( ZTERM ONE ) );", 12, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA12_1>=42 && LA12_1<=43)) ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("77:1: z_pow_expr : ( ( 'z' '^' NUMBER ) -> ^( ZTERM NUMBER ) | ( 'z' '^' ANGLE_NUMBER ) -> ^( ZTERM ANGLE_NUMBER ) | 'z' -> ^( ZTERM ONE ) );", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("77:1: z_pow_expr : ( ( 'z' '^' NUMBER ) -> ^( ZTERM NUMBER ) | ( 'z' '^' ANGLE_NUMBER ) -> ^( ZTERM ANGLE_NUMBER ) | 'z' -> ^( ZTERM ONE ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:78:4: ( 'z' '^' NUMBER )
                    {
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:78:4: ( 'z' '^' NUMBER )
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:78:5: 'z' '^' NUMBER
                    {
                    char_literal58=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_z_pow_expr882); 
                    stream_41.add(char_literal58);

                    char_literal59=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_z_pow_expr884); 
                    stream_44.add(char_literal59);

                    NUMBER60=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_z_pow_expr886); 
                    stream_NUMBER.add(NUMBER60);


                    }


                    // AST REWRITE
                    // elements: NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:21: -> ^( ZTERM NUMBER )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:78:24: ^( ZTERM NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ZTERM, "ZTERM"), root_1);

                        adaptor.addChild(root_1, stream_NUMBER.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:79:11: ( 'z' '^' ANGLE_NUMBER )
                    {
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:79:11: ( 'z' '^' ANGLE_NUMBER )
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:79:12: 'z' '^' ANGLE_NUMBER
                    {
                    char_literal61=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_z_pow_expr908); 
                    stream_41.add(char_literal61);

                    char_literal62=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_z_pow_expr910); 
                    stream_44.add(char_literal62);

                    ANGLE_NUMBER63=(Token)input.LT(1);
                    match(input,ANGLE_NUMBER,FOLLOW_ANGLE_NUMBER_in_z_pow_expr912); 
                    stream_ANGLE_NUMBER.add(ANGLE_NUMBER63);


                    }


                    // AST REWRITE
                    // elements: ANGLE_NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:34: -> ^( ZTERM ANGLE_NUMBER )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:79:37: ^( ZTERM ANGLE_NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ZTERM, "ZTERM"), root_1);

                        adaptor.addChild(root_1, stream_ANGLE_NUMBER.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:80:12: 'z'
                    {
                    char_literal64=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_z_pow_expr934); 
                    stream_41.add(char_literal64);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:16: -> ^( ZTERM ONE )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:80:19: ^( ZTERM ONE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ZTERM, "ZTERM"), root_1);

                        adaptor.addChild(root_1, adaptor.create(ONE, "ONE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end z_pow_expr

    public static class c_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start c_expr
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:81:1: c_expr : ( 'c' '^' NUMBER -> ^( CTERM NUMBER ) | 'c' '^' ANGLE_NUMBER -> ^( CTERM ANGLE_NUMBER ) | 'c' -> ^( CTERM ONE ) );
    public final c_expr_return c_expr() throws RecognitionException {
        c_expr_return retval = new c_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal65=null;
        Token char_literal66=null;
        Token NUMBER67=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token ANGLE_NUMBER70=null;
        Token char_literal71=null;

        Object char_literal65_tree=null;
        Object char_literal66_tree=null;
        Object NUMBER67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        Object ANGLE_NUMBER70_tree=null;
        Object char_literal71_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_ANGLE_NUMBER=new RewriteRuleTokenStream(adaptor,"token ANGLE_NUMBER");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:81:9: ( 'c' '^' NUMBER -> ^( CTERM NUMBER ) | 'c' '^' ANGLE_NUMBER -> ^( CTERM ANGLE_NUMBER ) | 'c' -> ^( CTERM ONE ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==44) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==NUMBER) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==ANGLE_NUMBER) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("81:1: c_expr : ( 'c' '^' NUMBER -> ^( CTERM NUMBER ) | 'c' '^' ANGLE_NUMBER -> ^( CTERM ANGLE_NUMBER ) | 'c' -> ^( CTERM ONE ) );", 13, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==EOF||LA13_1==37) ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("81:1: c_expr : ( 'c' '^' NUMBER -> ^( CTERM NUMBER ) | 'c' '^' ANGLE_NUMBER -> ^( CTERM ANGLE_NUMBER ) | 'c' -> ^( CTERM ONE ) );", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("81:1: c_expr : ( 'c' '^' NUMBER -> ^( CTERM NUMBER ) | 'c' '^' ANGLE_NUMBER -> ^( CTERM ANGLE_NUMBER ) | 'c' -> ^( CTERM ONE ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:81:11: 'c' '^' NUMBER
                    {
                    char_literal65=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_c_expr950); 
                    stream_37.add(char_literal65);

                    char_literal66=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_c_expr952); 
                    stream_44.add(char_literal66);

                    NUMBER67=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_c_expr954); 
                    stream_NUMBER.add(NUMBER67);


                    // AST REWRITE
                    // elements: NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:26: -> ^( CTERM NUMBER )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:81:29: ^( CTERM NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CTERM, "CTERM"), root_1);

                        adaptor.addChild(root_1, stream_NUMBER.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:82:19: 'c' '^' ANGLE_NUMBER
                    {
                    char_literal68=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_c_expr982); 
                    stream_37.add(char_literal68);

                    char_literal69=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_c_expr984); 
                    stream_44.add(char_literal69);

                    ANGLE_NUMBER70=(Token)input.LT(1);
                    match(input,ANGLE_NUMBER,FOLLOW_ANGLE_NUMBER_in_c_expr986); 
                    stream_ANGLE_NUMBER.add(ANGLE_NUMBER70);


                    // AST REWRITE
                    // elements: ANGLE_NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:40: -> ^( CTERM ANGLE_NUMBER )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:82:43: ^( CTERM ANGLE_NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CTERM, "CTERM"), root_1);

                        adaptor.addChild(root_1, stream_ANGLE_NUMBER.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:83:19: 'c'
                    {
                    char_literal71=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_c_expr1014); 
                    stream_37.add(char_literal71);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:23: -> ^( CTERM ONE )
                    {
                        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:83:26: ^( CTERM ONE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CTERM, "CTERM"), root_1);

                        adaptor.addChild(root_1, adaptor.create(ONE, "ONE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end c_expr

    public static class ifs_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ifs_type
    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:84:1: ifs_type : 'ifs' ;
    public final ifs_type_return ifs_type() throws RecognitionException {
        ifs_type_return retval = new ifs_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal72=null;

        Object string_literal72_tree=null;

        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:84:13: ( 'ifs' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:84:18: 'ifs'
            {
            root_0 = (Object)adaptor.nil();

            string_literal72=(Token)input.LT(1);
            match(input,45,FOLLOW_45_in_ifs_type1035); 
            string_literal72_tree = (Object)adaptor.create(string_literal72);
            adaptor.addChild(root_0, string_literal72_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ifs_type


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA5_eotS =
        "\54\uffff";
    static final String DFA5_eofS =
        "\16\uffff\1\26\1\uffff\1\26\17\uffff\2\26\2\uffff\2\26\6\uffff";
    static final String DFA5_minS =
        "\1\44\1\45\1\uffff\1\37\1\51\1\52\1\51\1\31\2\45\4\52\1\45\1\52"+
        "\1\45\1\31\2\45\2\31\2\uffff\2\31\6\52\2\45\2\52\2\45\2\31\4\52";
    static final String DFA5_maxS =
        "\1\44\1\51\1\uffff\1\37\1\53\1\54\1\51\1\33\2\51\1\54\2\53\4\54"+
        "\1\33\2\51\2\33\2\uffff\2\33\2\53\2\54\2\53\2\45\2\53\2\45\2\33"+
        "\4\53";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\23\uffff\1\1\1\3\24\uffff";
    static final String DFA5_specialS =
        "\54\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2\3\uffff\1\3",
            "",
            "\1\4",
            "\1\5\1\uffff\1\6",
            "\1\10\1\11\1\7",
            "\1\12",
            "\1\13\1\uffff\1\14",
            "\1\16\3\uffff\1\15",
            "\1\20\3\uffff\1\17",
            "\1\22\1\23\1\21",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11\1\24",
            "\1\27\6\uffff\1\25",
            "\1\10\1\11\1\30",
            "\1\27\6\uffff\1\31",
            "\1\33\1\uffff\1\32",
            "\1\16\3\uffff\1\34",
            "\1\20\3\uffff\1\35",
            "\1\37\1\uffff\1\36",
            "\1\41\1\uffff\1\40",
            "",
            "",
            "\1\43\1\uffff\1\42",
            "\1\44\1\uffff\1\45",
            "\1\22\1\23",
            "\1\22\1\23",
            "\1\22\1\23\1\46",
            "\1\22\1\23\1\47",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\27",
            "\1\27",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\27",
            "\1\27",
            "\1\51\1\uffff\1\50",
            "\1\52\1\uffff\1\53",
            "\1\22\1\23",
            "\1\22\1\23",
            "\1\22\1\23",
            "\1\22\1\23"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "62:1: formula_type : ( 'formula' formula -> ^( FORMULA formula ) | 'formula' c_init formula -> ^( FORMULA formula c_init ) | 'formula' formula c_init -> ^( FORMULA formula c_init ) );";
        }
    }
    static final String DFA7_eotS =
        "\42\uffff";
    static final String DFA7_eofS =
        "\42\uffff";
    static final String DFA7_minS =
        "\1\51\1\37\1\51\1\52\1\51\1\31\2\45\4\52\1\uffff\1\52\1\uffff\1"+
        "\31\2\45\2\31\10\52\2\31\4\52";
    static final String DFA7_maxS =
        "\1\51\1\37\1\53\1\54\1\51\1\33\2\51\1\54\2\53\1\54\1\uffff\1\54"+
        "\1\uffff\1\33\2\51\2\33\2\53\2\54\4\53\2\33\4\53";
    static final String DFA7_acceptS =
        "\14\uffff\1\1\1\uffff\1\2\23\uffff";
    static final String DFA7_specialS =
        "\42\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\uffff\1\4",
            "\1\6\1\7\1\5",
            "\1\10",
            "\1\11\1\uffff\1\12",
            "\1\14\3\uffff\1\13",
            "\1\16\3\uffff\1\15",
            "\1\20\1\21\1\17",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7\1\22",
            "",
            "\1\6\1\7\1\23",
            "",
            "\1\24\1\uffff\1\25",
            "\1\14\3\uffff\1\26",
            "\1\16\3\uffff\1\27",
            "\1\30\1\uffff\1\31",
            "\1\32\1\uffff\1\33",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\20\1\21\1\34",
            "\1\20\1\21\1\35",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\37\1\uffff\1\36",
            "\1\40\1\uffff\1\41",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\20\1\21"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "68:1: formula : ( 'z' '=' z_expr '+' c_expr -> ^( ADD z_expr c_expr ) | 'z' '=' z_expr '-' c_expr -> ^( SUB z_expr c_expr ) );";
        }
    }
 

    public static final BitSet FOLLOW_lsystem_type_in_program206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifs_type_in_program210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formula_type_in_program214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_lsystem_type227 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_axiom_rule_in_lsystem_type229 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_angle_rule_in_lsystem_type231 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_production_rule_in_lsystem_type233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_production258 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ARROW_in_production260 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_in_production262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_production280 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ARROW_in_production282 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LINE_in_production284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_production_rule307 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_production_in_production_rule309 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_34_in_axiom_rule332 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_in_axiom_rule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_axiom_rule369 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LINE_in_axiom_rule371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_angle_rule418 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_angle_in_angle_rule420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANGLE_NUMBER_in_angle445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_formula_type460 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_formula_in_formula_type462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_formula_type495 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_c_init_in_formula_type497 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_formula_in_formula_type499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_formula_type534 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_formula_in_formula_type536 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_c_init_in_formula_type538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_double_val559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_double_val576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANGLE_NUMBER_in_double_val604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_c_init620 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_EQUALS_in_c_init622 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_c_init624 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_double_val_in_c_init628 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_c_init630 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_double_val_in_c_init634 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_c_init636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_formula655 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_EQUALS_in_formula657 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_z_expr_in_formula659 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_formula661 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_c_expr_in_formula663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_formula693 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_EQUALS_in_formula695 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_z_expr_in_formula697 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_formula699 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_c_expr_in_formula701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_z_pow_expr_in_z_expr718 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_z_sgn_pow_expr_in_z_expr720 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_43_in_z_expr742 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_z_pow_expr_in_z_expr744 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_z_sgn_pow_expr_in_z_expr746 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_z_pow_expr_in_z_expr782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_z_expr814 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_z_pow_expr_in_z_expr816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_z_sgn_pow_expr838 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_z_pow_expr_in_z_sgn_pow_expr840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_z_sgn_pow_expr862 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_z_pow_expr_in_z_sgn_pow_expr864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_z_pow_expr882 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_z_pow_expr884 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NUMBER_in_z_pow_expr886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_z_pow_expr908 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_z_pow_expr910 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ANGLE_NUMBER_in_z_pow_expr912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_z_pow_expr934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_c_expr950 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_c_expr952 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NUMBER_in_c_expr954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_c_expr982 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_c_expr984 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ANGLE_NUMBER_in_c_expr986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_c_expr1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ifs_type1035 = new BitSet(new long[]{0x0000000000000002L});

}