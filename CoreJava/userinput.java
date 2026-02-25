// ------------------------------
// UNDERSTANDING System.out.print()
// ------------------------------

// Our Java program automatically imports the java.lang package.
// So writing: import java.lang.System; is not required explicitly.

// The java.lang package contains fundamental classes that are essential 
// for every Java program, such as String, Math, Object, and System.

// The System class inside java.lang provides access to system-level resources 
// like standard input, standard output, error streams, memory, and time functions.

// System.out is a static object inside the System class.
// It represents the standard output stream, which is usually connected to the terminal (console).

// The 'out' object is an instance of the PrintStream class.

// When we write: System.out.println();
// We are calling the println() method of the PrintStream class.
// This method prints the given data to the terminal and then moves the cursor to the next line.

// So technically:
// System  → Class
// out     → Static object inside System
// println → Method inside PrintStream class

// This means we are sending data from our Java program → to the terminal.



// ------------------------------
// HOW TO GET USER INPUT
// ------------------------------

// Using System.out, we send data from the program (code) to the terminal.

// To send data from the terminal (keyboard input) back to the program,
// we use the Scanner class.

// System.in represents the standard input stream (keyboard).

// Scanner reads data from System.in and allows us to store that input in variables.

// So the data flow becomes:
// Keyboard → System.in → Scanner → Variable → Processing → System.out → Terminal



import java.lang.System; 
// No need to import this explicitly because java.lang is automatically imported.

import java.util.Scanner; 
// Scanner belongs to java.util package, so we must import it manually.

class userinput{
    public static void main(String args[]) 
    {
        // Creating a Scanner object named 'john'
        // System.in connects the Scanner to the keyboard input
        Scanner john = new Scanner(System.in);

        // nextLine() reads an entire line of text entered by the user
        String c = john.nextLine();

        // nextInt() reads integer input from the user
        int a = john.nextInt();
        int b = john.nextInt();

        // Prints the sum of a and b to the terminal
        System.out.println(a+b);

        // Prints the string entered by the user
        System.out.println(c);
    }
}
