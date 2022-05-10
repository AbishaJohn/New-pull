package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add(5); 
		al.add(10); 
		al.add(true); 
		al.add("jenifer");
		al.add('c'); 
		al.add(43.4f);
		al.add(456);
		System.out.println(al);
		int[] ar = {10,20,2}; 
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}
	}


