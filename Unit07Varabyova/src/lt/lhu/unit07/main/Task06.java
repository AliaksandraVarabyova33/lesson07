package lt.lhu.unit07.main;

public class Task06 {

	public static void main(String[] args) {
		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4;

		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		double result;
		int sum = 0;

		for (int k = -30; k < 60; k++) {
			result = Math.pow(k, 3) - (25.0 * Math.pow(k, 2)) + (50.0 * k) + 1000;
			if ((result > t1 && result < t2) || (result > t3 && result < t4)) {
				System.out.println(result);
			} else {
				sum++;
			}
		}
		System.out.println("Not suitable values sum: " + sum);
	}

}
