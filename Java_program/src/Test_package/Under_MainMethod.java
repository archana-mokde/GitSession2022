package Test_package;

public class Under_MainMethod {

	public static void main(String[] args)
	{
	int a =40;
	int b=20;
	int result = a-b;
	System.out.println("result of a and b"   +  result);

	Under_MainMethod.aMethod();
	Under_MainMethod.bMethod();
	
	}
	
	public static void aMethod()
	{
		System.out.println("This is user defiend");
	}
	public static void bMethod()
	{
      System.out.println("this is second defined method");
  
   
}
}
