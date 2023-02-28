package lt.lhu.unit07.main;

public class Task02 {

	public static void main(String[] args) {

		double a = 0.5;
		double b = 1.0;

		int n = 10;

		//used n-1 instead of n because we should divide by 9 in order to get 10 points
		double h = (b - a) / (n - 1);

		/*used count<=n instead of i<=b because i<=b is not accurate when we use double. 
		*the 10th point will be 1.00000004 instead of 1.0 
		*/
		for (double i = a, count = 1.0; count <= n; i += h, count++) {

			double result = Math.sqrt(Math.pow(Math.E, 2.2 * i)) - Math.abs(Math.sin(Math.PI * i / (i + 2.0 / 3.0)))
					+ 1.7;
			System.out.printf("|\t%4d\t|\t%.4f\t|\t%.6f\t|", (int) count, i, result);
			System.out.println();
			System.out.println("--------------------------------------------------------");
		}

	}

}
