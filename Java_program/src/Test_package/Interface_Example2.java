package Test_package;
 interface interface1
 {
	 void interfacemethod();
	 void interfacemethod1();
 }
 interface interface2
 {
	 void interfacemethod2();
	 void interfacemethod3();
	 
 }
 class Example implements interface1,interface2
 {
	 public void interfacemethod()
	 {
		 System.out.println("this is interface method");
	 }
	 public void interfacemethod1()
	 {
		 System.out.println("this is interface method1");
	 }
	 public void interfacemethod2()
	 {
		 System.out.println("this is interface method2");
	 }
	 public void interfacemethod3()
	 {
		 System.out.println("this is interface method3");
	 }
 }
public class Interface_Example2 {

	public static void main(String[] args) {
		Example obj=new Example();
		obj.interfacemethod();
		obj.interfacemethod1();
		obj.interfacemethod2();
		obj.interfacemethod3();
	}

}
