public class ExcDemo1 {
	public static void main(String[] args) {
		int nums[] = new int[4];

		try {
			System.out.println("Before exception is being generated.");
			nums[0] = 10;
			System.out.println("this won't be displayed.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out-of-bounds");
		}
		System.out.println("After a catch statement.");
	}
}
