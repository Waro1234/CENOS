// Generated from D:/School/kwartiel 3/Compilers en operating systems/Our language\DutchJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DutchJavaParser extends Parser {
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
	public static final int
		RULE_parse = 0, RULE_blok = 1, RULE_statement = 2, RULE_als_statement = 3, 
		RULE_zolang_statement = 4, RULE_voor_statement = 5, RULE_voor_blok = 6, 
		RULE_toekenning = 7, RULE_conditie_block = 8, RULE_stat_blok = 9, RULE_methodeAANROEP = 10, 
		RULE_methodeUITVOERING = 11, RULE_vooralle_statement = 12, RULE_vooralle_blok = 13, 
		RULE_expressie = 14, RULE_value_expressie = 15, RULE_atom = 16;
	public static final String[] ruleNames = {
		"parse", "blok", "statement", "als_statement", "zolang_statement", "voor_statement", 
		"voor_blok", "toekenning", "conditie_block", "stat_blok", "methodeAANROEP", 
		"methodeUITVOERING", "vooralle_statement", "vooralle_blok", "expressie", 
		"value_expressie", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'als'", "'alsanders'", "'anders'", "'zolang'", "'voor'", "'{'", 
		"'}'", "'functie'", "'vooralle'", "':'", "'!'", "','", "'waar'", "'onwaar'", 
		"'nul'", null, null, "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'-'", 
		"'+'", "'*'", "'/'", "'%'", null, null, null, null, "';'", null, "'('", 
		"')'", "'geefterug'", null, "'draad'", "'nummer'", "'lang'", "'booleaans'", 
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

	@Override
	public String getGrammarFileName() { return "DutchJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DutchJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public BlokContext blok() {
			return getRuleContext(BlokContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DutchJavaParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			blok();
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlokContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blok; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitBlok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlokContext blok() throws RecognitionException {
		BlokContext _localctx = new BlokContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blok);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << HAAKOPEN) | (1L << DATATYPE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(37);
				statement();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZolangStatementContext extends StatementContext {
		public Zolang_statementContext zolang_statement() {
			return getRuleContext(Zolang_statementContext.class,0);
		}
		public ZolangStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitZolangStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoorStatementContext extends StatementContext {
		public Voor_statementContext voor_statement() {
			return getRuleContext(Voor_statementContext.class,0);
		}
		public VoorStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitVoorStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToekenningStatementContext extends StatementContext {
		public ToekenningContext toekenning() {
			return getRuleContext(ToekenningContext.class,0);
		}
		public ToekenningStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitToekenningStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodeAanroepStatementContext extends StatementContext {
		public MethodeAANROEPContext methodeAANROEP() {
			return getRuleContext(MethodeAANROEPContext.class,0);
		}
		public MethodeAanroepStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitMethodeAanroepStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlsStatementContext extends StatementContext {
		public Als_statementContext als_statement() {
			return getRuleContext(Als_statementContext.class,0);
		}
		public AlsStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitAlsStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodeUitvoeringStatementContext extends StatementContext {
		public MethodeUITVOERINGContext methodeUITVOERING() {
			return getRuleContext(MethodeUITVOERINGContext.class,0);
		}
		public MethodeUitvoeringStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitMethodeUitvoeringStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoorAlleStatementContext extends StatementContext {
		public Vooralle_statementContext vooralle_statement() {
			return getRuleContext(Vooralle_statementContext.class,0);
		}
		public VoorAlleStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitVoorAlleStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressieStatementContext extends StatementContext {
		public Value_expressieContext value_expressie() {
			return getRuleContext(Value_expressieContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(DutchJavaParser.SEMICOL, 0); }
		public ExpressieStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitExpressieStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AlsStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				als_statement();
				}
				break;
			case 2:
				_localctx = new VoorStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				voor_statement();
				}
				break;
			case 3:
				_localctx = new VoorAlleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				vooralle_statement();
				}
				break;
			case 4:
				_localctx = new ZolangStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				zolang_statement();
				}
				break;
			case 5:
				_localctx = new MethodeUitvoeringStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				methodeUITVOERING();
				}
				break;
			case 6:
				_localctx = new MethodeAanroepStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				methodeAANROEP();
				}
				break;
			case 7:
				_localctx = new ToekenningStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				toekenning();
				}
				break;
			case 8:
				_localctx = new ExpressieStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(50);
				value_expressie(0);
				setState(51);
				match(SEMICOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Als_statementContext extends ParserRuleContext {
		public List<Conditie_blockContext> conditie_block() {
			return getRuleContexts(Conditie_blockContext.class);
		}
		public Conditie_blockContext conditie_block(int i) {
			return getRuleContext(Conditie_blockContext.class,i);
		}
		public Stat_blokContext stat_blok() {
			return getRuleContext(Stat_blokContext.class,0);
		}
		public Als_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_als_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitAls_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Als_statementContext als_statement() throws RecognitionException {
		Als_statementContext _localctx = new Als_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_als_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			conditie_block();
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					match(T__1);
					setState(58);
					conditie_block();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(64);
				match(T__2);
				setState(65);
				stat_blok();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zolang_statementContext extends ParserRuleContext {
		public ExpressieContext expressie() {
			return getRuleContext(ExpressieContext.class,0);
		}
		public Stat_blokContext stat_blok() {
			return getRuleContext(Stat_blokContext.class,0);
		}
		public Zolang_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zolang_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitZolang_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zolang_statementContext zolang_statement() throws RecognitionException {
		Zolang_statementContext _localctx = new Zolang_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_zolang_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__3);
			setState(69);
			expressie(0);
			setState(70);
			stat_blok();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Voor_statementContext extends ParserRuleContext {
		public Voor_blokContext voor_blok() {
			return getRuleContext(Voor_blokContext.class,0);
		}
		public Stat_blokContext stat_blok() {
			return getRuleContext(Stat_blokContext.class,0);
		}
		public Voor_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voor_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitVoor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Voor_statementContext voor_statement() throws RecognitionException {
		Voor_statementContext _localctx = new Voor_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_voor_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			voor_blok();
			setState(74);
			stat_blok();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Voor_blokContext extends ParserRuleContext {
		public TerminalNode HAAKOPEN() { return getToken(DutchJavaParser.HAAKOPEN, 0); }
		public ToekenningContext toekenning() {
			return getRuleContext(ToekenningContext.class,0);
		}
		public ExpressieContext expressie() {
			return getRuleContext(ExpressieContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(DutchJavaParser.SEMICOL, 0); }
		public Value_expressieContext value_expressie() {
			return getRuleContext(Value_expressieContext.class,0);
		}
		public TerminalNode HAAKSLUIT() { return getToken(DutchJavaParser.HAAKSLUIT, 0); }
		public Voor_blokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voor_blok; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitVoor_blok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Voor_blokContext voor_blok() throws RecognitionException {
		Voor_blokContext _localctx = new Voor_blokContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_voor_blok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(HAAKOPEN);
			setState(77);
			toekenning();
			setState(78);
			expressie(0);
			setState(79);
			match(SEMICOL);
			setState(80);
			value_expressie(0);
			setState(81);
			match(HAAKSLUIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToekenningContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(DutchJavaParser.DATATYPE, 0); }
		public TerminalNode ID() { return getToken(DutchJavaParser.ID, 0); }
		public TerminalNode KENTOE() { return getToken(DutchJavaParser.KENTOE, 0); }
		public ExpressieContext expressie() {
			return getRuleContext(ExpressieContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(DutchJavaParser.SEMICOL, 0); }
		public ToekenningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toekenning; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitToekenning(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToekenningContext toekenning() throws RecognitionException {
		ToekenningContext _localctx = new ToekenningContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_toekenning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(DATATYPE);
			setState(84);
			match(ID);
			setState(85);
			match(KENTOE);
			setState(86);
			expressie(0);
			setState(87);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditie_blockContext extends ParserRuleContext {
		public ExpressieContext expr;
		public Stat_blokContext sBlock;
		public ExpressieContext expressie() {
			return getRuleContext(ExpressieContext.class,0);
		}
		public Stat_blokContext stat_blok() {
			return getRuleContext(Stat_blokContext.class,0);
		}
		public Conditie_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditie_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitConditie_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditie_blockContext conditie_block() throws RecognitionException {
		Conditie_blockContext _localctx = new Conditie_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditie_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((Conditie_blockContext)_localctx).expr = expressie(0);
			setState(90);
			((Conditie_blockContext)_localctx).sBlock = stat_blok();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_blokContext extends ParserRuleContext {
		public BlokContext blok() {
			return getRuleContext(BlokContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Stat_blokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_blok; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitStat_blok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blokContext stat_blok() throws RecognitionException {
		Stat_blokContext _localctx = new Stat_blokContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat_blok);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__5);
				setState(93);
				blok();
				setState(94);
				match(T__6);
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
			case T__12:
			case T__13:
			case T__14:
			case HAAKOPEN:
			case DATATYPE:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodeAANROEPContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DutchJavaParser.ID, 0); }
		public TerminalNode HAAKOPEN() { return getToken(DutchJavaParser.HAAKOPEN, 0); }
		public ExpressieContext expressie() {
			return getRuleContext(ExpressieContext.class,0);
		}
		public TerminalNode HAAKSLUIT() { return getToken(DutchJavaParser.HAAKSLUIT, 0); }
		public TerminalNode SEMICOL() { return getToken(DutchJavaParser.SEMICOL, 0); }
		public MethodeAANROEPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodeAANROEP; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitMethodeAANROEP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodeAANROEPContext methodeAANROEP() throws RecognitionException {
		MethodeAANROEPContext _localctx = new MethodeAANROEPContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodeAANROEP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(HAAKOPEN);
			setState(101);
			expressie(0);
			setState(102);
			match(HAAKSLUIT);
			setState(103);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodeUITVOERINGContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DutchJavaParser.ID, 0); }
		public TerminalNode HAAKOPEN() { return getToken(DutchJavaParser.HAAKOPEN, 0); }
		public ExpressieContext expressie() {
			return getRuleContext(ExpressieContext.class,0);
		}
		public TerminalNode HAAKSLUIT() { return getToken(DutchJavaParser.HAAKSLUIT, 0); }
		public Stat_blokContext stat_blok() {
			return getRuleContext(Stat_blokContext.class,0);
		}
		public MethodeUITVOERINGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodeUITVOERING; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitMethodeUITVOERING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodeUITVOERINGContext methodeUITVOERING() throws RecognitionException {
		MethodeUITVOERINGContext _localctx = new MethodeUITVOERINGContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodeUITVOERING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__7);
			setState(106);
			match(ID);
			setState(107);
			match(HAAKOPEN);
			setState(108);
			expressie(0);
			setState(109);
			match(HAAKSLUIT);
			setState(110);
			stat_blok();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vooralle_statementContext extends ParserRuleContext {
		public Vooralle_blokContext vooralle_blok() {
			return getRuleContext(Vooralle_blokContext.class,0);
		}
		public Stat_blokContext stat_blok() {
			return getRuleContext(Stat_blokContext.class,0);
		}
		public Vooralle_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vooralle_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitVooralle_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vooralle_statementContext vooralle_statement() throws RecognitionException {
		Vooralle_statementContext _localctx = new Vooralle_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vooralle_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__8);
			setState(113);
			vooralle_blok();
			setState(114);
			stat_blok();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vooralle_blokContext extends ParserRuleContext {
		public Vooralle_blokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vooralle_blok; }
	 
		public Vooralle_blokContext() { }
		public void copyFrom(Vooralle_blokContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VooralleBlokExprContext extends Vooralle_blokContext {
		public TerminalNode HAAKOPEN() { return getToken(DutchJavaParser.HAAKOPEN, 0); }
		public TerminalNode DATATYPE() { return getToken(DutchJavaParser.DATATYPE, 0); }
		public TerminalNode ID() { return getToken(DutchJavaParser.ID, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode HAAKSLUIT() { return getToken(DutchJavaParser.HAAKSLUIT, 0); }
		public VooralleBlokExprContext(Vooralle_blokContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitVooralleBlokExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vooralle_blokContext vooralle_blok() throws RecognitionException {
		Vooralle_blokContext _localctx = new Vooralle_blokContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vooralle_blok);
		try {
			_localctx = new VooralleBlokExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(HAAKOPEN);
			setState(117);
			match(DATATYPE);
			setState(118);
			match(ID);
			setState(119);
			match(T__9);
			setState(120);
			atom();
			setState(121);
			match(HAAKSLUIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressieContext extends ParserRuleContext {
		public ExpressieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressie; }
	 
		public ExpressieContext() { }
		public void copyFrom(ExpressieContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NietExprContext extends ExpressieContext {
		public ExpressieContext expressie() {
			return getRuleContext(ExpressieContext.class,0);
		}
		public NietExprContext(ExpressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitNietExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VergelijkingExprContext extends ExpressieContext {
		public ExpressieContext leftExpr;
		public Token op;
		public ExpressieContext rightExpr;
		public List<ExpressieContext> expressie() {
			return getRuleContexts(ExpressieContext.class);
		}
		public ExpressieContext expressie(int i) {
			return getRuleContext(ExpressieContext.class,i);
		}
		public TerminalNode KLEINERGELIJK() { return getToken(DutchJavaParser.KLEINERGELIJK, 0); }
		public TerminalNode GROTERGELIJK() { return getToken(DutchJavaParser.GROTERGELIJK, 0); }
		public TerminalNode KLEINERDAN() { return getToken(DutchJavaParser.KLEINERDAN, 0); }
		public TerminalNode GROTERDAN() { return getToken(DutchJavaParser.GROTERDAN, 0); }
		public VergelijkingExprContext(ExpressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitVergelijkingExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OfofExprContext extends ExpressieContext {
		public ExpressieContext leftExpr;
		public ExpressieContext rightExpr;
		public TerminalNode OF() { return getToken(DutchJavaParser.OF, 0); }
		public List<ExpressieContext> expressie() {
			return getRuleContexts(ExpressieContext.class);
		}
		public ExpressieContext expressie(int i) {
			return getRuleContext(ExpressieContext.class,i);
		}
		public OfofExprContext(ExpressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitOfofExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GelijkheidExprContext extends ExpressieContext {
		public ExpressieContext leftExpr;
		public Token op;
		public ExpressieContext rightExpr;
		public List<ExpressieContext> expressie() {
			return getRuleContexts(ExpressieContext.class);
		}
		public ExpressieContext expressie(int i) {
			return getRuleContext(ExpressieContext.class,i);
		}
		public TerminalNode GELIJKAAN() { return getToken(DutchJavaParser.GELIJKAAN, 0); }
		public TerminalNode NIETGELIJKAAN() { return getToken(DutchJavaParser.NIETGELIJKAAN, 0); }
		public GelijkheidExprContext(ExpressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitGelijkheidExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentExprContext extends ExpressieContext {
		public List<TerminalNode> ID() { return getTokens(DutchJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DutchJavaParser.ID, i);
		}
		public ArgumentExprContext(ExpressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitArgumentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnenExprContext extends ExpressieContext {
		public ExpressieContext leftExpr;
		public ExpressieContext rightExpr;
		public TerminalNode EN() { return getToken(DutchJavaParser.EN, 0); }
		public List<ExpressieContext> expressie() {
			return getRuleContexts(ExpressieContext.class);
		}
		public ExpressieContext expressie(int i) {
			return getRuleContext(ExpressieContext.class,i);
		}
		public EnenExprContext(ExpressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitEnenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprContext extends ExpressieContext {
		public TerminalNode MINUS() { return getToken(DutchJavaParser.MINUS, 0); }
		public ExpressieContext expressie() {
			return getRuleContext(ExpressieContext.class,0);
		}
		public MinusExprContext(ExpressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomCondExprContext extends ExpressieContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomCondExprContext(ExpressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitAtomCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressieContext expressie() throws RecognitionException {
		return expressie(0);
	}

	private ExpressieContext expressie(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressieContext _localctx = new ExpressieContext(_ctx, _parentState);
		ExpressieContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expressie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124);
				match(MINUS);
				setState(125);
				expressie(8);
				}
				break;
			case 2:
				{
				_localctx = new NietExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(T__10);
				setState(127);
				expressie(7);
				}
				break;
			case 3:
				{
				_localctx = new ArgumentExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						match(ID);
						setState(129);
						match(T__11);
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(135);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new AtomCondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new VergelijkingExprContext(new ExpressieContext(_parentctx, _parentState));
						((VergelijkingExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressie);
						setState(139);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(140);
						((VergelijkingExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GROTERDAN) | (1L << KLEINERDAN) | (1L << GROTERGELIJK) | (1L << KLEINERGELIJK))) != 0)) ) {
							((VergelijkingExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						((VergelijkingExprContext)_localctx).rightExpr = expressie(7);
						}
						break;
					case 2:
						{
						_localctx = new GelijkheidExprContext(new ExpressieContext(_parentctx, _parentState));
						((GelijkheidExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressie);
						setState(142);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(143);
						((GelijkheidExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==GELIJKAAN || _la==NIETGELIJKAAN) ) {
							((GelijkheidExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(144);
						((GelijkheidExprContext)_localctx).rightExpr = expressie(6);
						}
						break;
					case 3:
						{
						_localctx = new EnenExprContext(new ExpressieContext(_parentctx, _parentState));
						((EnenExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressie);
						setState(145);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(146);
						match(EN);
						setState(147);
						((EnenExprContext)_localctx).rightExpr = expressie(5);
						}
						break;
					case 4:
						{
						_localctx = new OfofExprContext(new ExpressieContext(_parentctx, _parentState));
						((OfofExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressie);
						setState(148);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(149);
						match(OF);
						setState(150);
						((OfofExprContext)_localctx).rightExpr = expressie(4);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Value_expressieContext extends ParserRuleContext {
		public Value_expressieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expressie; }
	 
		public Value_expressieContext() { }
		public void copyFrom(Value_expressieContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KeerGddModExprContext extends Value_expressieContext {
		public Token op;
		public List<Value_expressieContext> value_expressie() {
			return getRuleContexts(Value_expressieContext.class);
		}
		public Value_expressieContext value_expressie(int i) {
			return getRuleContext(Value_expressieContext.class,i);
		}
		public TerminalNode KEER() { return getToken(DutchJavaParser.KEER, 0); }
		public TerminalNode GEDEELDDOOR() { return getToken(DutchJavaParser.GEDEELDDOOR, 0); }
		public TerminalNode MODULO() { return getToken(DutchJavaParser.MODULO, 0); }
		public KeerGddModExprContext(Value_expressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitKeerGddModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinminPlusPlusExprContext extends Value_expressieContext {
		public Value_expressieContext value_expressie() {
			return getRuleContext(Value_expressieContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(DutchJavaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DutchJavaParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(DutchJavaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(DutchJavaParser.PLUS, i);
		}
		public MinminPlusPlusExprContext(Value_expressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitMinminPlusPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsRekenExprContext extends Value_expressieContext {
		public Token op;
		public List<Value_expressieContext> value_expressie() {
			return getRuleContexts(Value_expressieContext.class);
		}
		public Value_expressieContext value_expressie(int i) {
			return getRuleContext(Value_expressieContext.class,i);
		}
		public TerminalNode KEERIS() { return getToken(DutchJavaParser.KEERIS, 0); }
		public TerminalNode GEDEELDDOORIS() { return getToken(DutchJavaParser.GEDEELDDOORIS, 0); }
		public TerminalNode MINIS() { return getToken(DutchJavaParser.MINIS, 0); }
		public TerminalNode PLUSIS() { return getToken(DutchJavaParser.PLUSIS, 0); }
		public IsRekenExprContext(Value_expressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitIsRekenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinExprContext extends Value_expressieContext {
		public Token op;
		public List<Value_expressieContext> value_expressie() {
			return getRuleContexts(Value_expressieContext.class);
		}
		public Value_expressieContext value_expressie(int i) {
			return getRuleContext(Value_expressieContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(DutchJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DutchJavaParser.MINUS, 0); }
		public PlusMinExprContext(Value_expressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitPlusMinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomValueExprContext extends Value_expressieContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomValueExprContext(Value_expressieContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitAtomValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_expressieContext value_expressie() throws RecognitionException {
		return value_expressie(0);
	}

	private Value_expressieContext value_expressie(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Value_expressieContext _localctx = new Value_expressieContext(_ctx, _parentState);
		Value_expressieContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_value_expressie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomValueExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(157);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new KeerGddModExprContext(new Value_expressieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value_expressie);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						((KeerGddModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEER) | (1L << GEDEELDDOOR) | (1L << MODULO))) != 0)) ) {
							((KeerGddModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(161);
						value_expressie(6);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinExprContext(new Value_expressieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value_expressie);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						((PlusMinExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((PlusMinExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(164);
						value_expressie(5);
						}
						break;
					case 3:
						{
						_localctx = new IsRekenExprContext(new Value_expressieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value_expressie);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						((IsRekenExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSIS) | (1L << MINIS) | (1L << KEERIS) | (1L << GEDEELDDOORIS))) != 0)) ) {
							((IsRekenExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						value_expressie(4);
						}
						break;
					case 4:
						{
						_localctx = new MinminPlusPlusExprContext(new Value_expressieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value_expressie);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(173);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MINUS:
							{
							setState(169);
							match(MINUS);
							setState(170);
							match(MINUS);
							}
							break;
						case PLUS:
							{
							setState(171);
							match(PLUS);
							setState(172);
							match(PLUS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode HAAKOPEN() { return getToken(DutchJavaParser.HAAKOPEN, 0); }
		public ExpressieContext expressie() {
			return getRuleContext(ExpressieContext.class,0);
		}
		public TerminalNode HAAKSLUIT() { return getToken(DutchJavaParser.HAAKSLUIT, 0); }
		public TerminalNode INT() { return getToken(DutchJavaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DutchJavaParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(DutchJavaParser.ID, 0); }
		public TerminalNode STRING() { return getToken(DutchJavaParser.STRING, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAAKOPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(HAAKOPEN);
				setState(181);
				expressie(0);
				setState(182);
				match(HAAKSLUIT);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(STRING);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expressie_sempred((ExpressieContext)_localctx, predIndex);
		case 15:
			return value_expressie_sempred((Value_expressieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressie_sempred(ExpressieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean value_expressie_sempred(Value_expressieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\7\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3\5\5"+
		"\5E\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13d\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u0085\n\20\f\20\16\20\u0088\13\20\3\20\3\20\5\20\u008c\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u009a"+
		"\n\20\f\20\16\20\u009d\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b0\n\21\7\21\u00b2"+
		"\n\21\f\21\16\21\u00b5\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u00c0\n\22\3\22\2\4\36 \23\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"\2\t\3\2\26\31\3\2\24\25\3\2\34\36\3\2\32\33\3\2\37\"\3\2/\60\3"+
		"\2\17\20\u00cd\2$\3\2\2\2\4*\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\nF\3\2\2"+
		"\2\fJ\3\2\2\2\16N\3\2\2\2\20U\3\2\2\2\22[\3\2\2\2\24c\3\2\2\2\26e\3\2"+
		"\2\2\30k\3\2\2\2\32r\3\2\2\2\34v\3\2\2\2\36\u008b\3\2\2\2 \u009e\3\2\2"+
		"\2\"\u00bf\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\3\3\2\2\2\')\5\6\4\2(\'\3\2\2"+
		"\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3\2\2\2-8\5\b\5\2.8\5\f"+
		"\7\2/8\5\32\16\2\608\5\n\6\2\618\5\30\r\2\628\5\26\f\2\638\5\20\t\2\64"+
		"\65\5 \21\2\65\66\7#\2\2\668\3\2\2\2\67-\3\2\2\2\67.\3\2\2\2\67/\3\2\2"+
		"\2\67\60\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2"+
		"\28\7\3\2\2\29:\7\3\2\2:?\5\22\n\2;<\7\4\2\2<>\5\22\n\2=;\3\2\2\2>A\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3\2\2\2A?\3\2\2\2BC\7\5\2\2CE\5\24\13\2D"+
		"B\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FG\7\6\2\2GH\5\36\20\2HI\5\24\13\2I\13\3"+
		"\2\2\2JK\7\7\2\2KL\5\16\b\2LM\5\24\13\2M\r\3\2\2\2NO\7%\2\2OP\5\20\t\2"+
		"PQ\5\36\20\2QR\7#\2\2RS\5 \21\2ST\7&\2\2T\17\3\2\2\2UV\7(\2\2VW\7.\2\2"+
		"WX\7$\2\2XY\5\36\20\2YZ\7#\2\2Z\21\3\2\2\2[\\\5\36\20\2\\]\5\24\13\2]"+
		"\23\3\2\2\2^_\7\b\2\2_`\5\4\3\2`a\7\t\2\2ad\3\2\2\2bd\5\6\4\2c^\3\2\2"+
		"\2cb\3\2\2\2d\25\3\2\2\2ef\7.\2\2fg\7%\2\2gh\5\36\20\2hi\7&\2\2ij\7#\2"+
		"\2j\27\3\2\2\2kl\7\n\2\2lm\7.\2\2mn\7%\2\2no\5\36\20\2op\7&\2\2pq\5\24"+
		"\13\2q\31\3\2\2\2rs\7\13\2\2st\5\34\17\2tu\5\24\13\2u\33\3\2\2\2vw\7%"+
		"\2\2wx\7(\2\2xy\7.\2\2yz\7\f\2\2z{\5\"\22\2{|\7&\2\2|\35\3\2\2\2}~\b\20"+
		"\1\2~\177\7\32\2\2\177\u008c\5\36\20\n\u0080\u0081\7\r\2\2\u0081\u008c"+
		"\5\36\20\t\u0082\u0083\7.\2\2\u0083\u0085\7\16\2\2\u0084\u0082\3\2\2\2"+
		"\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008c\7.\2\2\u008a\u008c\5\"\22\2\u008b"+
		"}\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u008a\3\2\2\2"+
		"\u008c\u009b\3\2\2\2\u008d\u008e\f\b\2\2\u008e\u008f\t\2\2\2\u008f\u009a"+
		"\5\36\20\t\u0090\u0091\f\7\2\2\u0091\u0092\t\3\2\2\u0092\u009a\5\36\20"+
		"\b\u0093\u0094\f\6\2\2\u0094\u0095\7\23\2\2\u0095\u009a\5\36\20\7\u0096"+
		"\u0097\f\5\2\2\u0097\u0098\7\22\2\2\u0098\u009a\5\36\20\6\u0099\u008d"+
		"\3\2\2\2\u0099\u0090\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\37\3\2\2"+
		"\2\u009d\u009b\3\2\2\2\u009e\u009f\b\21\1\2\u009f\u00a0\5\"\22\2\u00a0"+
		"\u00b3\3\2\2\2\u00a1\u00a2\f\7\2\2\u00a2\u00a3\t\4\2\2\u00a3\u00b2\5 "+
		"\21\b\u00a4\u00a5\f\6\2\2\u00a5\u00a6\t\5\2\2\u00a6\u00b2\5 \21\7\u00a7"+
		"\u00a8\f\5\2\2\u00a8\u00a9\t\6\2\2\u00a9\u00b2\5 \21\6\u00aa\u00af\f\4"+
		"\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00b0\7\32\2\2\u00ad\u00ae\7\33\2\2\u00ae"+
		"\u00b0\7\33\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\3"+
		"\2\2\2\u00b1\u00a1\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1"+
		"\u00aa\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4!\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7%\2\2\u00b7\u00b8"+
		"\5\36\20\2\u00b8\u00b9\7&\2\2\u00b9\u00c0\3\2\2\2\u00ba\u00c0\t\7\2\2"+
		"\u00bb\u00c0\t\b\2\2\u00bc\u00c0\7.\2\2\u00bd\u00c0\7\61\2\2\u00be\u00c0"+
		"\7\21\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2"+
		"\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0#\3"+
		"\2\2\2\17*\67?Dc\u0086\u008b\u0099\u009b\u00af\u00b1\u00b3\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}