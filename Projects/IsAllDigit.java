import java.util.Scanner;

public class IsAllDigit {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Input an integer:");
		int n = in.nextInt();
		System.out.println("Check whether every digit of the entered integer is even or not! \n");
		System.out.println(isAllDigit(n));
	}

	public static boolean isAllDigit(int n)
	{
		final int f = 10;
		if (n == 0)
		{
			return false;
		}
		while (n != 0)
		{
			if ((n % f) % 2 != 0)
			{
				return false;
			}
			n /= 10;
		}
		return true;
	}
}
