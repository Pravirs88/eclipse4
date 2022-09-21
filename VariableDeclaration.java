package dataType;

public class VariableDeclaration {
static int a =12; // static variables
static int b=4;  // static variables
int c =8;        // global/instance variables
int d= 9;       // global/instance variables

public void operations() { // non static method
int sum;
sum = a+ b ;
	System.out.println("addition of values :  "+ sum  );
	System.out.println("multiplication of values " + c*d);
	int e =12;   // local variables
	int f = 6;    // local variables
	System.out.println("division of values "+ e / f);
	System.out.println(a + e);// access global variable 
	}
public static void lesson() {
	System.out.println(a*b);
}
       
 public static void main(String [] args) //main method
{
	VariableDeclaration j = new  VariableDeclaration();
			j.operations();
			lesson();
			
			
			
			
			
	System.out.println(a - b); //use static variable inside main method
	//System.out.println(a + c;)// can't access global variable inside static method 
 //sysyem.out.println(e+f);  // access only local variable particular method
}
}
	

