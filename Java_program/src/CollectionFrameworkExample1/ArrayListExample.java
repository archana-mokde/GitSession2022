package CollectionFrameworkExample1;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		//array list add duplicate value
		ar.add(1);
		ar.add(1);
		ar.add(1);
		ar.add(1);
		//arraylist add null value
		ar.add(null);
		
		System.out.println(ar);
	}

}
