package week1.day1;

public class LearnIfCondition {
	public static void main(String[] args) {
		int age=5;
		if(age>60) {
			System.out.println("Senior citizen");
		}
		else if(age>18 && age<60) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Minor");
		}
		
	}

}
