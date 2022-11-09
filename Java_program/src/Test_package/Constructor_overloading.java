package Test_package;

public class Constructor_overloading{
	String username;
	String password;
	double salary=134.34;
	double amount;

	Constructor_overloading(){
		
	}
	Constructor_overloading(String user,String pass_id){
		this.username=user;
		this.password=pass_id;
	}

	Constructor_overloading(double PayAmount){
		this.amount=PayAmount;
		
		}
	public static void main(String[] args) {
		
    Constructor_overloading con= new Constructor_overloading();
    Constructor_overloading con1=new Constructor_overloading("admin","Admin");
   
    Constructor_overloading con2=new Constructor_overloading(134256.78);
    System.out.println(con1.username);
    System.out.println(con2.amount);
    System.out.println(con1.password);
	}

}
