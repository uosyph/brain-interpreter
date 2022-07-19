# Brainfu*k Interpreter

Brainfu*k interpreter written in Java.

By: Yousef Saeed

---

## Brainfu*k Basics

*brainfuck* is all about memory manipulation, you are given an array of 30000 1byte memory blocks (can be changed in the interpretor but 30000 is the standered), and there are only 8 operators available to use :

```brainfuck
> = moves the pointer 1 block to the right
< = moves the pointer 1 block to the left
+ = increases value at the block pointed to by the memory pointer
- = decreases value at the block pointed to by the memory pointer
[ = start loop
] = if block currently pointed to's value is not zero, jump back to [
, = input 1 character
. = print 1 character to the console
```
Any other character beside the one listed above is ignored.

### Examples

* Hello World!
```brainfuck
++++++++++[>+>+++>+++++++>++++++++++<<<<-]>>>++.>+.+++++++..+++.<<++.>+++++++++++++++.>.+++.------.--------.<<+.<.
```

* ASCII charachter set
```brainfuck
.+[.+]
```

---

## Build and Run

```
git clone https://github.com/yousafesaeed/brain-interpreter.git
cd brain-interpreter/src/
javac App.java
java App.java
```

### Notes

I am aware of the bugs in the interpreter, and I will get to work on them somewhere in the future.

### Suggestions

If you have any question or suggestions I'm more than happy to hear from you.

```brainfuck
++++++++++[>+>+++>+++++++>++++++++++<<<<-]>>>>+++++++++++++++++++++.----------.++++++.--.------------------.+++++.-.++++++++++++++.------------------.++++..-.<------.>+++.++++++.------------.++++++++.+++.<<++++++++++++++++.>>---------.++++++++++++.--.
```

