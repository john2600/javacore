package academy.coding;

public class Main {
	public static void main(String[] args) {
		char myChar = 'A';
		short myNumber = (short)myChar;
		short number = 94;
		
		System.out.println("myChar "+myChar);
		System.out.println("myChar "+myNumber);
		
		myChar = (char) number;
		
		System.out.println("myChar "+myChar);
		
		char symbol = '\u00A9';
		System.out.println("myChar "+symbol);
		
		String myString = "this is a string values";
		
		System.out.println("myString= "+myString);
		
		myString = myString + "adding new values or content";
		
		System.out.println("myString= "+myString);
		
		myString = myString + " \u00A9 2019";
		System.out.println("myString= "+myString);
		
		//String is immutable 
		//StringBuilder/StringBuffer is better to append values
		
		
		
	}
}
