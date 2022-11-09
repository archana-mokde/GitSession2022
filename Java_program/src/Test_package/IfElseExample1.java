package Test_package;

public class IfElseExample1 {

	public static void main(String[] args) {

		String str ="TEASTING SHASTRA";
		String str1="teasting shastra";
		//method 1
		if(str==str1) {
			System.out.println("both are same name");
		}else 
		{
			System.out.println("both are not same name");  
		}

		//method 2
		if(str.equals(str1)) 
		{
			System.out.println("both are same name");  
		}else 
		{
			System.out.println("both are not same name");  

		}

		//method 3
		if(str.equalsIgnoreCase(str1)) 
		{
			System.out.println("both are same name");    
		}
		else 
		{
			System.out.println("both are not same name");  

		}
	}

}
