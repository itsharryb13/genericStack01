package genstack;
import java.util.*;

/**
 * This class demonstrates the usage of the GenStack class by taking user input to
 * push positive numbers onto the stack, printing the stack when a special code is entered,
 * and ending the input when another special code is entered.
 * 
 * Authors:
 * - Harpreet Singh
 * - Ryan Serrano
 * - Luisa Valencia
 */
public class testStack {

    /**
     * Prints the elements of the given generic stack.
     * 
     * @param stack The generic stack to be printed.
     */
    public static void printStack(GenStack<Integer> stack) {
        GenStack<Integer> temp = new GenStack<Integer>();

        // Transfer elements from the original stack to a temporary stack
        while (!stack.isStackEmpty()) {
            int num = stack.pop();
            temp.push(num);
        }

        // Transfer elements back to the original stack and print them
        while (!temp.isStackEmpty()) {
            int num = temp.pop();
            stack.push(num);
            System.out.print(num + " ");
        }
    }

    /**
     * Main method where the program execution starts.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        GenStack<Integer> stack = new GenStack<Integer>();
        Scanner scnr = new Scanner(System.in);

        int num = 0;

        // Loop to take user input until the special code is entered
        do {
            System.out.println("Please enter a positive number to add to the stack.");
            System.out.println("Please enter -9923 to print the stack.");
            System.out.println("Please enter -2233 to end the stack.");
            num = scnr.nextInt();

            if (num == -9923) {
                // Print the stack when the special code is entered
                printStack(stack);
            } else {
                // Push the entered number onto the stack
                stack.push(num);
            }

        } while (num != -2233);

        // Close the scanner
        scnr.close();
    }
}
