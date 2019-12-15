package academy.learnprogramming;

public class FloatAndDouble {
	public static void main(String[] args) {
		float myMinFloatValue = Float.MIN_VALUE;  //32
		float myMaxFloatValue = Float.MAX_VALUE;  // 32 presicion
		
		System.out.println("my Min Float Value "+myMinFloatValue);
		System.out.println("my Max Float Value "+myMaxFloatValue);
		
		double myMinDoubletValue = Double.MIN_VALUE;  //64
		double myMaxDoubletValue = Double.MAX_VALUE;  // 64 presicion
		
		System.out.println("my Min Double Value "+myMinDoubletValue);
		System.out.println("my Max Double Value "+myMaxDoubletValue);
		
		int myIntNumber = 5;
		float myNewFloatValue = (float)5.25;
		double myNewDouble = 5.25d;
		
		System.out.println("my Min FLoat Value "+myNewFloatValue);
		System.out.println("my Min Double Value "+myNewDouble);
		// it is preferible to use BigDecimal when we want to make a precise calculations instead of float-point
		
		
		
	}
}
