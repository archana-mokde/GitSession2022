package Test_package;

public class Userdefind_constructor {
	String username;
	String password;
	boolean x;
	double salary;
	//user defind constructor
	Userdefind_constructor(){
		username="archana";
		password="admin";
		x= true;
		salary= 12345.23;
		
	}
	
	public static void main(String[] args) {

		Userdefind_constructor con=new Userdefind_constructor();
		System.out.println(con.username);
		System.out.println(con.password);
		System.out.println(con.x);
		System.out.println(con.salary);
	}

}
