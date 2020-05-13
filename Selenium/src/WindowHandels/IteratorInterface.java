package WindowHandels;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create ArrayList 
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("ArrayList : " + numbers);
		
		//Creating an Instance od Iterator
		Iterator<Integer> iterate= numbers.iterator();
		
		// Using next() Method
		int number = iterate.next();
		System.out.println("Accessed Element: " + number);
		
		// Using the remove() method
        iterate.remove();
        System.out.println("Removed Element: " + number);
        
        System.out.print("Updated ArrayList: ");
        
        while(iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }
	}

}
