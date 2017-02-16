grammar Gram2;

parse: blok EOF;

blok: statement*;

statement: toekenning
 | als_statement
 | zolang_statement
 | methodeUITVOERING
 | methodeAANROEP
 | vooralle_statement
 | OTHER {System.err.println("unknown char: " + $OTHER.text);};

als_statement: ALS conditie_block (ALS ANDERS conditie_block)* (ANDERS stat_block)?;

zolang_statement: ZOLANG expressie stat_block;

vooralle_statement:VOORALLE expressie stat_block;

//voor_statement: VOOR voor_blok stat_block;
//voor_blok: HAAKOPEN toekenning expressie SEMICOL verandering HAAKSLUIT;

toekenning: DATATYPE ID KENTOE expressie SEMICOL;

conditie_block: expressie stat_block;

stat_block: VISHAAKOPEN blok VISHAAKSLUIT | statement;

methodeAANROEP: ID expressie SEMICOL;

methodeUITVOERING: FUNCTIE ID expressie stat_block;

expressie:  MINUS expressie
 | NIET expressie
 | expressie DUBBELEPUNT expressie
 | DATATYPE expressie
 |(ID ',')* ID
 | expressie op=(KEER | GEDEELDDOOR | MODULO) expressie
 | expressie op=(PLUS | MINUS) expressie
 | expressie op=(KLEINERGELIJK | GROTERGELIJK | KLEINERDAN | GROTERDAN) expressie
 | expressie op=(GELIJKAAN | NIETGELIJKAAN) expressie
 | expressie EN expressie
 | expressie OF expressie
 | atom;

atom
 : HAAKOPEN expressie HAAKSLUIT
 | (INT | FLOAT)
 | (WAAR | ONWAAR)
 | ID
 | STRING
 | NULL;

verandering:ID (KEER KENTOE ID | KENTOE KEER ID | KEER KEER
              | PLUS KENTOE ID | KENTOE PLUS ID | PLUS PLUS
              | MINUS KENTOE ID | KENTOE MINUS ID | MINUS MINUS
              | GEDEELDDOOR KENTOE ID | KENTOE GEDEELDDOOR ID | GEDEELDDOOR GEDEELDDOOR);

OF : '||' | 'or';
EN : '&&' | 'en';
GELIJKAAN : '==';
NIETGELIJKAAN : '!=';
GROTERDAN : '>';
KLEINERDAN : '<';
GROTERGELIJK : '>=';
KLEINERGELIJK : '<=';
NIET : '!';

PLUS : '+';
MINUS : '-';
KEER : '*';
GEDEELDDOOR : '/';
MODULO : '%';

DUBBELEPUNT: ':';
SEMICOL : ';';
KENTOE : '=';
HAAKOPEN : '(';
HAAKSLUIT : ')';
VISHAAKOPEN : '{';
VISHAAKSLUIT : '}';

WAAR : 'waar';
ONWAAR : 'onwaar';
NULL : 'null';
ALS : 'als';
ANDERS : 'anders';
ZOLANG : 'zolang';
FUNCTIE: 'functie';
VOOR: 'voor';
VOORALLE: 'vooralle';
GEEFTERUG: 'geefterug';

DATATYPE: (DRAAD | NUMMER | LANG | BOOLEAANS);
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

WS: ' ' ->skip