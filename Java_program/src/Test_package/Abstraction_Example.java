package Test_package;

abstract class baseclass{
    abstract void JavaAbstract();
    abstract void JavaAbstract1();
    abstract void JavaAbstract2();
    
}
   class SubClass extends baseclass{
    	 void JavaAbstract() 
    	 {
    		System.out.println("this is override method of abstract class"); 
    	 }
    	 void JavaAbstract1()
    	 {
    		System.out.println("welcome in"); 
    	 }
    	 void JavaAbstract2()
    	 {
    		 System.out.println("testing");
    	 }
    	 
     }
public class Abstraction_Example {

	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.JavaAbstract();
		obj.JavaAbstract1();
		obj.JavaAbstract2();
		
		//baseclass obj1=new baseclass();//we can not create obejct of base class if we declared abstract with
		
	}

}
