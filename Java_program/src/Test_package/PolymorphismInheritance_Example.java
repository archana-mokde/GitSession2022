package Test_package;
class shape
{
	void aeraofcircle()
	{
		int radius=10;
		double result;
		result=Math.PI*radius*radius;
		System.out.println("area of circle for class shape:- " + result);
	}
	}
class Diamond extends shape
{
	void aeraofcircle()
	{
		int radius=12;
		double result;
		result=Math.PI*radius*radius;
		System.out.println("area of circle for class diamond:- " + result);
	}
	}

class triangle extends shape
{
	void aeraofcircle()
	{
		int radius=14;
		double result;
		result=Math.PI*radius*radius;
		System.out.println("area of circle for class triangle:- " + result);
	}
}

public class PolymorphismInheritance_Example {

	public static void main(String[] args) {
		shape objsh=new shape();
		objsh.aeraofcircle();
		
		Diamond objd=new Diamond();
		objd.aeraofcircle();
		
		
		triangle objt=new triangle();
		objt.aeraofcircle();
		
	}

}
