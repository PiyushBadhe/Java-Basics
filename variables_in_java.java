/** ******************************
 *  | Types of Variables in Java |
 *  ******************************
 * 
 * 1. Instance Variables
 *  - Instance Variables are declared in a class but outside a method declaration
 *  - Declared without using 'static' keyword
 * 
 * 2. Static Variables
 *  - Initialised only once at the start of program execution
 *  - These variables should be initialised first before initialisation of any instance variable
 *  - Defined in a class but outside method declaration
 * 
 * 3. Local Variables
 *  - Declared inside the body of the method
 */


public class variables_in_java {

    // Declaring an instance variable before static variable and outside body of method
    int speed_limit = 120;

    // Declaring a static variable after instance variable and and outside body of method
    static int fine = 1000;

    public static void main(String[] args) {

        // Declaring a local variable inside body of method
        int vehicle_no = 4545;

    }
}