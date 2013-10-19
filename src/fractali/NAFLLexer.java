// $ANTLR 3.0.1 C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g 2010-06-14 00:34:36

    package fractali;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class NAFLLexer extends Lexer {
    public static final int EXPONENT=29;
    public static final int FORMULA=7;
    public static final int LSYSTEM=5;
    public static final int JULIA=18;
    public static final int SUB=15;
    public static final int ONE=21;
    public static final int EQUALS=31;
    public static final int EOF=-1;
    public static final int AXIOM=8;
    public static final int ZTERM=13;
    public static final int PROG=4;
    public static final int PRODUCTION=11;
    public static final int DOUBLE=26;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int CTERM=19;
    public static final int T32=32;
    public static final int ADD=14;
    public static final int ZPOLY=20;
    public static final int ANGLE=10;
    public static final int RULE=9;
    public static final int NUMBER=27;
    public static final int ROTATE=28;
    public static final int CINIT=16;
    public static final int T43=43;
    public static final int Tokens=46;
    public static final int T42=42;
    public static final int T41=41;
    public static final int LINE=23;
    public static final int T40=40;
    public static final int T45=45;
    public static final int IFS=6;
    public static final int T44=44;
    public static final int PRODUCTIONS=12;
    public static final int WS=30;
    public static final int DBL=22;
    public static final int ARROW=24;
    public static final int ANGLE_NUMBER=25;
    public static final int MANDELBROT=17;
    public NAFLLexer() {;} 
    public NAFLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g"; }

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:6:5: ( 'lsystem' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:6:7: 'lsystem'
            {
            match("lsystem"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:7:5: ( 'productions' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:7:7: 'productions'
            {
            match("productions"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:8:5: ( 'axiom' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:8:7: 'axiom'
            {
            match("axiom"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:9:5: ( 'angle' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:9:7: 'angle'
            {
            match("angle"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:10:5: ( 'formula' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:10:7: 'formula'
            {
            match("formula"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:11:5: ( 'c' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:11:7: 'c'
            {
            match('c'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:12:5: ( '(' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:12:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:13:5: ( ',' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:13:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:14:5: ( ')' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:14:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:15:5: ( 'z' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:15:7: 'z'
            {
            match('z'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:16:5: ( '+' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:16:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:17:5: ( '-' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:17:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:18:5: ( '^' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:18:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:19:5: ( 'ifs' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:19:7: 'ifs'
            {
            match("ifs"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start ARROW
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:86:8: ( '->' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:86:11: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ARROW

    // $ANTLR start LINE
    public final void mLINE() throws RecognitionException {
        try {
            int _type = LINE;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:87:9: ( 'A' .. 'Z' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:87:14: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE

    // $ANTLR start RULE
    public final void mRULE() throws RecognitionException {
        try {
            int _type = RULE;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:89:3: ( ( ROTATE | LINE ) ( ROTATE | LINE )+ )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:89:5: ( ROTATE | LINE ) ( ROTATE | LINE )+
            {
            if ( input.LA(1)=='/'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:89:19: ( ROTATE | LINE )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='/'||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='\\') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:
            	    {
            	    if ( input.LA(1)=='/'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE

    // $ANTLR start ROTATE
    public final void mROTATE() throws RecognitionException {
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:91:20: ( ( '/' | '\\\\' ) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:91:25: ( '/' | '\\\\' )
            {
            if ( input.LA(1)=='/'||input.LA(1)=='\\' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ROTATE

    // $ANTLR start ANGLE_NUMBER
    public final void mANGLE_NUMBER() throws RecognitionException {
        try {
            int _type = ANGLE_NUMBER;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:92:17: ( '1' .. '9' ( '0' .. '9' )? | ( '1' .. '2' '0' .. '9' | '3' '0' .. '5' ) '0' .. '9' )
            int alt4=2;
            switch ( input.LA(1) ) {
            case '1':
            case '2':
                {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>='0' && LA4_1<='9')) ) {
                    int LA4_4 = input.LA(3);

                    if ( ((LA4_4>='0' && LA4_4<='9')) ) {
                        alt4=2;
                    }
                    else {
                        alt4=1;}
                }
                else {
                    alt4=1;}
                }
                break;
            case '3':
                {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>='0' && LA4_2<='5')) ) {
                    int LA4_5 = input.LA(3);

                    if ( ((LA4_5>='0' && LA4_5<='9')) ) {
                        alt4=2;
                    }
                    else {
                        alt4=1;}
                }
                else {
                    alt4=1;}
                }
                break;
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt4=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("92:1: ANGLE_NUMBER : ( '1' .. '9' ( '0' .. '9' )? | ( '1' .. '2' '0' .. '9' | '3' '0' .. '5' ) '0' .. '9' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:92:22: '1' .. '9' ( '0' .. '9' )?
                    {
                    matchRange('1','9'); 
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:92:31: ( '0' .. '9' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:92:31: '0' .. '9'
                            {
                            matchRange('0','9'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:92:43: ( '1' .. '2' '0' .. '9' | '3' '0' .. '5' ) '0' .. '9'
                    {
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:92:43: ( '1' .. '2' '0' .. '9' | '3' '0' .. '5' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>='1' && LA3_0<='2')) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='3') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("92:43: ( '1' .. '2' '0' .. '9' | '3' '0' .. '5' )", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:92:44: '1' .. '2' '0' .. '9'
                            {
                            matchRange('1','2'); 
                            matchRange('0','9'); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:92:64: '3' '0' .. '5'
                            {
                            match('3'); 
                            matchRange('0','5'); 

                            }
                            break;

                    }

                    matchRange('0','9'); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ANGLE_NUMBER

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:93:11: ( ( '+' | '-' )? '0' | ( '1' .. '9' ( '0' .. '9' )* ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-'||LA7_0=='0') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("93:1: NUMBER : ( ( '+' | '-' )? '0' | ( '1' .. '9' ( '0' .. '9' )* ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:93:16: ( '+' | '-' )? '0'
                    {
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:93:16: ( '+' | '-' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }

                    match('0'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:93:35: ( '1' .. '9' ( '0' .. '9' )* )
                    {
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:93:35: ( '1' .. '9' ( '0' .. '9' )* )
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:93:36: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:93:45: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:93:45: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start DOUBLE
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:95:5: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:95:9: ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:95:9: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }

                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:95:22: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:95:23: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:95:38: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:95:39: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:95:50: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:95:50: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:96:9: ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:96:9: ( '+' | '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='+'||LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }

                    match('.'); 
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:96:26: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:96:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:96:38: ( EXPONENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:96:38: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:97:9: ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:97:9: ( '+' | '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='+'||LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }

                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:97:22: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:97:23: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE

    // $ANTLR start EXPONENT
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:101:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:101:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:101:22: ( '+' | '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:101:33: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:101:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end EXPONENT

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:102:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:102:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            skip();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start EQUALS
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:107:2: ( '=' )
            // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:107:4: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUALS

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:8: ( T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | ARROW | LINE | RULE | ANGLE_NUMBER | NUMBER | DOUBLE | WS | EQUALS )
        int alt20=22;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:10: T32
                {
                mT32(); 

                }
                break;
            case 2 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:14: T33
                {
                mT33(); 

                }
                break;
            case 3 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:18: T34
                {
                mT34(); 

                }
                break;
            case 4 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:22: T35
                {
                mT35(); 

                }
                break;
            case 5 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:26: T36
                {
                mT36(); 

                }
                break;
            case 6 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:30: T37
                {
                mT37(); 

                }
                break;
            case 7 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:34: T38
                {
                mT38(); 

                }
                break;
            case 8 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:38: T39
                {
                mT39(); 

                }
                break;
            case 9 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:42: T40
                {
                mT40(); 

                }
                break;
            case 10 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:46: T41
                {
                mT41(); 

                }
                break;
            case 11 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:50: T42
                {
                mT42(); 

                }
                break;
            case 12 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:54: T43
                {
                mT43(); 

                }
                break;
            case 13 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:58: T44
                {
                mT44(); 

                }
                break;
            case 14 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:62: T45
                {
                mT45(); 

                }
                break;
            case 15 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:66: ARROW
                {
                mARROW(); 

                }
                break;
            case 16 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:72: LINE
                {
                mLINE(); 

                }
                break;
            case 17 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:77: RULE
                {
                mRULE(); 

                }
                break;
            case 18 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:82: ANGLE_NUMBER
                {
                mANGLE_NUMBER(); 

                }
                break;
            case 19 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:95: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 20 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:102: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 21 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:109: WS
                {
                mWS(); 

                }
                break;
            case 22 :
                // C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Fractali\\src\\antlr\\NAFL.g:1:112: EQUALS
                {
                mEQUALS(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA17_eotS =
        "\6\uffff";
    static final String DFA17_eofS =
        "\6\uffff";
    static final String DFA17_minS =
        "\1\53\2\56\3\uffff";
    static final String DFA17_maxS =
        "\2\71\1\145\3\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\6\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\5\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "94:1: DOUBLE : ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\12\uffff\1\31\1\33\2\uffff\1\34\1\uffff\3\36\1\41\11\uffff\1\36"+
        "\1\uffff\2\36\1\uffff\1\36\1\41";
    static final String DFA20_eofS =
        "\44\uffff";
    static final String DFA20_minS =
        "\1\11\2\uffff\1\156\6\uffff\2\56\2\uffff\1\57\1\uffff\4\56\11\uffff"+
        "\1\56\1\uffff\2\56\1\uffff\2\56";
    static final String DFA20_maxS =
        "\1\172\2\uffff\1\170\6\uffff\1\71\1\76\2\uffff\1\134\1\uffff\4\145"+
        "\11\uffff\1\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\15"+
        "\1\16\1\uffff\1\21\4\uffff\1\24\1\25\1\26\1\3\1\4\1\13\1\17\1\14"+
        "\1\20\1\uffff\1\22\2\uffff\1\23\2\uffff";
    static final String DFA20_specialS =
        "\44\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\7\uffff\1\6\1\10\1\uffff\1"+
            "\12\1\7\1\13\1\24\1\17\1\23\2\20\1\21\6\22\3\uffff\1\26\3\uffff"+
            "\32\16\1\uffff\1\17\1\uffff\1\14\2\uffff\1\3\1\uffff\1\5\2\uffff"+
            "\1\4\2\uffff\1\15\2\uffff\1\1\3\uffff\1\2\11\uffff\1\11",
            "",
            "",
            "\1\30\11\uffff\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\uffff\1\23\11\24",
            "\1\24\1\uffff\1\23\11\24\4\uffff\1\32",
            "",
            "",
            "\1\17\21\uffff\32\17\1\uffff\1\17",
            "",
            "\1\24\1\uffff\12\35\13\uffff\1\24\37\uffff\1\24",
            "\1\24\1\uffff\6\37\4\40\13\uffff\1\24\37\uffff\1\24",
            "\1\24\1\uffff\12\40\13\uffff\1\24\37\uffff\1\24",
            "\1\24\1\uffff\12\24\13\uffff\1\24\37\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\uffff\12\42\13\uffff\1\24\37\uffff\1\24",
            "",
            "\1\24\1\uffff\12\42\13\uffff\1\24\37\uffff\1\24",
            "\1\24\1\uffff\12\43\13\uffff\1\24\37\uffff\1\24",
            "",
            "\1\24\1\uffff\12\43\13\uffff\1\24\37\uffff\1\24",
            "\1\24\1\uffff\12\43\13\uffff\1\24\37\uffff\1\24"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | ARROW | LINE | RULE | ANGLE_NUMBER | NUMBER | DOUBLE | WS | EQUALS );";
        }
    }
 

}