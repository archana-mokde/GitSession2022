package Test_package;

public class ExceptionHandling_example1 {

	public static void main(String[] args) {
		String s="testing shastra";
		System.out.println(s.length());
		System.out.println("testing");
		try 
		{
			System.out.println(s.charAt(18));
		}
		catch(Exception e) 
		{
			System.out.println(e);
			System.out.println("Testing");
		}
	}

}
