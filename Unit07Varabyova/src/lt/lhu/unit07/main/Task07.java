package lt.lhu.unit07.main;

public class Task07 {

	public static void main(String[] args) {
		double z;
		double result;

		double x1 = 0.5;
		double z1 = 0.6;

		double hX = 0.2;
		double zX = 0.3;

		int n = 5;
		int m = 5;

		double x = x1;
		for (int i = 0; i < n; i++) {
			z = z1;
			for (int j = 0; j < m; j++) {
				result = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z) + Math.abs(Math.log(z)) / Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2);
				System.out.printf("x = %.2f z = %.2f result = %.4f\n", x, z, result);
				z += zX;
			}
			x += hX;
		}

	}

}
