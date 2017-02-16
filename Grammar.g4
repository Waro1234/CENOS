grammar Grammar;
parse: block EOF;

block: stat*;

stat: als_statement
 | zolang_stat
 | functie_call
 | methodeAANROEP
 | toekenning
 | NL;

/* als stmt*/
als_statement: ALS condition_block NL* (ALSANDERS condition_block)* NL* (ANDERS stat_block)?;

condition_block: HAAKOPEN expr HAAKSLUIT stat_block;

stat_block: OPENVISHAAK block CLOSEVISHAAK | stat;

zolang_stat: ZOLANG HAAKOPEN expr HAAKSLUIT stat_block;
functie_call:FUNCTIES STRING HAAKOPEN ARGUMENTS? HAAKSLUIT OPENVISHAAK block (NL)* GEEFTERUG ID NL* CLOSEVISHAAK;
/* methods */
methodeAANROEP: ID expr ARGUMENTS? expr COL;
ARGUMENTS: ((NUMS | ID) ',')* (NUMS | ID);
toekenning: DATATYPE ID IS expr COL;

expr: MIN expr
 | NEGATIEF expr
 | expr (KEER | GEDEELDDOOR | MODULE) expr
 | expr (PLUS | MIN) expr
 | expr (KLEINERGELIJK | GROTERGELIJK | KLEINERDAN | GROTERDAN) expr
 | expr (GELIJK | NIETGELIJK) expr
 | expr EN expr
 | expr OF expr
 | atom;

atom : HAAKOPEN expr HAAKSLUIT
 | NUMS | FLOAT
 | WAAR | ONWAAR
 | ID   | STRING;

/* Loopjes en if statements*/
ALS: 'als';
ANDERS: 'anders';
ALSANDERS: ALS ANDERS;
ZOLANG: 'zolang';
VOOR: 'voor';
VOORALLE: 'vooralle';
FUNCTIES: 'functie';

/* datatypes*/
DATATYPE: (DRAAD | NUMMER | LANG | BOOLEAANS);
DRAAD: 'draad';
NUMMER: 'nummer';
LANG: 'lang';
BOOLEAANS: 'booleaans';

GEEFTERUG: 'geefterug';

/* Rekenvaardige operators*/
GEDEELDDOOR: '/';
PLUS: '+';
MIN: '-';
KEER: '*';
LOG: 'log';
MODULE: '%';

/* Check operators */
GROTERDAN: '>';
KLEINERDAN: '<';
GROTERGELIJK: '>=';
KLEINERGELIJK: '<=';
GELIJK: '==';
NIETGELIJK:'!=';
NEGATIEF:'!';
OF: 'of' | '||';
EN: 'en' | '&&';
WAAR: 'waar';
ONWAAR: 'onwaar';

/* Variabele shit*/
IS: '=' | 'is';
COL : ';';
OPENVISHAAK:'{';
CLOSEVISHAAK:'}';
COMMA: ',';
HAAKOPEN:'(';
HAAKSLUIT:')';
DRAADKWOOT: '"';

ID: [A-Za-z];

NUMS: [0-9];

FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+;

STRING: '"' (~["\n] | '""')* '"' ;

KOMMENTAAR: '@@'~[\n]* -> skip;

WS : ' ' ->skip;

NL: '\n';