package practice.Seleniumday2;

public class Calculator {
	
	int a= 5; //global variable
	final int c =3;
	static int d =8; //static variable
	public void addition() {
		int b= 5; //local variable
		System.out.println(a+b);
	}
	public void subtraction() {
	    // c = 4; value cannot be reassigned to final variable
		System.out.println(d-c);
		//System.out.println(++d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		obj.addition();
		obj.subtraction();	
	}
}
