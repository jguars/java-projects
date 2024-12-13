public class ExcTest1 {
	static void genException() {
		int nums[] = new int[4];

		System.out.println("Before exception is generated.");
		nums[7] = 10;
		System.out.println("this won't be displayed");
	}
}
class UseThrowableMethods{
	public static void main(String[] args) {

		try {
			ExcTest1.genException();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Standard message is: ");
			System.out.println(e);
			System.out.println("\nStack trace: ");
			e.printStackTrace();
		}
		System.out.println("After catch statement.");
	}
}
