package Test_package;

public class Unary_operator {

	public static void main(String[] args) {

		int x=4;
		int y= x++;
		System.out.println(y);  //4....5
		System.out.println(x); //5 ...
		System.out.println(y); //4
		
		//example1
		int a =3;
		System.out.println(a ++); //3..4
		System.out.println(a);//a=4
		System.out.println(a ++); //4...5
		System.out.println(a);//a=5
		System.out.println(a ++);//5..6
		System.out.println(a);//a=6
		
		//example2
		int b=10;
		System.out.println( b --);//10...9
		System.out.println(b);//b=9
		System.out.println( b --);//9..8
		System.out.println(b);//b=8
		System.out.println( b --);//8...7
		System.out.println(b);//b=7
		
		
		
	}

}
