/*
    Title: BufferReader Class in Java
    - BufferReader is a Class in java which used to read the data inserted on the command prompt.
*/

// package declaration
package inputs;

// Importing necessary classes from the IO package
// BufferedReader class is used to read input from the command prompt
import java.io.BufferedReader;
// Importing IOException to handle Exceptions during IO operations.
import java.io.IOException;
// It converts bytes (raw data) coming from an input stream into characters that Java can understand and work with.
import java.io.InputStreamReader;

// Definition of the class
public class BufferReaderClass{
    // Definition of the main() method
    public static void main(String[] args) throws IOException{
        // InputStreamReader object declaration.
        InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader object declaration.
        BufferedReader bf = new BufferedReader(in);
        
        System.out.print("Enter any value: ");
        // Using Integer class to type caste string into the Integer value.
        int num = Integer.parseInt(bf.readLine());

        // printing value of num
        System.out.println("Value is " + num);
    }
};