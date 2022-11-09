package Test_package;
   abstract class shape
   {
	   abstract void draw();
   }
   class Rectangle extends shape
   {
	   void draw()
	   {
		  System.out.println("rectangle draw"); 
	   }
   }
   class circle extends Rectangle
   {
	   void draw() 
	   {
		  System.out.println("circle draw"); 
	   }
   }
public class Abstract_example2 {

	public static void main(String[] args) {
		circle obj=new circle();
		obj.draw();
		Rectangle obj1=new Rectangle();
		obj1.draw();
		//shape s =new circle();
		//s.draw();
	}

}
