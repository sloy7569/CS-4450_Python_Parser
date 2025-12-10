grammar deliverable3;

tokens { INDENT, DEDENT }

@lexer::members {
    java.util.Stack<Integer> indents = new java.util.Stack<>();
    java.util.Queue<org.antlr.v4.runtime.Token> pendingTokens = new java.util.LinkedList<>();
    {
        indents.push(0);
    }

    int getIndentationCount(String ws) {
        int count = 0;
        for(char ch : ws.toCharArray()) {
            if(ch == '\t'){
                count += 4;
            } else if(ch == ' '){
                count += 1;
            }
        }
        return count;
    }

    org.antlr.v4.runtime.Token createToken(int type) {
        org.antlr.v4.runtime.CommonToken t = new org.antlr.v4.runtime.CommonToken(type);
        if (type == deliverable3Parser.INDENT){
            t.setText("<INDENT>");
        }
        else if (type == deliverable3Parser.DEDENT){
            t.setText("<DEDENT>");
        }
        return t;
    }

    void handleIndent() {
        StringBuilder ws = new StringBuilder();
        while (_input.LA(1) == '\t' || _input.LA(1) == ' ') {
            ws.append((char)_input.LA(1));
            _input.consume();
        }
        
        int curr = getIndentationCount(ws.toString());
        int prev = indents.peek();

        if (curr > prev) {
            indents.push(curr);
            pendingTokens.add(createToken(deliverable3Parser.INDENT));
        }
        else {
            while(curr < prev) {
                indents.pop();
                prev = indents.peek();
                pendingTokens.add(createToken(deliverable3Parser.DEDENT));
            }
        }
    }

    @Override
    public org.antlr.v4.runtime.Token nextToken() {
        if (!pendingTokens.isEmpty()){
            return pendingTokens.poll();
        }
        org.antlr.v4.runtime.Token t = super.nextToken();

        if(t.getType() == NEWLINE){
            handleIndent();
        }
        return t;
    }
}

// Start
program: (statement NEWLINE*)* EOF;

// Statements
statement
    : assignment
    | ifstatement
    | whilestatement
    | forstatement
    ;

// If Statements (includes if, any # of elif, and an optional else)
ifstatement
    : IF condition COLON block (ELIF condition COLON block)* (ELSE COLON block)?
    ;

// While Loop
whilestatement
    : WHILE condition COLON block
    ;

// For Loop
forstatement
    : FOR VAR IN (VAR | rangeexpr) COLON block
    ;

rangeexpr
    : RANGE '(' expression COMMA expression ')'
    ;

// Block (1+ statements that would be executed if a given condition is met)
block
    : NEWLINE INDENT (statement NEWLINE*)+ DEDENT
    ;

// Conditions
condition
    : expression comparisonOperator expression
    | NOT condition
    | condition AND condition
    | condition OR condition
    | '(' condition ')'
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
    | ('+' | '-') expression                // to handle unary operator in 2nd deliverable
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

// Comparison Operators
comparisonOperator
    : '<'
    | '<='
    | '>'
    | '>='
    | '=='
    | '!='
    ;


// Tokens

// Assignment Operator definitions
EQUALS: '=';
PLUS_EQUALS: '+=';
MINUS_EQUALS: '-=';
TIMES_EQUALS: '*=';
DIV_EQUALS: '/=';

// Array definitions
LBRACKET: '[';
RBRACKET: ']';
COMMA: ',';
COLON: ':';

LPAREN: '(';
RPAREN: ')';

// Definitions
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
IN: 'in';
RANGE: 'range';
AND: 'and';
OR: 'or';
NOT: 'not';


// Literal definitions
BOOLEAN: 'True' | 'False';
STRING
    : '"' ( ~["\\\r\n] | '\\' . )* '"'
    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
    ;
FLOAT: [0-9]+'.'[0-9]+;
NUMBER: [0-9]+;
VAR: [a-zA-Z_][a-zA-Z0-9_]*;

LINECOMMENT: '#' ~[\r\n]* -> skip;
BLOCKCOMMENT: '\'\'\'' ( . | '\r' | '\n' )*? '\'\'\'' -> skip;

NEWLINE: '\r'? '\n';
WS: [ ]+ -> skip;