import java.util.Scanner;

public class ExtractFirstDigit {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer(positive/negative):");
		int n = in.nextInt();
		System.out.print("Extract the first digit from the entered integer: \n");
		System.out.println(extractFirstDigit(n));
	}

	public static int extractFirstDigit(int n)
	{
		int fact_num = 10;
		while(n / fact_num != 0)
		{
			fact_num *= 10;
		}
		return Math.abs(n / (fact_num/10));
	}
}
