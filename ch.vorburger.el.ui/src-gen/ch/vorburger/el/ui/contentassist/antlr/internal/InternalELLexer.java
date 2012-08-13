package ch.vorburger.el.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalELLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EINT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalELLexer() {;} 
    public InternalELLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalELLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11:7: ( '..' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:12:7: ( '=' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:13:7: ( '+=' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:13:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:14:7: ( '||' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:14:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:15:7: ( '&&' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:15:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:16:7: ( 'null' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:16:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:17:7: ( 'NULL' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:17:9: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:18:7: ( 'false' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:18:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:19:7: ( 'FALSE' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:19:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:20:7: ( 'true' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:20:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:21:7: ( 'TRUE' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:21:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:22:7: ( '==' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:22:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:23:7: ( '!=' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:23:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:24:7: ( '>=' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:24:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:25:7: ( '<=' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:25:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:26:7: ( '>' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:26:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:27:7: ( '<' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:27:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:28:7: ( '+' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:28:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:29:7: ( '-' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:29:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:30:7: ( '*' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:31:7: ( '**' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:31:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:32:7: ( '/' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:33:7: ( '%' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:33:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:34:7: ( '!' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:34:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:35:7: ( '.' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:35:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:36:7: ( 'val' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:36:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:37:7: ( 'super' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:37:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:38:7: ( ':' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:38:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:39:7: ( 'as' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:39:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:40:7: ( ',' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:40:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:41:7: ( ')' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:41:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:42:7: ( '[' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:42:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:43:7: ( ']' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:43:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:44:7: ( ';' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:44:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:45:7: ( '(' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:45:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:46:7: ( 'if' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:46:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:47:7: ( 'else' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:47:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:48:7: ( 'case' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:48:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:49:7: ( '::' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:49:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:50:7: ( 'catch' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:50:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:51:7: ( '=>' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:51:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:52:7: ( '?' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:52:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:53:7: ( 'extends' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:53:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:54:7: ( '&' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:54:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:55:7: ( '?.' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:55:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:56:7: ( '*.' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:56:9: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:57:7: ( '|' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:57:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:58:7: ( 'var' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:58:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_EINT"
    public final void mRULE_EINT() throws RecognitionException {
        try {
            int _type = RULE_EINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11509:11: ( ( '0' .. '9' )+ ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )+ )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11509:13: ( '0' .. '9' )+ ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )+
            {
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11509:13: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11509:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11509:35: ( '-' | '+' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11509:46: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11509:47: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EINT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11511:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11511:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11511:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11511:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11511:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='$'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11513:10: ( ( '0' .. '9' )+ )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11513:12: ( '0' .. '9' )+
            {
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11513:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11513:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11515:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11517:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11517:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11517:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11517:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11519:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11519:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11519:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11519:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11519:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11519:41: ( '\\r' )? '\\n'
                    {
                    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11519:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11519:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11521:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11521:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11521:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11523:16: ( . )
            // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:11523:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_EINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=56;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:298: RULE_EINT
                {
                mRULE_EINT(); 

                }
                break;
            case 50 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:308: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:316: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:325: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:337: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 54 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:353: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:369: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // ../ch.vorburger.el.ui/src-gen/ch/vorburger/el/ui/contentassist/antlr/internal/InternalEL.g:1:377: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\51\1\54\1\56\1\60\1\62\6\64\1\73\1\75\1\77\1\uffff\1"+
        "\103\1\106\1\uffff\2\64\1\113\1\64\6\uffff\3\64\1\130\1\133\1\47"+
        "\1\uffff\2\47\15\uffff\1\64\1\uffff\5\64\16\uffff\2\64\2\uffff\1"+
        "\147\6\uffff\1\150\3\64\3\uffff\1\133\3\uffff\6\64\1\163\1\164\1"+
        "\64\2\uffff\4\64\1\172\1\173\2\64\1\176\1\177\2\uffff\1\64\1\u0081"+
        "\1\64\1\u0083\1\64\2\uffff\1\u0085\1\u0086\2\uffff\1\u0087\1\uffff"+
        "\1\64\1\uffff\1\u0089\3\uffff\1\64\1\uffff\1\u008b\1\uffff";
    static final String DFA15_eofS =
        "\u008c\uffff";
    static final String DFA15_minS =
        "\1\0\1\56\2\75\1\174\1\46\1\165\1\125\1\141\1\101\1\162\1\122\3"+
        "\75\1\uffff\2\52\1\uffff\1\141\1\165\1\72\1\163\6\uffff\1\146\1"+
        "\154\1\141\1\56\1\60\1\44\1\uffff\2\0\15\uffff\1\154\1\uffff\1\114"+
        "\1\154\1\114\1\165\1\125\16\uffff\1\154\1\160\2\uffff\1\44\6\uffff"+
        "\1\44\1\163\1\164\1\163\3\uffff\1\60\3\uffff\1\154\1\114\1\163\1"+
        "\123\1\145\1\105\2\44\1\145\2\uffff\3\145\1\143\2\44\1\145\1\105"+
        "\2\44\2\uffff\1\162\1\44\1\156\1\44\1\150\2\uffff\2\44\2\uffff\1"+
        "\44\1\uffff\1\144\1\uffff\1\44\3\uffff\1\163\1\uffff\1\44\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\56\1\76\1\75\1\174\1\46\1\165\1\125\1\141\1\101\1\162"+
        "\1\122\3\75\1\uffff\1\56\1\57\1\uffff\1\141\1\165\1\72\1\163\6\uffff"+
        "\1\146\1\170\1\141\1\56\1\145\1\172\1\uffff\2\uffff\15\uffff\1\154"+
        "\1\uffff\1\114\1\154\1\114\1\165\1\125\16\uffff\1\162\1\160\2\uffff"+
        "\1\172\6\uffff\1\172\1\163\2\164\3\uffff\1\145\3\uffff\1\154\1\114"+
        "\1\163\1\123\1\145\1\105\2\172\1\145\2\uffff\3\145\1\143\2\172\1"+
        "\145\1\105\2\172\2\uffff\1\162\1\172\1\156\1\172\1\150\2\uffff\2"+
        "\172\2\uffff\1\172\1\uffff\1\144\1\uffff\1\172\3\uffff\1\163\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\17\uffff\1\23\2\uffff\1\27\4\uffff\1\36\1\37\1\40\1\41\1\42\1"+
        "\43\6\uffff\1\62\2\uffff\1\67\1\70\1\1\1\31\1\14\1\51\1\2\1\3\1"+
        "\22\1\4\1\57\1\5\1\54\1\uffff\1\62\5\uffff\1\15\1\30\1\16\1\20\1"+
        "\17\1\21\1\23\1\25\1\56\1\24\1\65\1\66\1\26\1\27\2\uffff\1\47\1"+
        "\34\1\uffff\1\36\1\37\1\40\1\41\1\42\1\43\4\uffff\1\55\1\52\1\61"+
        "\1\uffff\1\63\1\64\1\67\11\uffff\1\35\1\44\12\uffff\1\32\1\60\5"+
        "\uffff\1\6\1\7\2\uffff\1\12\1\13\1\uffff\1\45\1\uffff\1\46\1\uffff"+
        "\1\10\1\11\1\33\1\uffff\1\50\1\uffff\1\53";
    static final String DFA15_specialS =
        "\1\1\43\uffff\1\0\1\2\146\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\14\1\44\1\47\1\43\1\22\1"+
            "\5\1\45\1\34\1\30\1\20\1\3\1\27\1\17\1\1\1\21\12\41\1\25\1\33"+
            "\1\16\1\2\1\15\1\40\1\47\5\43\1\11\7\43\1\7\5\43\1\13\6\43\1"+
            "\31\1\47\1\32\1\42\1\43\1\47\1\26\1\43\1\37\1\43\1\36\1\10\2"+
            "\43\1\35\4\43\1\6\4\43\1\24\1\12\1\43\1\23\4\43\1\47\1\4\uff83"+
            "\47",
            "\1\50",
            "\1\52\1\53",
            "\1\55",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74",
            "\1\76",
            "",
            "\1\101\3\uffff\1\102",
            "\1\104\4\uffff\1\105",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124\13\uffff\1\125",
            "\1\126",
            "\1\127",
            "\12\132\13\uffff\1\131\37\uffff\1\131",
            "\1\64\34\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\0\134",
            "\0\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144\5\uffff\1\145",
            "\1\146",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\151",
            "\1\152",
            "\1\153\1\154",
            "",
            "",
            "",
            "\12\132\13\uffff\1\131\37\uffff\1\131",
            "",
            "",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\165",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\174",
            "\1\175",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\u0080",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0082",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0084",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u0088",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "",
            "\1\u008a",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_EINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_36 = input.LA(1);

                        s = -1;
                        if ( ((LA15_36>='\u0000' && LA15_36<='\uFFFF')) ) {s = 92;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='.') ) {s = 1;}

                        else if ( (LA15_0=='=') ) {s = 2;}

                        else if ( (LA15_0=='+') ) {s = 3;}

                        else if ( (LA15_0=='|') ) {s = 4;}

                        else if ( (LA15_0=='&') ) {s = 5;}

                        else if ( (LA15_0=='n') ) {s = 6;}

                        else if ( (LA15_0=='N') ) {s = 7;}

                        else if ( (LA15_0=='f') ) {s = 8;}

                        else if ( (LA15_0=='F') ) {s = 9;}

                        else if ( (LA15_0=='t') ) {s = 10;}

                        else if ( (LA15_0=='T') ) {s = 11;}

                        else if ( (LA15_0=='!') ) {s = 12;}

                        else if ( (LA15_0=='>') ) {s = 13;}

                        else if ( (LA15_0=='<') ) {s = 14;}

                        else if ( (LA15_0=='-') ) {s = 15;}

                        else if ( (LA15_0=='*') ) {s = 16;}

                        else if ( (LA15_0=='/') ) {s = 17;}

                        else if ( (LA15_0=='%') ) {s = 18;}

                        else if ( (LA15_0=='v') ) {s = 19;}

                        else if ( (LA15_0=='s') ) {s = 20;}

                        else if ( (LA15_0==':') ) {s = 21;}

                        else if ( (LA15_0=='a') ) {s = 22;}

                        else if ( (LA15_0==',') ) {s = 23;}

                        else if ( (LA15_0==')') ) {s = 24;}

                        else if ( (LA15_0=='[') ) {s = 25;}

                        else if ( (LA15_0==']') ) {s = 26;}

                        else if ( (LA15_0==';') ) {s = 27;}

                        else if ( (LA15_0=='(') ) {s = 28;}

                        else if ( (LA15_0=='i') ) {s = 29;}

                        else if ( (LA15_0=='e') ) {s = 30;}

                        else if ( (LA15_0=='c') ) {s = 31;}

                        else if ( (LA15_0=='?') ) {s = 32;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 33;}

                        else if ( (LA15_0=='^') ) {s = 34;}

                        else if ( (LA15_0=='$'||(LA15_0>='A' && LA15_0<='E')||(LA15_0>='G' && LA15_0<='M')||(LA15_0>='O' && LA15_0<='S')||(LA15_0>='U' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||LA15_0=='d'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='m')||(LA15_0>='o' && LA15_0<='r')||LA15_0=='u'||(LA15_0>='w' && LA15_0<='z')) ) {s = 35;}

                        else if ( (LA15_0=='\"') ) {s = 36;}

                        else if ( (LA15_0=='\'') ) {s = 37;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 38;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='#'||LA15_0=='@'||LA15_0=='\\'||LA15_0=='`'||LA15_0=='{'||(LA15_0>='}' && LA15_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_37 = input.LA(1);

                        s = -1;
                        if ( ((LA15_37>='\u0000' && LA15_37<='\uFFFF')) ) {s = 92;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}