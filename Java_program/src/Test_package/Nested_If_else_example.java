package Test_package;

public class Nested_If_else_example {

	public static void main(String[] args) {
		int marks=78;
		if(marks<50) {
			System.out.println("student are fail");
		}
		else if(marks>=50 && marks<60) 
		{
			System.out.println("student are come in D grade");
		}
		else if(marks>=60 && marks<70) 
		{
			System.out.println("student are come in C grade");
		}
		else if(marks >=70 && marks<80)
		{
			System.out.println("student are come in B grade");
			
		}
		else if(marks >=80 && marks <90)
		{
			System.out.println("student are come in A grade");
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}

}
