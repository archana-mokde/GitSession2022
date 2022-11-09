package Test_package;

public class ExceptionHandling_Example3 {

	public static void main(String[] args) {
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}

}
