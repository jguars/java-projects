// In this program, divide-by-zero errors are handled locally, by genException( ), but an
//array boundary error is rethrown. In this case, it is caught by main( ).

public class ReThrow {
	public static void genException() {
		int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};

		for (int i=0; i<numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " +
						denom[i] + " is " +
						numer[i]/denom[i]);
			}
			catch (ArithmeticException e) {
				System.out.println("Can't divide by zero!");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No matching element found");
				throw e;
			}
		}
	}
}

class ReThrowDemo {
	public static void main(String[] args) {
		try {
			ReThrow.genException();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fatal error - " +
								"program terminated.");
		}
	}
}