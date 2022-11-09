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
      class C extends B
      {
    	  void division()
    		{
    			int a=40;
    			int b =20;
    			int result=a/b;
    			System.out.println("division of two number:- " + result);
    		}
      }

public class MultilevalInheritance_Example {

	public static void main(String[] args) {
		//create object for A
		A objA=new A();
		objA.addition();
		//create object for B
		B objB=new B();
		objB.addition();
		objB.sub();
		//by create object for C
		C objc=new C();
		objc.addition();
		objc.sub();
		objc.division();
	}

}
