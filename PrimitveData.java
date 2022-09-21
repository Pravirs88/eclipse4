package dataType;


public class PrimitveData {

	public void datatypeas()  //non static method
	{
		boolean a = 1 < 5;          // boolean data type  true or false
		System.out.println(a);
		byte b =122;               //byte data type range -128 to 127
		System.out.println(b);
		short c = -1000;          // short data type range -32768(2^15) to 32767{(2^15)-1}
		System.out.println(c);
		char d = 'D';             //  char data type range '\u0000' to '\uffff'
		System.out.println(d);
		int e = 170119991;        //int data type range  - 2,147,483,648 (-2^31) to  2,147,483,647 {(2^31)-1}
		System.out.println(e);
		long f = 1222333345;      // long data type range -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,77,807{(-2^63)-1}
		System.out.println(f);
		float g = 123.6666666666678f; // float data type range 32-bit IEEE 754 
		System.out.println(g);
		double h =123456.9999999999; // double data type range 64-bit IEEE 754 
		System.out.println(h);
		}
	public static void main(String [] args) {
		PrimitveData i = new PrimitveData();
		i.datatypeas();
		
		
		
	
		
		
	}
}
