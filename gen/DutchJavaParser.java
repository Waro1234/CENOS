// Generated from /Volumes/Opslag/School/Leerjaar 2 Kwartiel 3/Compilers en operatingsystems/Git/DutchJava.g4 by ANTLR 4.6
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
		RULE_methodeUITVOERING = 11, RULE_argument = 12, RULE_argument_type = 13, 
		RULE_vooralle_statement = 14, RULE_vooralle_blok = 15, RULE_expressie = 16, 
		RULE_value_expressie = 17, RULE_atom = 18;
	public static final String[] ruleNames = {
		"parse", "blok", "statement", "als_statement", "zolang_statement", "voor_statement", 
		"voor_blok", "toekenning", "conditie_block", "stat_blok", "methodeAANROEP", 
		"methodeUITVOERING", "argument", "argument_type", "vooralle_statement", 
		"vooralle_blok", "expressie", "value_expressie", "atom"
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
			setState(38);
			blok();
			setState(39);
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
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << HAAKOPEN) | (1L << DATATYPE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(41);
				statement();
				}
				}
				setState(46);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AlsStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				als_statement();
				}
				break;
			case 2:
				_localctx = new VoorStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				voor_statement();
				}
				break;
			case 3:
				_localctx = new VoorAlleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				vooralle_statement();
				}
				break;
			case 4:
				_localctx = new ZolangStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				zolang_statement();
				}
				break;
			case 5:
				_localctx = new MethodeUitvoeringStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				methodeUITVOERING();
				}
				break;
			case 6:
				_localctx = new MethodeAanroepStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				methodeAANROEP();
				}
				break;
			case 7:
				_localctx = new ToekenningStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				toekenning();
				}
				break;
			case 8:
				_localctx = new ExpressieStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				value_expressie(0);
				setState(55);
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
		public Conditie_blockContext cond_block;
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
			setState(59);
			match(T__0);
			setState(60);
			((Als_statementContext)_localctx).cond_block = conditie_block();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					match(T__1);
					setState(62);
					conditie_block();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(68);
				match(T__2);
				setState(69);
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
			setState(72);
			match(T__3);
			setState(73);
			expressie(0);
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
			setState(76);
			match(T__4);
			setState(77);
			voor_blok();
			setState(78);
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
			setState(80);
			match(HAAKOPEN);
			setState(81);
			toekenning();
			setState(82);
			expressie(0);
			setState(83);
			match(SEMICOL);
			setState(84);
			value_expressie(0);
			setState(85);
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
			setState(87);
			match(DATATYPE);
			setState(88);
			match(ID);
			setState(89);
			match(KENTOE);
			setState(90);
			expressie(0);
			setState(91);
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
			setState(93);
			((Conditie_blockContext)_localctx).expr = expressie(0);
			setState(94);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__5);
				setState(97);
				blok();
				setState(98);
				match(T__6);
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__7:
			case T__9:
			case T__10:
			case T__11:
			case T__14:
			case HAAKOPEN:
			case DATATYPE:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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
		public TerminalNode HAAKSLUIT() { return getToken(DutchJavaParser.HAAKSLUIT, 0); }
		public TerminalNode SEMICOL() { return getToken(DutchJavaParser.SEMICOL, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(HAAKOPEN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(105);
				argument();
				}
			}

			setState(108);
			match(HAAKSLUIT);
			setState(109);
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
		public TerminalNode HAAKSLUIT() { return getToken(DutchJavaParser.HAAKSLUIT, 0); }
		public Stat_blokContext stat_blok() {
			return getRuleContext(Stat_blokContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__7);
			setState(112);
			match(ID);
			setState(113);
			match(HAAKOPEN);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(114);
				argument();
				}
			}

			setState(117);
			match(HAAKSLUIT);
			setState(118);
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<Argument_typeContext> argument_type() {
			return getRuleContexts(Argument_typeContext.class);
		}
		public Argument_typeContext argument_type(int i) {
			return getRuleContext(Argument_typeContext.class,i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					argument_type();
					setState(121);
					match(T__8);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(128);
			argument_type();
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

	public static class Argument_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DutchJavaParser.ID, 0); }
		public TerminalNode INT() { return getToken(DutchJavaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DutchJavaParser.FLOAT, 0); }
		public Argument_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DutchJavaVisitor ) return ((DutchJavaVisitor<? extends T>)visitor).visitArgument_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_typeContext argument_type() throws RecognitionException {
		Argument_typeContext _localctx = new Argument_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argument_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 28, RULE_vooralle_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__11);
			setState(133);
			vooralle_blok();
			setState(134);
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
		enterRule(_localctx, 30, RULE_vooralle_blok);
		try {
			_localctx = new VooralleBlokExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(HAAKOPEN);
			setState(137);
			match(DATATYPE);
			setState(138);
			match(ID);
			setState(139);
			match(T__12);
			setState(140);
			atom();
			setState(141);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expressie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new MinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(144);
				match(MINUS);
				setState(145);
				expressie(7);
				}
				break;
			case T__13:
				{
				_localctx = new NietExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(T__13);
				setState(147);
				expressie(6);
				}
				break;
			case T__9:
			case T__10:
			case T__14:
			case HAAKOPEN:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomCondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new VergelijkingExprContext(new ExpressieContext(_parentctx, _parentState));
						((VergelijkingExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressie);
						setState(151);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152);
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
						setState(153);
						((VergelijkingExprContext)_localctx).rightExpr = expressie(6);
						}
						break;
					case 2:
						{
						_localctx = new GelijkheidExprContext(new ExpressieContext(_parentctx, _parentState));
						((GelijkheidExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressie);
						setState(154);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(155);
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
						setState(156);
						((GelijkheidExprContext)_localctx).rightExpr = expressie(5);
						}
						break;
					case 3:
						{
						_localctx = new EnenExprContext(new ExpressieContext(_parentctx, _parentState));
						((EnenExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressie);
						setState(157);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(158);
						match(EN);
						setState(159);
						((EnenExprContext)_localctx).rightExpr = expressie(4);
						}
						break;
					case 4:
						{
						_localctx = new OfofExprContext(new ExpressieContext(_parentctx, _parentState));
						((OfofExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressie);
						setState(160);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(161);
						match(OF);
						setState(162);
						((OfofExprContext)_localctx).rightExpr = expressie(3);
						}
						break;
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public Value_expressieContext leftExpr;
		public Token op;
		public Value_expressieContext rightExpr;
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
		public Value_expressieContext leftExpr;
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
		public Value_expressieContext leftExpr;
		public Token op;
		public Value_expressieContext rightExpr;
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
		public Value_expressieContext leftExpr;
		public Token op;
		public Value_expressieContext rightExpr;
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_value_expressie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomValueExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(169);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new KeerGddModExprContext(new Value_expressieContext(_parentctx, _parentState));
						((KeerGddModExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value_expressie);
						setState(171);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(172);
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
						setState(173);
						((KeerGddModExprContext)_localctx).rightExpr = value_expressie(6);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinExprContext(new Value_expressieContext(_parentctx, _parentState));
						((PlusMinExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value_expressie);
						setState(174);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(175);
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
						setState(176);
						((PlusMinExprContext)_localctx).rightExpr = value_expressie(5);
						}
						break;
					case 3:
						{
						_localctx = new IsRekenExprContext(new Value_expressieContext(_parentctx, _parentState));
						((IsRekenExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value_expressie);
						setState(177);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(178);
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
						setState(179);
						((IsRekenExprContext)_localctx).rightExpr = value_expressie(4);
						}
						break;
					case 4:
						{
						_localctx = new MinminPlusPlusExprContext(new Value_expressieContext(_parentctx, _parentState));
						((MinminPlusPlusExprContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value_expressie);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(185);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MINUS:
							{
							setState(181);
							match(MINUS);
							setState(182);
							match(MINUS);
							}
							break;
						case PLUS:
							{
							setState(183);
							match(PLUS);
							setState(184);
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
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 36, RULE_atom);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAAKOPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(HAAKOPEN);
				setState(193);
				expressie(0);
				setState(194);
				match(HAAKSLUIT);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
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
				setState(198);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(STRING);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
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
		case 16:
			return expressie_sempred((ExpressieContext)_localctx, predIndex);
		case 17:
			return value_expressie_sempred((Value_expressieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressie_sempred(ExpressieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u00ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\7\5B\n\5\f\5"+
		"\16\5E\13\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\5\13h\n\13\3\f\3\f\3\f\5\fm\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\5\rv\n\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16~\n\16\f\16\16\16\u0081\13\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0098\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00a6\n\22\f\22\16\22\u00a9"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00bc\n\23\7\23\u00be\n\23\f\23\16\23\u00c1"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cc\n\24\3"+
		"\24\2\4\"$\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\n\4\2\f\r"+
		".\60\3\2\26\31\3\2\24\25\3\2\34\36\3\2\32\33\3\2\37\"\3\2/\60\3\2\f\r"+
		"\u00d8\2(\3\2\2\2\4.\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nJ\3\2\2\2\fN\3\2\2"+
		"\2\16R\3\2\2\2\20Y\3\2\2\2\22_\3\2\2\2\24g\3\2\2\2\26i\3\2\2\2\30q\3\2"+
		"\2\2\32\177\3\2\2\2\34\u0084\3\2\2\2\36\u0086\3\2\2\2 \u008a\3\2\2\2\""+
		"\u0097\3\2\2\2$\u00aa\3\2\2\2&\u00cb\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3"+
		"\2\2\2+-\5\6\4\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2"+
		"\60.\3\2\2\2\61<\5\b\5\2\62<\5\f\7\2\63<\5\36\20\2\64<\5\n\6\2\65<\5\30"+
		"\r\2\66<\5\26\f\2\67<\5\20\t\289\5$\23\29:\7#\2\2:<\3\2\2\2;\61\3\2\2"+
		"\2;\62\3\2\2\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2"+
		"\2\2;8\3\2\2\2<\7\3\2\2\2=>\7\3\2\2>C\5\22\n\2?@\7\4\2\2@B\5\22\n\2A?"+
		"\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DH\3\2\2\2EC\3\2\2\2FG\7\5\2\2G"+
		"I\5\24\13\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JK\7\6\2\2KL\5\"\22\2LM\5\24"+
		"\13\2M\13\3\2\2\2NO\7\7\2\2OP\5\16\b\2PQ\5\24\13\2Q\r\3\2\2\2RS\7%\2\2"+
		"ST\5\20\t\2TU\5\"\22\2UV\7#\2\2VW\5$\23\2WX\7&\2\2X\17\3\2\2\2YZ\7(\2"+
		"\2Z[\7.\2\2[\\\7$\2\2\\]\5\"\22\2]^\7#\2\2^\21\3\2\2\2_`\5\"\22\2`a\5"+
		"\24\13\2a\23\3\2\2\2bc\7\b\2\2cd\5\4\3\2de\7\t\2\2eh\3\2\2\2fh\5\6\4\2"+
		"gb\3\2\2\2gf\3\2\2\2h\25\3\2\2\2ij\7.\2\2jl\7%\2\2km\5\32\16\2lk\3\2\2"+
		"\2lm\3\2\2\2mn\3\2\2\2no\7&\2\2op\7#\2\2p\27\3\2\2\2qr\7\n\2\2rs\7.\2"+
		"\2su\7%\2\2tv\5\32\16\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7&\2\2xy\5\24"+
		"\13\2y\31\3\2\2\2z{\5\34\17\2{|\7\13\2\2|~\3\2\2\2}z\3\2\2\2~\u0081\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0082\u0083\5\34\17\2\u0083\33\3\2\2\2\u0084\u0085\t\2\2\2\u0085"+
		"\35\3\2\2\2\u0086\u0087\7\16\2\2\u0087\u0088\5 \21\2\u0088\u0089\5\24"+
		"\13\2\u0089\37\3\2\2\2\u008a\u008b\7%\2\2\u008b\u008c\7(\2\2\u008c\u008d"+
		"\7.\2\2\u008d\u008e\7\17\2\2\u008e\u008f\5&\24\2\u008f\u0090\7&\2\2\u0090"+
		"!\3\2\2\2\u0091\u0092\b\22\1\2\u0092\u0093\7\32\2\2\u0093\u0098\5\"\22"+
		"\t\u0094\u0095\7\20\2\2\u0095\u0098\5\"\22\b\u0096\u0098\5&\24\2\u0097"+
		"\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u00a7\3\2"+
		"\2\2\u0099\u009a\f\7\2\2\u009a\u009b\t\3\2\2\u009b\u00a6\5\"\22\b\u009c"+
		"\u009d\f\6\2\2\u009d\u009e\t\4\2\2\u009e\u00a6\5\"\22\7\u009f\u00a0\f"+
		"\5\2\2\u00a0\u00a1\7\23\2\2\u00a1\u00a6\5\"\22\6\u00a2\u00a3\f\4\2\2\u00a3"+
		"\u00a4\7\22\2\2\u00a4\u00a6\5\"\22\5\u00a5\u0099\3\2\2\2\u00a5\u009c\3"+
		"\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8#\3\2\2\2\u00a9\u00a7\3\2\2\2"+
		"\u00aa\u00ab\b\23\1\2\u00ab\u00ac\5&\24\2\u00ac\u00bf\3\2\2\2\u00ad\u00ae"+
		"\f\7\2\2\u00ae\u00af\t\5\2\2\u00af\u00be\5$\23\b\u00b0\u00b1\f\6\2\2\u00b1"+
		"\u00b2\t\6\2\2\u00b2\u00be\5$\23\7\u00b3\u00b4\f\5\2\2\u00b4\u00b5\t\7"+
		"\2\2\u00b5\u00be\5$\23\6\u00b6\u00bb\f\4\2\2\u00b7\u00b8\7\32\2\2\u00b8"+
		"\u00bc\7\32\2\2\u00b9\u00ba\7\33\2\2\u00ba\u00bc\7\33\2\2\u00bb\u00b7"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00ad\3\2\2\2\u00bd"+
		"\u00b0\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b6\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0%\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00c3\7%\2\2\u00c3\u00c4\5\"\22\2\u00c4\u00c5\7&\2\2\u00c5"+
		"\u00cc\3\2\2\2\u00c6\u00cc\t\b\2\2\u00c7\u00cc\t\t\2\2\u00c8\u00cc\7."+
		"\2\2\u00c9\u00cc\7\61\2\2\u00ca\u00cc\7\21\2\2\u00cb\u00c2\3\2\2\2\u00cb"+
		"\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00ca\3\2\2\2\u00cc\'\3\2\2\2\21.;CHglu\177\u0097\u00a5\u00a7"+
		"\u00bb\u00bd\u00bf\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}