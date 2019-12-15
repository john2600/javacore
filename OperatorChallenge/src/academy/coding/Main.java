package academy.coding;

public class Main {
	public static void main(String[] args) {
		double myDoubleVariable = 20.00d;
		
		double mySecondDoubleVariable = 80.00d;
		
		double result =	myDoubleVariable + mySecondDoubleVariable * 100.00d;
		
		double remainder = result % 40.00d;
		
		boolean isTrue = (remainder==0) ? true:false;
		
		System.out.println(isTrue);
		
		if(!isTrue) {
			System.out.println("goot some reminder");
		}
		
	}
}
