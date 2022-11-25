package TypesVariablesBranching;

public class FieldPractice {

	// a camel-case convention
	static int illegalFieldName = 0;
	
	public static void main(String[] args) {
		practiceOne();
		practiceTwo();
	}
	public static void practiceOne() {
		// This practiceOne method() variable can be accessible anywhere in practiceOne()
		int outer = 0;
		
		if (outer == 0) {
			// only accessible inside this "if" statement "block" - i.e. scope rules
			int scopeIf = 50;
			//for loop here 
			for(int i=0; i<44; i++) {
				// print scopeIf and for-loop here
				System.out.println("scopeIf practice value: " + scopeIf);
				System.out.println("practice Index:" + i);
			}
			
			outer = scopeIf % 10; //output in console
			
			// Compile error would be "printed" here - i is not following scope rules - (i.e. not apart of practiceOne.
//			if (i==5) {
//				System.out.println("practiceOne Value of compileError i:" + i);
//			}
			
			// The camelCaseConvention, method() variable, and scopeIf are visible to the console here.
			illegalFieldName = outer * scopeIf;
		}
	
	}

	
	public static void practiceTwo() {
		// This practiceTwo method() variable can be accessible anywhere in practiceTwo()
		if (illegalFieldName != 0) {
			// print out
			System.out.println("Practice Method was called ");
		} 
		// try,catch
		try {
			// create variables inside this 'try' block
			int inN = 8;
			int Nout = 0;
			
			int inNOut = inN/Nout;
		}
		catch(Exception e) {
			// print out - will print to console without a compile error
			System.out.println("An exception occured.");
			
//			//print out - causes compile error because denominator(Nout) is not visible here.
//			System.out.println("Could not divide by " + Nout);
		}
	}
	
// FieldPractice class ends here
}