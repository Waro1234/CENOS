grammar DutchJava;

parse: blok EOF;

blok: statement*;

statement: als_statement #alsStatement
 | voor_statement #voorStatement
 | vooralle_statement #voorAlleStatement
 | zolang_statement #zolangStatement
 | methodeUITVOERING #methodeUitvoeringStatement
 | methodeAANROEP #methodeAanroepStatement
 | toekenning #toekenningStatement
 | value_expressie SEMICOL #expressieStatement;

als_statement: 'als' conditie_block ('alsanders' conditie_block)* ('anders' stat_blok)?;

zolang_statement: 'zolang' expressie stat_blok;

voor_statement: 'voor' voor_blok stat_blok;
voor_blok: HAAKOPEN toekenning expressie SEMICOL value_expressie HAAKSLUIT;

toekenning: DATATYPE ID KENTOE expressie SEMICOL;

conditie_block: expr=expressie sBlock=stat_blok;

stat_blok: '{' blok '}' | statement;

methodeAANROEP: ID HAAKOPEN argument? HAAKSLUIT SEMICOL;
methodeUITVOERING: 'functie' ID HAAKOPEN argument? HAAKSLUIT stat_blok;
argument: (argument_type ',')* argument_type;
argument_type: ID | INT | FLOAT | 'waar' | 'onwaar';

vooralle_statement:'vooralle' vooralle_blok stat_blok;
vooralle_blok: HAAKOPEN DATATYPE ID ':' atom HAAKSLUIT #vooralleBlokExpr;

expressie:  MINUS expressie #minusExpr
 | '!' expressie #nietExpr
 | leftExpr=expressie op=(KLEINERGELIJK | GROTERGELIJK | KLEINERDAN | GROTERDAN) rightExpr=expressie #vergelijkingExpr
 | leftExpr=expressie op=(GELIJKAAN | NIETGELIJKAAN) rightExpr=expressie #gelijkheidExpr
 | leftExpr=expressie EN rightExpr=expressie #enenExpr
 | leftExpr=expressie OF rightExpr=expressie #ofofExpr
 | atom #atomCondExpr;

value_expressie:  value_expressie op=(KEER | GEDEELDDOOR | MODULO ) value_expressie #keerGddModExpr
 | value_expressie op=(PLUS | MINUS) value_expressie #plusMinExpr
 | value_expressie op=(KEERIS | GEDEELDDOORIS | MINIS | PLUSIS) value_expressie #isRekenExpr
 | value_expressie (MINUS MINUS | PLUS PLUS) #minminPlusPlusExpr
 | atom #atomValueExpr;

atom: HAAKOPEN expressie HAAKSLUIT
 | (INT | FLOAT)
 | ('waar' | 'onwaar')
 | ID
 | STRING
 | 'nul';

OF : '||' | 'of';
EN : '&&' | 'en';
GELIJKAAN : '==';
NIETGELIJKAAN : '!=';
GROTERDAN : '>';
KLEINERDAN : '<';
GROTERGELIJK : '>=';
KLEINERGELIJK : '<=';

MINUS : '-';
PLUS : '+';
KEER : '*';
GEDEELDDOOR : '/';
MODULO : '%';
PLUSIS: '+=' | '=+';
MINIS: '-=' | '=-';
KEERIS: '*=' | '=*';
GEDEELDDOORIS: '/=' | '=/';

SEMICOL : ';';
KENTOE : '=' | 'is';
HAAKOPEN : '(';
HAAKSLUIT : ')';
GEEFTERUG: 'geefterug';

DATATYPE: (DRAAD | NUMMER | LANG | BOOLEAANS | LEEGTE);
DRAAD: 'draad';
NUMMER: 'nummer';
LANG: 'lang';
BOOLEAANS: 'booleaans';
LEEGTE: 'leegte';

ID: [a-zA-Z_] [a-zA-Z_0-9]*;

INT: [0-9]+;

FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+;

STRING: '"' (~["\r\n] | '""')* '"';

COMMENT: '@@' ~[\r\n]* -> skip;

SPACE: [ \t\r\n] -> skip;