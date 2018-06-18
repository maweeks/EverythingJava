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
// a equals b
a == b

// a does not equal b
a != b

// a is greater than or equal to b
a >= b

// a is less than or equal to b
a <= b

// a is greater than b
a > b

// a is less than b
a < b
```

### String comparison:

```
// stringOne equals stringTwo
stringOne.equals(stringTwo);
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


### Arrays

```
// Create an array of size five
String [] myList = new String[5];

// Add to my array at position zero
myList[0] = "My list text.";

// Get from my array at position zero
myList[0];
```

### ArrayLists

```
// Import the class (at top of file)
import java.util.ArrayList;

// Create an ArrayList
ArrayList<String> myArrayList = new ArrayList<String>();

// Add to my ArrayList
myArrayList.add("My list text.");

// Get from my array at position zero
myArrayList.get(0);
```

### Loops

```
// For loop
for (int i = 0; i < 10; i++) {
    // looped code goes here
}

// While loop
while (condition) {
    // looped code goes here
}
```


### Switch statement

```
// Switch over String variable grade to get grade boundary.
String grade = "B";
int gradeBoundary = -1;
switch (grade) {
    case "A":
        gradeBoundary = 80;
        break;
    case "B":
        gradeBoundary = 60;
        break;
    case "C":
        gradeBoundary = 40;
        break;
    default:
        gradeBoundary = 0;
        break;
}
```

### Methods

```
// Example method to return the sum of two numbers
private int addNumbers(int firstNumber, int secondNumber) {
    return (firstNumber + secondNumber);
}

// scope returnType methodName(variableType, variableName)
// method will end at the return statement.
```

### Escape characters

```
// In Java, the \ character allows you to use reserved characters in strings
// To output \
String example = "\\";

// To output "
String example = "\"";

// To output a new line
String example = "\n";

// To output a tab
String example = "\t";
```
### Constants

```
// Constants are definted at the top of a class
public class MyClass {
    public static final String APP_NAME = “Test Constants”;
    public static final String APP_VERSION = “V0.0.1”;
    // Rest of class code goes here…
}
```

### Class constructors

```
// Constructors are used to initialise a class.
public class MyClassName {
    public String name;
    public MyClassName(String name) {
        this.name = name;
    }
}
```

### Scopes

Scopes define what parts of the program can access the variable / method / class.

| modifier | class | package | subclass | world |
| ------ | ------ | ------ | ------ | ------ |
| public | yes | yes | yes | yes |
| protected | yes | yes | yes | no |
| default | yes | yes | no | no |
| private | yes | no | no | no |

### Getters and setters

```
// Used to encapsulate variables so methods are used rather than accessing the variable directly.
private int price;

public int getPrice() {
    return price;
}

public void setPrice(int price) {
    this.price = price;
}
```

### Imports

```
// individual import
import java.util.ArrayList;

// wildcard import (star import)
import java.util.*;

// use individual imports where possible
```

### Logging example

```
import java.util.logging.Level;
import java.util.logging.Logger;

public class TempMain {
    private static final Logger LOGGER = Logger.getLogger("");
    public static void main(String[] args) {
        LOGGER.info("Logger Name: "+LOGGER.getName());
    }
}
```

### Subclass

```
// To create a subclass add the extends keyword to the class definition.
public class Dog extends Animal {
    private String breed;

    public Dog(String breed, int numberOfLegs) {
        super(numberOfLegs);

        this.breed = breed;
    }
}
```

### Casting

```
// Casting an Animal to the class dog.
Animal animal = new Animal();
Dog newDog = (Dog) animal;
```

### Try / catch

```
// Allows you to handle errors instead of the program getting stopped.
try {
    // expression that could throw an error
} catch (Exception e) {
    // action when error is thrown
    System.out.println(e);
}
```
