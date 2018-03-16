# Java Cheat Sheet

This document is designed to cover all of basics that you might need to be able to write basic Java programs.

### Defining a class:

```
public class myAmazingClass {
    // Class code goes here
}
```

### Main method:

```
public static void main(String[] args) {
    // Method code goes here
}
```

### Console:


```
// Outputting to the console
System.out.println("Text to output to console.");
```

### Example program:
```
public class myAmazingClass {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

### Comments:

```
// This is a single line comment

/* This is a
    multi line
    comment */
```

### Variables:

```
// Declaring an int variable called myInteger.
int myInteger;

// Declaring multiple int variables called myFirstInt, and mySecondInt.
int myFirstInt, mySecondInt;

// Assigning the value 73 to a variable called myInteger.
myInteger = 73;

// Declaring a variable and assigning it a value in one line.
int myIntger = 73;
```

### Numeric operators:

```
// Add two numbers together
myInteger = 44 + 33;

// Subtract one number from another
myInteger = 44 - 33;

// Divide one number from another
myInteger = 44 / 11;

// Multiply two numbers together
myInteger = 22 * 11;

// Calculate the remainder from a division
myInteger = 22 % 11;
```

```
// Increment my variable by one
myInteger++;

// Decrement my value by one
myInteger--;

// Increment my variable by a given value (in this case 5)
myInteger+=5;

// Decrement my variable by a given value (in this case 5)
myInteger-=5;
```

### Boolean operators:

```
// Logical AND
myBool = a && b;

// Logical OR
myBool = a || b;

// Exclusive OR
myBool = a ^ b;

// Logical NOT
myBool = !a;
```

| a | b | a AND b | a OR b | a XOR b | NOT a |
| ------ | ------ | ------ | ------ | ------ | ------ |
| false | false | false | false | false | true |
| false | true | false | true | true | true |
| true | false | false | true | true | false |
| true | true | true | true | false | false |

### If statements:

```
boolean boolA, boolB;
if (boolA) {
    // code to run if boolA is true
}
else if (boolB) {
    // code to run if boolB is true
}
else {
    // code to run if all previous conditions are false
}
```

### Number comparison:

```

```

### String comparison:

```

```

### Reading from the console:

```
// at the top of the file
import java.util.Scanner;

// inside the method that you want to read the user input in
Scanner sc = new Scanner(System.in);

// at the position in the file where you want to read the user's input
String myString = sc.nextLine();

```












