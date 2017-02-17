grammar Gram2;

parse: blok EOF;

blok: statement*;

statement: als_statement
 | voor_statement
 | vooralle_statement
 | zolang_statement
 | methodeUITVOERING
 | methodeAANROEP
 | toekenning
 | expressie SEMICOL;

als_statement: 'als' conditie_block ('alsanders' conditie_block)* ('anders' stat_block)?;

zolang_statement: 'zolang' expressie stat_block;

voor_statement: 'voor' voor_blok stat_block;
voor_blok: HAAKOPEN toekenning expressie SEMICOL expressie HAAKSLUIT;

toekenning: DATATYPE ID KENTOE expressie SEMICOL;

conditie_block: expressie stat_block;

stat_block: '{' blok '}' | statement;

methodeAANROEP: ID HAAKOPEN expressie HAAKSLUIT SEMICOL;
methodeUITVOERING: 'functie' ID HAAKOPEN expressie HAAKSLUIT stat_block;

vooralle_statement:'vooralle' expressie stat_block;

expressie:  MINUS expressie
 | '!' expressie
 | expressie ':' expressie
 | expressie op=(KEER | GEDEELDDOOR | MODULO ) expressie
 | expressie op=(PLUS | MINUS) expressie
 | expressie op=(KEERIS | GEDEELDDOORIS | MINIS | PLUSIS) expressie
 | expressie (KEER KEER| GEDEELDDOOR GEDEELDDOOR | MINUS MINUS | PLUS PLUS)
 | expressie op=(KLEINERGELIJK | GROTERGELIJK | KLEINERDAN | GROTERDAN) expressie
 | expressie op=(GELIJKAAN | NIETGELIJKAAN) expressie
 | expressie EN expressie
 | expressie OF expressie
 | (ID ',')* ID
 | DATATYPE ID
 | atom;

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