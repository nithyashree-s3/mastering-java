class Variables_datatypes{
    public static void main (String args[])
    {
        int container = 67; // here int is datatype, container is the variable name, = is the operator and 67 is the value
        String John = "J";  // String is datatype, John is variable, "J" is value
        String container2 = "John"; // String datatype, container2 variable, "John" value
        int a = 10;          // int datatype, a variable, 10 value
        int b = 20;          // int datatype, b variable, 20 value

        System.out.print(container);       // prints 67 without newline
        System.out.println(container2);    // prints John with newline
        System.out.println(a+b);           // prints sum of a and b → 30
        System.out.println("a+b");         // prints the text a+b literally
    }
}

// Variables and Data Types
// Variables - are containers that store your data
// Data Types - like fish pots, before putting fish in, you must choose the right pot. Similarly in Java, you must declare the type of data a variable will hold.
// Syntax - data_type variable_name = value
// Example: int number = 50; String name = "Nithya";

// Operators used in this example:
// =  → assignment operator (stores value in variable)
// +  → addition operator (adds numbers)

// Printing statements:
// System.out.print(variable) → prints value without newline
// System.out.println(variable) → prints value with newline
// Text inside double quotes → printed literally, not treated as variable

//DATATYPE
//Java is a statically typed language,meaning you must declare variable types before they can be used.This  helps catch erroe at compile time.
//Primitive Data Types                                Reference/Data Object Types
//byte           double                               String
//short          boolean                              Array
//int            char                                 Class Objects
//long
//float

//1.byte:
//- Minimum: -128(-2^7)
//- Maximum: 127(2^7-1)

//2.short:
//- Minimum: -32,768(-2^15)
//- Maximum: 32,767(2^15-1)

// 3. int
// int is used to store whole numbers (without decimals).
// It occupies 4 bytes (32 bits) of memory.
// Range: -2,147,483,648 to 2,147,483,647.
// Example:
int a = 10;  // Declaring an integer variable and assigning value 10


// 4. long
// long is used to store large whole numbers.
// It occupies 8 bytes (64 bits) of memory.
// Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
// Must end with L or l when assigning literal value.
// Example:
long b = 10L;  // Declaring a long variable with L suffix


// Note:
// Choose int or long based on the range of values required.


// 5. float
// float is used to store decimal numbers (single precision).
// It occupies 4 bytes of memory.
// Can store approximately 6 to 7 decimal digits.
// Must end with f or F because decimal values are double by default.
// Example:
float c = 5.23f;  // Declaring a float variable


// 6. double
// double is used to store decimal numbers (double precision).
// It occupies 8 bytes of memory.
// Can store approximately 15 decimal digits.
// Commonly used for storing decimal values.
// Example:
double d = 5.23456789123456;  // Declaring a double variable


// 7. char
// char is used to store a single character.
// It occupies 2 bytes of memory in Java (Unicode).
// Character must be enclosed in single quotes.
// Example:
char ch = 'A';  // Declaring a char variable


// String
// String is a non-primitive data type (object).
// It represents a sequence of characters.
// Internally, String stores characters as an array of char values.
// Must be enclosed in double quotes.
// Example:
String greeting = "Hello, World!";  // Declaring a String
System.out.println(greeting.charAt(7));  // Accessing character at index 7


// 8. boolean
// boolean is used to store only two values: true or false.
// It represents logical values.
// Commonly used in conditions and decision making.
// Example:
boolean isOn = true;   // Boolean variable with true value
boolean isOff = false; // Boolean variable with false value
