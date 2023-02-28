package lt.lhu.unit07.main;

public class Task08 {

	public static void main(String[] args) {

		double x = 0.1;
		double h = 0.1;
		double n = 10;

		double previousY = Double.NaN;

		while (x < n) {
			double y = calculateFunction(x);

			if (y == 0) {
				System.out.println("Function zero is found with x " + x);
				break;
			} else {
				if (previousY == Double.NaN) {
					previousY = y;
				} else {
					if ((y > 0 && previousY < 0) || (y < 0 && previousY > 0)) {
						System.out.printf("Function zero is found between %.4f and %.4f", previousY, y);
						break;
					} else {
						previousY = y;
						x += h;
					}
				}
			}

		}

		if (x >= n) {
			System.out.println("Function zero was not found");
		}

	}

	public static double calculateFunction(double x) {
		return Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;
	}

}
