/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* SOURCE CODE: ArrayStack.java
* AUTHOR NAME: Christian Diverson
* GITHUB URL: [github.com/christiandiverson]
* LAST UPDATE: [8/24/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


package arraystack;

public class ArrayStack {

  private int capacity;
  private int top = 0;
  private String[] storage;
  
  // constructor = initialize an object instance of the class
  public ArrayStack(int size) {
    // assign the value of size to capacity
    capacity = size;
    storage = new String[capacity];
  }

  public void show() {
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = capacity-1; i >= 0; i--) {
        System.out.println ("Stack["+i+"] = "+storage[i]+"th value");
      /* print like this: 
      stack[9]   = 10th value
      stack[8]   = 9th value
      stack[7]   = 8rd value
      ....  
      stack[1]   = 2nd value
      stack[0]   = 1st value
      */
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[top] == null) {
      // print error message
      System.out.print ("ERROR!");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      // print error message
      System.out.print ("ERROR!");
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      // print error message
      System.out.print ("ERROR!");
      System.out.println();
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      /* increment or decrement top*/;
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }
  public void pop() {
    if (isEmpty()) {
      // print error message
      System.out.print ("ERROR!");
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = storage[top-1] ;
      /* increment or decrement top*/;
      top--;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
    System.out.println("STORAGE CAPACITY = " + /* return the size limit */);
    System.out.println();
    // show empty stack
    // try removing on an empty stack
    // peek top element of an empty stack
    storage.push("one");
    // show the updated stack
    // peek if top element is "one"
    storage.push("two");
    // show the updated stack
    // peek if top element is "two"
    storage.push("three");
    // show the updated stack
    // peek if top element is "three"
    storage.push("four");
    // show the updated stack
    storage.push("five"); 
    // show the updated stack
    // try removing "five"
    storage.push("six"); 
    storage.push("seven"); 
    storage.push("eight"); 
    storage.push("nine");    
    storage.push("ten"); 
    // show the updated stack
    // peek if top element is "ten"
    // try adding "eleven"
    // try adding "twelve"
    // show the updated stack
  }  

}
