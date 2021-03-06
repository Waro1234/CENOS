// Generated from /Volumes/Opslag/School/Leerjaar 2 Kwartiel 3/Compilers en operatingsystems/Git/DutchJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DutchJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, OF=16, EN=17, 
		GELIJKAAN=18, NIETGELIJKAAN=19, GROTERDAN=20, KLEINERDAN=21, GROTERGELIJK=22, 
		KLEINERGELIJK=23, MINUS=24, PLUS=25, KEER=26, GEDEELDDOOR=27, MODULO=28, 
		PLUSIS=29, MINIS=30, KEERIS=31, GEDEELDDOORIS=32, SEMICOL=33, KENTOE=34, 
		HAAKOPEN=35, HAAKSLUIT=36, GEEFTERUG=37, DATATYPE=38, DRAAD=39, NUMMER=40, 
		LANG=41, BOOLEAANS=42, LEEGTE=43, ID=44, INT=45, FLOAT=46, STRING=47, 
		COMMENT=48, SPACE=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "OF", "EN", "GELIJKAAN", 
		"NIETGELIJKAAN", "GROTERDAN", "KLEINERDAN", "GROTERGELIJK", "KLEINERGELIJK", 
		"MINUS", "PLUS", "KEER", "GEDEELDDOOR", "MODULO", "PLUSIS", "MINIS", "KEERIS", 
		"GEDEELDDOORIS", "SEMICOL", "KENTOE", "HAAKOPEN", "HAAKSLUIT", "GEEFTERUG", 
		"DATATYPE", "DRAAD", "NUMMER", "LANG", "BOOLEAANS", "LEEGTE", "ID", "INT", 
		"FLOAT", "STRING", "COMMENT", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'als'", "'alsanders'", "'anders'", "'zolang'", "'voor'", "'{'", 
		"'}'", "'functie'", "','", "'waar'", "'onwaar'", "'vooralle'", "':'", 
		"'!'", "'nul'", null, null, "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
		"'-'", "'+'", "'*'", "'/'", "'%'", null, null, null, null, "';'", null, 
		"'('", "')'", "'geefterug'", null, "'draad'", "'nummer'", "'lang'", "'booleaans'", 
		"'leegte'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "OF", "EN", "GELIJKAAN", "NIETGELIJKAAN", "GROTERDAN", 
		"KLEINERDAN", "GROTERGELIJK", "KLEINERGELIJK", "MINUS", "PLUS", "KEER", 
		"GEDEELDDOOR", "MODULO", "PLUSIS", "MINIS", "KEERIS", "GEDEELDDOORIS", 
		"SEMICOL", "KENTOE", "HAAKOPEN", "HAAKSLUIT", "GEEFTERUG", "DATATYPE", 
		"DRAAD", "NUMMER", "LANG", "BOOLEAANS", "LEEGTE", "ID", "INT", "FLOAT", 
		"STRING", "COMMENT", "SPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DutchJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DutchJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u0168\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b6\n\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00bc\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u00dc\n\36\3\37\3\37\3\37\3\37"+
		"\5\37\u00e2\n\37\3 \3 \3 \3 \5 \u00e8\n \3!\3!\3!\3!\5!\u00ee\n!\3\"\3"+
		"\"\3#\3#\3#\5#\u00f5\n#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u010a\n\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-"+
		"\3-\7-\u0131\n-\f-\16-\u0134\13-\3.\6.\u0137\n.\r.\16.\u0138\3/\6/\u013c"+
		"\n/\r/\16/\u013d\3/\3/\7/\u0142\n/\f/\16/\u0145\13/\3/\3/\6/\u0149\n/"+
		"\r/\16/\u014a\5/\u014d\n/\3\60\3\60\3\60\3\60\7\60\u0153\n\60\f\60\16"+
		"\60\u0156\13\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u015e\n\61\f\61\16"+
		"\61\u0161\13\61\3\61\3\61\3\62\3\62\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62"+
		";\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u017b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\3e\3\2\2\2\5i\3\2\2\2\7s\3\2\2\2\tz\3\2\2\2\13\u0081\3\2\2\2\r\u0086"+
		"\3\2\2\2\17\u0088\3\2\2\2\21\u008a\3\2\2\2\23\u0092\3\2\2\2\25\u0094\3"+
		"\2\2\2\27\u0099\3\2\2\2\31\u00a0\3\2\2\2\33\u00a9\3\2\2\2\35\u00ab\3\2"+
		"\2\2\37\u00ad\3\2\2\2!\u00b5\3\2\2\2#\u00bb\3\2\2\2%\u00bd\3\2\2\2\'\u00c0"+
		"\3\2\2\2)\u00c3\3\2\2\2+\u00c5\3\2\2\2-\u00c7\3\2\2\2/\u00ca\3\2\2\2\61"+
		"\u00cd\3\2\2\2\63\u00cf\3\2\2\2\65\u00d1\3\2\2\2\67\u00d3\3\2\2\29\u00d5"+
		"\3\2\2\2;\u00db\3\2\2\2=\u00e1\3\2\2\2?\u00e7\3\2\2\2A\u00ed\3\2\2\2C"+
		"\u00ef\3\2\2\2E\u00f4\3\2\2\2G\u00f6\3\2\2\2I\u00f8\3\2\2\2K\u00fa\3\2"+
		"\2\2M\u0109\3\2\2\2O\u010b\3\2\2\2Q\u0111\3\2\2\2S\u0118\3\2\2\2U\u011d"+
		"\3\2\2\2W\u0127\3\2\2\2Y\u012e\3\2\2\2[\u0136\3\2\2\2]\u014c\3\2\2\2_"+
		"\u014e\3\2\2\2a\u0159\3\2\2\2c\u0164\3\2\2\2ef\7c\2\2fg\7n\2\2gh\7u\2"+
		"\2h\4\3\2\2\2ij\7c\2\2jk\7n\2\2kl\7u\2\2lm\7c\2\2mn\7p\2\2no\7f\2\2op"+
		"\7g\2\2pq\7t\2\2qr\7u\2\2r\6\3\2\2\2st\7c\2\2tu\7p\2\2uv\7f\2\2vw\7g\2"+
		"\2wx\7t\2\2xy\7u\2\2y\b\3\2\2\2z{\7|\2\2{|\7q\2\2|}\7n\2\2}~\7c\2\2~\177"+
		"\7p\2\2\177\u0080\7i\2\2\u0080\n\3\2\2\2\u0081\u0082\7x\2\2\u0082\u0083"+
		"\7q\2\2\u0083\u0084\7q\2\2\u0084\u0085\7t\2\2\u0085\f\3\2\2\2\u0086\u0087"+
		"\7}\2\2\u0087\16\3\2\2\2\u0088\u0089\7\177\2\2\u0089\20\3\2\2\2\u008a"+
		"\u008b\7h\2\2\u008b\u008c\7w\2\2\u008c\u008d\7p\2\2\u008d\u008e\7e\2\2"+
		"\u008e\u008f\7v\2\2\u008f\u0090\7k\2\2\u0090\u0091\7g\2\2\u0091\22\3\2"+
		"\2\2\u0092\u0093\7.\2\2\u0093\24\3\2\2\2\u0094\u0095\7y\2\2\u0095\u0096"+
		"\7c\2\2\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\26\3\2\2\2\u0099\u009a"+
		"\7q\2\2\u009a\u009b\7p\2\2\u009b\u009c\7y\2\2\u009c\u009d\7c\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7t\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7x\2\2\u00a1"+
		"\u00a2\7q\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7c\2\2"+
		"\u00a5\u00a6\7n\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\32\3\2"+
		"\2\2\u00a9\u00aa\7<\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\36\3"+
		"\2\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7n\2\2\u00b0"+
		" \3\2\2\2\u00b1\u00b2\7~\2\2\u00b2\u00b6\7~\2\2\u00b3\u00b4\7q\2\2\u00b4"+
		"\u00b6\7h\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\"\3\2\2\2"+
		"\u00b7\u00b8\7(\2\2\u00b8\u00bc\7(\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bc"+
		"\7p\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc$\3\2\2\2\u00bd\u00be"+
		"\7?\2\2\u00be\u00bf\7?\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7"+
		">\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8\u00c9\7?\2\2\u00c9.\3\2"+
		"\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc\7?\2\2\u00cc\60\3\2\2\2\u00cd\u00ce"+
		"\7/\2\2\u00ce\62\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0\64\3\2\2\2\u00d1\u00d2"+
		"\7,\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\7\61\2\2\u00d48\3\2\2\2\u00d5\u00d6"+
		"\7\'\2\2\u00d6:\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\u00dc\7?\2\2\u00d9\u00da"+
		"\7?\2\2\u00da\u00dc\7-\2\2\u00db\u00d7\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"<\3\2\2\2\u00dd\u00de\7/\2\2\u00de\u00e2\7?\2\2\u00df\u00e0\7?\2\2\u00e0"+
		"\u00e2\7/\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2>\3\2\2\2\u00e3"+
		"\u00e4\7,\2\2\u00e4\u00e8\7?\2\2\u00e5\u00e6\7?\2\2\u00e6\u00e8\7,\2\2"+
		"\u00e7\u00e3\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7"+
		"\61\2\2\u00ea\u00ee\7?\2\2\u00eb\u00ec\7?\2\2\u00ec\u00ee\7\61\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00eeB\3\2\2\2\u00ef\u00f0\7=\2\2\u00f0"+
		"D\3\2\2\2\u00f1\u00f5\7?\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f5\7u\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5F\3\2\2\2\u00f6\u00f7\7*\2\2\u00f7"+
		"H\3\2\2\2\u00f8\u00f9\7+\2\2\u00f9J\3\2\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7v\2\2\u00ff"+
		"\u0100\7g\2\2\u0100\u0101\7t\2\2\u0101\u0102\7w\2\2\u0102\u0103\7i\2\2"+
		"\u0103L\3\2\2\2\u0104\u010a\5O(\2\u0105\u010a\5Q)\2\u0106\u010a\5S*\2"+
		"\u0107\u010a\5U+\2\u0108\u010a\5W,\2\u0109\u0104\3\2\2\2\u0109\u0105\3"+
		"\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"N\3\2\2\2\u010b\u010c\7f\2\2\u010c\u010d\7t\2\2\u010d\u010e\7c\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7f\2\2\u0110P\3\2\2\2\u0111\u0112\7p\2\2\u0112"+
		"\u0113\7w\2\2\u0113\u0114\7o\2\2\u0114\u0115\7o\2\2\u0115\u0116\7g\2\2"+
		"\u0116\u0117\7t\2\2\u0117R\3\2\2\2\u0118\u0119\7n\2\2\u0119\u011a\7c\2"+
		"\2\u011a\u011b\7p\2\2\u011b\u011c\7i\2\2\u011cT\3\2\2\2\u011d\u011e\7"+
		"d\2\2\u011e\u011f\7q\2\2\u011f\u0120\7q\2\2\u0120\u0121\7n\2\2\u0121\u0122"+
		"\7g\2\2\u0122\u0123\7c\2\2\u0123\u0124\7c\2\2\u0124\u0125\7p\2\2\u0125"+
		"\u0126\7u\2\2\u0126V\3\2\2\2\u0127\u0128\7n\2\2\u0128\u0129\7g\2\2\u0129"+
		"\u012a\7g\2\2\u012a\u012b\7i\2\2\u012b\u012c\7v\2\2\u012c\u012d\7g\2\2"+
		"\u012dX\3\2\2\2\u012e\u0132\t\2\2\2\u012f\u0131\t\3\2\2\u0130\u012f\3"+
		"\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"Z\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\t\4\2\2\u0136\u0135\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\\\3"+
		"\2\2\2\u013a\u013c\t\4\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0143\7\60"+
		"\2\2\u0140\u0142\t\4\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014d\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0146\u0148\7\60\2\2\u0147\u0149\t\4\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u013b\3\2\2\2\u014c\u0146\3\2\2\2\u014d^\3\2\2\2\u014e\u0154"+
		"\7$\2\2\u014f\u0153\n\5\2\2\u0150\u0151\7$\2\2\u0151\u0153\7$\2\2\u0152"+
		"\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0158\7$\2\2\u0158`\3\2\2\2\u0159\u015a\7B\2\2\u015a\u015b\7B\2\2\u015b"+
		"\u015f\3\2\2\2\u015c\u015e\n\6\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0163\b\61\2\2\u0163b\3\2\2\2\u0164\u0165\t\7\2\2"+
		"\u0165\u0166\3\2\2\2\u0166\u0167\b\62\2\2\u0167d\3\2\2\2\24\2\u00b5\u00bb"+
		"\u00db\u00e1\u00e7\u00ed\u00f4\u0109\u0132\u0138\u013d\u0143\u014a\u014c"+
		"\u0152\u0154\u015f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}