package Test_package;

public class Multiple_CatchExceptionHandling_Example5 {

	public static void main(String[] args) {
		try
		{
			int array[]= {1,2,3,4,5,6};
			System.out.println(array[9]);
			
	  } 
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
			
		}
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println(e2);
			
		}
		catch(Exception e3)
		{
			System.out.println(e3);
		}
		


	}

}
