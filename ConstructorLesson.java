package dataType;


public class ConstructorLesson {
	int sum,multiply;
	
	ConstructorLesson(){
		int a = 79;
		int b=75;
		sum = a + b;
		System.out.println("the sum of value is : " +sum);
	}
	ConstructorLesson(int a,int b){ 
		multiply = a*b;
		System.out.println("the multiplication is : " +multiply);
	}
	ConstructorLesson(String S){
	
	System.out.print("My name is : "+S);
	}
	public static void main(String [] args) {
	new	ConstructorLesson();
	new	ConstructorLesson(44,80);
	new	ConstructorLesson("sachin");
	
	
	}
}
