package CollectionFrameworkExample1;

import java.util.ArrayList;

public class ArrayList_Example1 {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("first arraylist" +al);
		ArrayList al1= new ArrayList();
		al1.add(1);
		al1.add(2);
		al1.add(6);
		al1.add(4);
		al1.add(7);
		al1.add(9);
		System.out.println("second arraylist" +al1);
		
		al.addAll(al1);
		System.out.println("union or combine all arraylist " +al);
		
		al.removeAll(al1);
		System.out.println("common elements are removed from arraylist "+al);
		
		al.retainAll(al1);
		System.out.println("uncommon elements are removed from arraylist "+al);
		
		
		//containAll method------
		
		boolean subSet= al.containsAll(al1);
		System.out.println(subSet);
		
		
	}

}
