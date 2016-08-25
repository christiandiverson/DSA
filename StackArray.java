/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* SOURCE CODE: ArrayStack.java
* AUTHOR NAME: Christian Diverson
* GITHUB URL: [github.com/christiandiverson]
* LAST UPDATE: [8/25/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


package arraystack;

public class ArrayStack {

    private int capacity;
  private int top = 0;
  private final String[] storage;
  
  // constructor = initialize an object instance of the class
  public ArrayStack(int size) {
    capacity = size;
    storage = new String[capacity];
  }

  public void show() {
    for (int i = capacity-1; i >= 0; i--) {
        System.out.println ("Stack["+i+"] = "+storage[i]);
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[top] == null) {
      System.out.print ("EMPTY!");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      System.out.print ("FULL!");
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      System.out.print ("Push Failed!");
      System.out.println();
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }
  public void pop() {
    if (isEmpty()) {
      System.out.print ("Pop Failed!");
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] =  ;
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
    ArrayStack storage = new ArrayStack(10);
    System.out.println("STORAGE CAPACITY = " + storage.capacity);
    System.out.println();
    // show empty stack
    storage.show();
    // try removing on an empty stack
    storage.pop();
    // peek top element of an empty stack
    storage.peek();
    storage.push("1");
    // show the updated stack
    storage.show();
    // peek if top element is "one"
    storage.peek();
    storage.push("2");
    // show the updated stack
    storage.show();
    // peek if top element is "two"
    storage.peek();
    storage.push("3");
    // show the updated stack
    storage.show();
    // peek if top element is "three"
    storage.peek();
    storage.push("4");
    // show the updated stack
    storage.show();
    storage.push("5"); 
    // show the updated stack
    storage.show();
    // try removing "five"
    storage.pop();
    storage.push("6"); 
    storage.push("7"); 
    storage.push("8"); 
    storage.push("9");    
    storage.push("10"); 
    // show the updated stack
    storage.show();
    // peek if top element is "ten"
    storage.peek();
    // try adding "eleven"
    storage.push("11");
    // try adding "twelve"
    storage.push("12");
    // show the updated stack
    storage.show();
  }  

}
