This program provides a generic implementation of a stack data structure named `GenStack`. A stack is a last-in, first-out (LIFO) data structure, and this generic implementation allows for the storage of elements of any data type. Here's an explanation of the functions and their purposes:

1. **Constructor:**
   - The class has a default constructor, but it's not explicitly defined in the code. It initializes the instance variables:
     - `top`: Keeps track of the top of the stack.
     - `size`: Keeps track of the size of the stack.
     - `List`: An ArrayList to store elements of the stack.

2. **`push` Method:**
   - **Purpose:** Pushes a new element onto the top of the stack.
   - **Parameters:**
     - `value`: The value to be pushed onto the stack.
   - **Implementation:**
     - Increments the `size` variable.
     - Adds the specified value to the `List` (ArrayList) representing the stack.
     - Increments the `top` variable.

3. **`pop` Method:**
   - **Purpose:** Pops and returns the element at the top of the stack.
   - **Return Type:** The element at the top of the stack.
   - **Implementation:**
     - Checks if the stack is empty (`top == -1`), and if so, returns `null`.
     - Removes the element at the top of the stack from the `List`.
     - Decrements the `top` and `size` variables.
     - Returns the removed element.

4. **`peek` Method:**
   - **Purpose:** Returns the element at the top of the stack without removing it.
   - **Return Type:** The element at the top of the stack.
   - **Implementation:**
     - Checks if the stack is empty (`top == -1`), and if so, returns `null`.
     - Returns the element at the top of the stack without removing it.

5. **`isStackEmpty` Method:**
   - **Purpose:** Checks if the stack is empty.
   - **Return Type:** `boolean` - `true` if the stack is empty, `false` otherwise.
   - **Implementation:**
     - Returns `true` if the `top` variable is equal to -1 (indicating an empty stack), and `false` otherwise.

6. **`size` Method:**
   - **Purpose:** Returns the current size of the stack.
   - **Return Type:** `int` - The size of the stack.
   - **Implementation:**
     - Returns the value of the `size` variable.

**Authors Section:**
   - The code includes a section indicating the authors of the implementation.

**Note:**
   - The implementation uses an `ArrayList` to represent the stack, which dynamically resizes as elements are added or removed.
   - The code does not handle synchronization for multi-threaded scenarios. If used in a multi-threaded environment, additional synchronization mechanisms may be required.
