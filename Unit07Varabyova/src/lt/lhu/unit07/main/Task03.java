package lt.lhu.unit07.main;

public class Task03 {

	public static void main(String[] args) {

		double x = 0.5;
		double n = 20;

		double sum = 0;

		for (int k = 1; k <= n; k++) {

			sum += (Math.sin(k * x / 2.0) + Math.sin((k * x - 1.0) / 2.0)) / (Math.pow(Math.E, x - 1.0 / k));
		}
		
		double result = Math.sqrt(n * Math.PI) * sum;
		System.out.println(result);

	}

}
