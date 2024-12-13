public class ExcTest {
	public static void main(String[] args) {
		try	{
			ExcTest.genException();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out-of-bounds!");
		}
		System.out.println("After catch statement.");
	}

	static void genException() {
		int nums[] = new int[4];
		System.out.println("Before exception is generated.");

		nums[7] = 10;
		System.out.println("This won'tbe displayed.");
	}
}
