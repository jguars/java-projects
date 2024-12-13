public class ExcDemo5 {
	public static void main(String[] args) {

		int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};

		for (int i=0; i<numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " +
						denom[i] + " is " +
						numer[i]/denom[i]);
			} // subclass catch
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Can't divide by zero!");
			} // superclass catch
			catch (Throwable e) {
				System.out.println("Some exception occurred");
			}
		}
	}
}
