package Test_package;

public class ExceptionHandling_Example2 {

	public static void main(String[] args) {
		try
		{
		int a= 34;
		int b=0;
		int result=a/b;
		System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		//if we can not handle the exception then program is terminated and remainig part can not be executed
		int a1= 34;
		int b1=45;
		int result1=a1+b1;
		System.out.println(result1);
	}

}
