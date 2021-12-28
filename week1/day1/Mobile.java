package week1.day1;

public class Mobile {
	String mobileModel="Vivo V20";
	int mobileWeight= 250;
	boolean isFullCharge=true;
	double mobileCost=20000.00;
	public void makeCall() {
		System.out.println("I can make a call");
	}
	public void sendMsg() {
		System.out.println("I can send messages");
	}
	public static void main(String[] args) {
		Mobile vivo = new Mobile();
		vivo.makeCall();
		vivo.sendMsg();
		System.out.println(vivo.mobileModel);
		System.out.println(vivo.mobileWeight);
		System.out.println(vivo.isFullCharge);
		System.out.println(vivo.mobileCost);
		
	}
}
