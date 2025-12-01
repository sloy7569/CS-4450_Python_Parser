# CS-4450 Python Parser Project

## Project Description
This project is a Python 3 parser using ANTLR and Java. The goal of the project is to parse specific pieces of Python syntax using an ANTLR .g4 file.

There are 3 deliverables in this project, each one includes the contents of the last:
- **Deliverable 1**
  - Arithmetic Operators
  - Assignment Operators
- **Deliverable 2**
  - if/elif/else blocks
  - Conditional Statements
- **Deliverable 3**
  - while and for loops
  - Nested Structures
  - Support for comments

## Team Members
- Spencer Loy

## Requirements
- Java 17+ (recommended)
- ANTLR 14.3.2
- OS: macOS, Windows, Linux
- IDE: VS Code (recommended)

## Setup Instructions (for macOS)

### Install Java
```
bash
java -version
javac -version
```
### Install ANTLR

Place this in /lib folder
```
antlr-4.13.2-complete.jar
```

### Generate Parser Files

```
java -jar lib/antlr-4.13.2-complete.jar -Dlanguage=Java -visitor -o generated_files/deliverable3 deliverable3.g4
```

### Compile Project

```
javac -cp "lib/antlr-4.13.2-complete.jar:generated_files/deliverable3:src/main/java" generated_files/deliverable3/*.java src/main/java/*.java
```

### Run Parser

```
java -cp "lib/antlr-4.13.2-complete.jar:generated_files/deliverable3:src/main/java" ParserMainD3 tests/pythontestd3.py
```

### Demo Link
test
