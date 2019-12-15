
public class PrimitiveCasting {
	public static void main(String[] args) {
		byte myFirstByte = 10;
		
		short myShortVariable = 20;
		int myIntegerVariable = 50;
		
		long myLongVariable = 50000L + ((myFirstByte + myShortVariable + myIntegerVariable) * 10L);
		
		System.out.println(myLongVariable);
	}
}
