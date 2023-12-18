package practice.Seleniumday2;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My new mobile");
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMessage();	
	}
	public void makeCall() {
		System.out.println("Method to make a call");
	}
	public void sendMessage() {
		System.out.println("Method to send a message");
	}
}
