//(6).Demonstrate vector methods.

import java.util.*;
public class VectorExample
{
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(4);
		vec.add("One");
		vec.add("Two");
		vec.add("Three");
		vec.add("Four");
		System.out.println("Size is : "+vec.size());
		System.out.println("Default capacity : "+vec.capacity());
		System.out.println("Vector elements is"+vec);
		vec.add("Five");
		vec.add("Six");
		System.out.println("Size after adding elements : "+vec.size());
		System.out.println("Capacity after adding elements : "+vec.capacity());
		System.out.println("Elements are : "+vec);

		System.out.println("Vector elements contains Two...?"+vec.contains("Two"));
		System.out.println("Two is present at index : "+vec.indexOf("Two"));


		System.out.println("First element of vector is : "+vec.firstElement());
        System.out.println("Second element of vector is : "+vec.lastElement());
	}
}