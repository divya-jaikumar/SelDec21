package week1.day1;

public class LearnVariables {
	byte capacity= 5;
	int carprice=200000;
	long ownermobile=9940108099L;
	float mileage=200.40f;
	double distancerange=42312.46564;
	char fueltype='p';
	boolean preowned=false;
	public void variablesLearn() {
		System.out.println(capacity);
		System.out.println(carprice);
		System.out.println(mileage);
	}
	public static void main(String[] args) {
		LearnVariables obj= new LearnVariables();
		obj.variablesLearn();
		System.out.println(obj.mileage);
		System.out.println(obj.distancerange);
		System.out.println(obj.fueltype);
		System.out.println(obj.preowned);
	
	}
}

