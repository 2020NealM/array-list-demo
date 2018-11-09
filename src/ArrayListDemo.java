import java.util.*;
/**
 * This program demonstrates basic operations on an array list
 * @author Michael Ida
 *
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		// declare an array list
		// notice the use of the Integer "wrapper class"
		ArrayList<Integer> values = new ArrayList<Integer>();
		int valuesLength = 0;
		
		
		// add values to the end of the array list
		values.add(5);
		values.add(10);
		values.add(15);
		values.add(20);
		
		
		// output the length and values
		// notice the size() and get() methods
		valuesLength = values.size();
		System.out.println("Initial array list...");
		System.out.println("current length: " + valuesLength);
		System.out.print("values:");
		for (int i = 0; i < valuesLength; i++) {
			System.out.printf("%3d", values.get(i));
		}
		System.out.println("\n");
		
		
		// change a value
		values.set(3, 25); // set element at index 3 equal to 25
		
		System.out.println("After changing a value...");
		valuesLength = values.size();
		System.out.println("current length: " + valuesLength);
		System.out.print("values:");
		for (int i = 0; i < valuesLength; i++) {
			System.out.printf("%3d", values.get(i));
		}
		System.out.println("\n");
		
		
		// insert a value
		values.add(1, 30); // insert 30 at index 1 and shift up
		
		System.out.println("After inserting a value...");
		valuesLength = values.size();
		// notice the enhanced for loop
		System.out.println("current length: " + valuesLength);
		System.out.print("values:");
		for (Integer value : values) {
			System.out.printf("%3d", value);
		}
		System.out.println("\n");
		
		
		// remove a value
		values.remove(2); // remove the value at index 2
		
		System.out.println("After removing a value...");
		valuesLength = values.size();
		// notice the enhanced for loop
		System.out.println("current length: " + valuesLength);
		System.out.print("values:");
		for (Integer value : values) {
			System.out.printf("%3d", value);
		}
		System.out.println("\n");
	}
}
