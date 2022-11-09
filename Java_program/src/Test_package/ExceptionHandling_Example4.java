package Test_package;

public class ExceptionHandling_Example4 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
		try {
		String str="testing shastra";
		System.out.println(Integer.parseInt(str));
		}
		catch(NumberFormatException e1)
		
		{
			System.out.println(e1);
		}
		try
		{
			int array[]= {1,2,3,4,5,6};
			System.out.println(array[9]);
			
	  } 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
