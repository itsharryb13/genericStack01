package genstack;
import java.util.*;

/**
 * A generic stack implementation that supports basic stack operations such as push, pop, peek,
 * checking if the stack is empty, and getting the size of the stack.
 * 
 * @param <T> The type of elements that the stack will hold.
 * 
 * Authors:
 * - Harpreet Singh
 * - Ryan Serrano
 * - Luisa Valencia
 */
class GenStack<T> {
    // Instance variables
    private int top = -1; // Variable to keep track of the top of the stack
    private int size;     // Variable to keep track of the size of the stack
    private ArrayList<T> List = new ArrayList<T>(size); // ArrayList to store elements of the stack

    /**
     * Pushes the given value onto the stack.
     * 
     * @param value The value to be pushed onto the stack.
     */
    void push(T value){
        size++;
        List.add(value);  
        top++;
    }
    
    /**
     * Pops and returns the element at the top of the stack.
     * 
     * @return The element at the top of the stack.
     */
    T pop(){
        if(top == -1){
            return null; // Stack is empty
        }
        T remove = List.remove(top);
        top--;
        size--;
        return remove;
    }
    
    /**
     * Returns the element at the top of the stack without removing it.
     * 
     * @return The element at the top of the stack.
     */
    T peek(){
        if(top == -1){
            return null; // Stack is empty
        } else {
            return List.get(top);
        }
    }
    
    /**
     * Checks if the stack is empty.
     * 
     * @return True if the stack is empty, false otherwise.
     */
    boolean isStackEmpty(){
        return top == -1;
    }
    
    /**
     * Returns the current size of the stack.
     * 
     * @return The size of the stack.
     */
    int size(){
        return size;
    }
}
