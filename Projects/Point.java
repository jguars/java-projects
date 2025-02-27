public class Point
{
	private int x;
	private int y;

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public Point (double x, double y)
	{
		this.x = (int) x;
		this.y = (int) y;
	}

	public void printPoint()
	{
		System.out.println("Point (x, y): ("+ x + ", " + y + ")");
	}

	public static void main(String[] args) {
		Point point1 = new Point(4, 5);
		point1.printPoint();

		Point point2 = new Point(4.5, 5.5);
		point2.printPoint();
	}
}
