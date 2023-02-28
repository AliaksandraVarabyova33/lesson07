package lt.lhu.unit07.main;

public class Task01 {

	public static void main(String[] args) {
		double result;

		double x = 0.5;

		result = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + 2.0 / 3.0))) + 1.7;

		System.out.println(result);

	}

}
