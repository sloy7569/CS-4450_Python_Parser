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
    : expression op=('*'|'/') expression
    | expression op=('+'|'-'|'%') expression
    | '(' expression ')'
    | NUMBER
    | VAR
    ;

// Tokens
EQUALS: '=';
PLUS_EQUALS: '+=';
MINUS_EQUALS: '-=';
TIMES_EQUALS: '*=';
DIV_EQUALS: '/=';

VAR: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;