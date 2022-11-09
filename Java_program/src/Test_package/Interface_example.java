package Test_package;
  interface shape1
  {
	 public void interfacemethod();
	 public void interfacemethod1();
	 public void interfacemethod2();

	  
  }
  class trangle implements shape1
  {
	  public void interfacemethod() 
	  {
		  System.out.println("this is interface method1");
	  }
	  public void interfacemethod1() 
	  {
		  System.out.println("this is interface method2");
	  }
	  public void interfacemethod2() 
	  {
		  System.out.println("this is interface method3");
	  }
  }
public class Interface_example {

	public static void main(String[] args) {
		trangle obj=new trangle();
		obj.interfacemethod();
		obj.interfacemethod1();
		obj.interfacemethod2();
	}

}
