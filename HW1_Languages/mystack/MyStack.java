/**
 * 
 */
package mystack;
import java.util.EmptyStackException;

/**
 * @author Saatvik Chaudhari
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack == null) {
            throw new EmptyStackException();
        }
        MyNode<T> temp = theStack;
        theStack = theStack.next;
        return temp.val;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> newNode = new MyNode<>(v, theStack); 
		theStack = newNode;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> integerStack = new MyStack();
		// Push 1 and 2
		integerStack.push(1);
		integerStack.push(2);
		// Pop
		System.out.println("Popped: " + integerStack.pop());
		// Push 5
		integerStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<>();
		// Push a person p1 with your name
		personStack.push(new Person("Saatvik", "Chaudhari"));
		// Push a person p2 with my name
		personStack.push(new Person("Christelle", "Scharff"));
	}

}
