package Test_package;

public class Array_Example {
  
  
	public static void main(String[] args) {
		
		
		//int[] salary= (20000,30000,40000,50000);
		int[] salary= {2000,3000,4000,5000};
		String [] name = {"archana","dipali","aadhya","nilesh"};
		System.out.println(salary.length);
		System.out.println(name.length);
		System.out.println("these are the original array");
		System.out.println(salary[0]);
		System.out.println(salary[1]);
		System.out.println(salary[2]);
		System.out.println(salary[3]);
		System.out.println("these are original array name");
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		salary[3]=33333;
		System.out.println("these are original array name");
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		name[1]="sanavi";
		System.out.println("these are the updated array");
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		for(int i=0;i<salary.length;i++) 
		{
			System.out.println(salary[i]);
		}
				
		for(int x=0;x<name.length;x++)
		{
			System.out.println(name[x]);
			
		}	
		
		
	}

}
