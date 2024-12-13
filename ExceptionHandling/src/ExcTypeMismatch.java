public class ExcTypeMismatch {
	public static void main(String[] args) {
		int nums[] = new int[4];

		try {
			System.out.println("before exception is generated.");
			nums[7] = 10;
			System.out.println("this won't be displayed.");
		}
		// can't catch an IndexOutOfBoundary with ArithmeticException
		catch (ArithmeticException e) {
			System.out.println("Index out-of-bounds.");
		}
	}
}
