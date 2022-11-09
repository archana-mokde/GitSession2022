package Test_package;
    abstract class bike
    {
    	abstract void run();
    	
    }
    class Honda extends bike
    {
    	void run() 
    	{
    		System.out.println("running safely");
    	}
    	
    }
public class Abstract_example1 {

	public static void main(String[] args) {
		Honda obj=new Honda();
		obj.run();
	}

}
