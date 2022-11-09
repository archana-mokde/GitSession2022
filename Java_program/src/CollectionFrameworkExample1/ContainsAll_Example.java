package CollectionFrameworkExample1;

import java.util.ArrayList;

public class ContainsAll_Example {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("first arraylist" +al);
		ArrayList al1= new ArrayList();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		//al1.add(4);
		System.out.println("second arraylist" +al1);
		
		boolean subSet= al.containsAll(al1);
		System.out.println(subSet);
	}

}
