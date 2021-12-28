package week1.day1;

public class Car {
	String model="Xcent";
	public void driveCar() {
		String model="Xcent-XR";
		System.out.println("first method- drive car");
		System.out.println(model);

	}
	public void applyBrake() {
		System.out.println("second method- applied brake");
		System.out.println(model);
	}
	public static void main(String[] args) {
		Car mycar= new Car();
		mycar.driveCar();
		mycar.applyBrake();
		System.out.println(mycar.model);
		
	}

}
