package Test_package;

public class Constructor_overloadindEx2 {
     String username;
     int password;
     boolean active;
     float salary;
     Constructor_overloadindEx2(){
    	 
     }
     Constructor_overloadindEx2(String user,int pass_id){
    	 this.username=user;
    	 this.password=pass_id;
     }
     Constructor_overloadindEx2(boolean active,float sal){
    	 this.active=active;
    	 this.salary= sal;
    	 
     }
     
	public static void main(String[] args) {
		Constructor_overloadindEx2 con=new Constructor_overloadindEx2("archana",1234);
		Constructor_overloadindEx2 con1=new Constructor_overloadindEx2(true,234.12f);
		System.out.println(con.username);
		System.out.println(con.password);
		System.out.println(con1.active);
		System.out.println(con1.salary);
	}

}
