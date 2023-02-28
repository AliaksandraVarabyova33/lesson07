package lt.lhu.unit07.main;

public class Task05 {

	public static void main(String[] args) {
		double a = 1;
		double x1 = -2 * a;
		double dX = a / 5.0;

		double n = 5;
		double y;
		double x = x1;

		for (int i = 0; i <= n; i++) {
			if (x <= 0) {
				y = a / 2.0 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
			} else {
				y = 4.0 * Math.pow(a, 3) / (Math.pow(x, 2) + 4 * Math.pow(a, 2));
			}

			System.out.printf("For argument %.2f the function result is %.4f\n", x, y);
			x += dX;
		}

	}

}
