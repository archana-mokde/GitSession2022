package Test_package;

class A{
	void addition()
	{
		int a=10;
		int b =20;
		int result=a+b;
		System.out.println("addition of two number:- " + result);
	}
	

    void sub()
	{
		int a=10;
		int b =20;
		int result=a-b;
		System.out.println("substraction of two number:- " + result);
	}

}

public class Inheritance_Example extends A{
	void division()
	{
		int a=40;
		int b =20;
		int result=a/b;
		System.out.println("division of two number:- " + result);
	}

	public static void main(String[] args) {
		Inheritance_Example obj=new Inheritance_Example();
		obj.addition();
		obj.sub();
		obj.division();
	}

}
