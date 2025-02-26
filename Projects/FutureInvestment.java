import java.util.Scanner;

public class FutureInvestment {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("input the investment amount: ");
		double investment = in.nextDouble();
		System.out.println("Input the rate of interest: ");
		double rate = in.nextDouble();
		System.out.println("Input number of years: ");
		int year = in.nextInt();

		rate *= 0.01;

		System.out.println("Years Future Value");
		for (int i = 0; i < year; i++) {
			int formatter = 19;
			if (i >= 10) formatter = 18;
			System.out.printf(i+"%"+formatter+".2f\n", futureInvestment(investment, rate/12, i));
		}
	}

	public static double futureInvestment(double investment, double monthlyrate, int years)
	{
		return investment * Math.pow(1 + monthlyrate, years * 12);
	}
}
