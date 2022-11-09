package Test_package;
class PrivateModifier
{
	private int salary=12345;
	private  String emp_name="Archana";

	private void addition()    //private method
	{
		int a=23;
		int b=45;
		int result=a+b;
		System.out.println("addition of a and b:- "+result);
	}
	private PrivateModifier()  //private constructor
	{
		System.out.println("this is private constructor");
	}



	class Private_Modifier_example {

	public static void main(String[] args) {
		PrivateModifier obj=new PrivateModifier();
		

		System.out.println("testing shatra");
		System.out.println(obj.emp_name);
		System.out.println(obj.salary);
		obj.addition();
	}

}
