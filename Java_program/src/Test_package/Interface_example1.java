package Test_package;

  interface basicoperation{
	  void add();
	  void sub();
  }
    interface advanceoperation
    {
    	void mul();
    	void divi();
    	
    }
    class test implements basicoperation,advanceoperation
    {
    	public void add()
    	{
    		int a=4;
    		int b=5;
    		int result= a+b;
    		System.out.println("addition of a and b is:- "+result);
    	}
    	public void sub()
    	{
    		int a=10;
    		int b=5;
    		int result= a-b;
    		System.out.println("substraction of a and b is:- "+result);
    	}
    	public void mul()
    	{
    		int a=4;
    		int b=5;
    		int result= a*b;
    		System.out.println("multiplication of a and b is:- "+result);
    	}
    	public void divi()
    	{
    		int a=10;
    		int b=5;
    		int result= a/b;
    		System.out.println("division of a and b is:- "+result);
    	}
    }
public class Interface_example1 {

	public static void main(String[] args) {
		test obj=new test();
		obj.add();
		obj.sub();
		obj.mul();
		obj.divi();
	}

}
