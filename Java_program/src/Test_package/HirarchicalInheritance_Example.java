package Test_package;
class A
{
	void addition()
	{
		int a=10;
		int b =20;
		int result=a+b;
		System.out.println("addition of two number:- " + result);
	}
}
class B extends A
{
	void sub()
	{
		int a=10;
		int b =20;
		int result=a-b;
		System.out.println("substraction of two number:- " + result);
	} 
	}
class C extends A
{
	 void division()
		{
			int a=40;
			int b =20;
			int result=a/b;
			System.out.println("division of two number:- " + result);
		}
}

public class HirarchicalInheritance_Example {

	public static void main(String[] args) {
		B obj1=new B();
		obj1.addition();
		obj1.sub();//B object create
		
		C obj2 =new C();
		obj2.addition();
		obj2.division();
	}

}
