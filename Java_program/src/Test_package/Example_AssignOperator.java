package Test_package;

public class Example_AssignOperator {

	public static void main(String[] args) {
	String name="archana";
	System.out.println(name);
	int a=7;
	int b=6;
	 a += b;
	 System.out.println(a);
	 b += a;
	 System.out.println(b);//+= assignment operator
	 int num=20;
	 int num1=40;
	 num -= num1; //20-40=-20
	 System.out.println(num);
	 num1 -= num;  //40-(-20)=60
	 System.out.println(num1);// -= operator
	 
	 int c=2;
	 int d=3;
	 c *=d; //3*2=6
	 System.out.println(c); //*= operator
	 d *= c; //3*6=18
	 System.out.println(d);
	 
	 int xyz=50;
	 int abc=10;
	 xyz /= abc;//50/10=5
	 System.out.println(xyz); ///= operator
	 abc /= xyz;  //10/5=2
	 System.out.println(abc);
	 
	 int a1=5;
	 int b1=4;
	 a1 |= b1;
	 System.out.println(a1);  //|= operator
	  
	 int c1=20;
	 int d1=10;
	 c1 &= d1;
	 System.out.println(c1);
	 
	 
	}

}
