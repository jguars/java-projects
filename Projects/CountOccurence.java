import java.util.Scanner;

public class CountOccurence {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = in.nextInt();
		if (n>0)
		{
			System.out.println(digitOccurence(n));
		}
	}

	public static int digitOccurence(int num)
	{
		int ctr = 0;
		int n = num;
		do {
			if (n % 10 == 3)
			{
				ctr ++;
			}
			n /= 10;
		} while (n > 10);
		return ctr;
	}
}
