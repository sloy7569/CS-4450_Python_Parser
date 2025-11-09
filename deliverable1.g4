grammar deliverable1;

// Start
program: statement* ;

// Statements
statement
    : assignment
    | expression
    ;

// Assignments
assignment
    : VAR EQUALS expression
    | VAR PLUS_EQUALS expression
    | VAR MINUS_EQUALS expression
    | VAR TIMES_EQUALS expression
    | VAR DIV_EQUALS expression
    ;

// Expressions
expression
    : literal
    | VAR
    | expression op=('*'|'/') expression
    | expression op=('+'|'-'|'%') expression
    | '(' expression ')'
    ;

// Literals
literal
    : NUMBER
    | FLOAT
    | STRING
    | BOOLEAN
    | array
    ;

// Array 
array
    : LBRACKET (expression (COMMA expression)*)? RBRACKET
    ;

// Tokens
EQUALS: '=';
PLUS_EQUALS: '+=';
MINUS_EQUALS: '-=';
TIMES_EQUALS: '*=';
DIV_EQUALS: '/=';

LBRACKET: '[';
RBRACKET: ']';
COMMA: ',';


// Identifiers and literal defs
BOOLEAN: 'True' | 'False';
STRING: ('"' (~["\\\r\n])* '"' | '\'' (~['\\\r\n])* '\'');
NUMBER: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
VAR: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;