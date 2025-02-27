import java.util.Scanner;

public class IsPositive {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number: ");
		int input = scanner.nextInt();
		System.out.println(isPositive(input));
	}

	public static boolean isPositive(int num)
	{
		if (num >= 0)
		{
			System.out.println("Yes positive number.");
			return true;
		}
		else
		{
			System.out.println("No, negative number.");
			return false;
		}
	}
}
