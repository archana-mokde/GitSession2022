package Test_package;

public class Parameterize_constructor {
     
	String username;
	String password;
	boolean x;
	float customer_sal;
	
	//parameterize constructor
	Parameterize_constructor(String user,String pass_id,boolean active,float cust_sal){
		this.username=user;
		this.password=pass_id;
		this.x=active;
		this.customer_sal=cust_sal;
		
		
	}
	public static void main(String[] args) {
		Parameterize_constructor con=new Parameterize_constructor("archana","admin",true,1234.23f);
		System.out.println(con.username);
		System.out.println(con.password);
		System.out.println(con.x);
		System.out.println(con.customer_sal);
		
	}

}
