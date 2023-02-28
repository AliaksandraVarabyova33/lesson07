package lt.lhu.unit07.main;

import java.util.Random;


public class Task04 {

	public static void main(String[] args) {
		int n = 10;
		Random rand = new Random();
		
		int countPoints = 0;
		int i = 0;
		while (i < n) {
			Double p1 = rand.nextDouble(-5, 5);
			Double p2 = rand.nextDouble(-5, 5);
			
			i++;

			if (((p1 >= -2 && p1 <= 0) && (p2 >= 0 && p2 <= 2)) || ((p1 >= 0 && p1 <= 2) && (p2 >= -1 && p2 <= 1))) {
				System.out.println("Point with coordinates: " + p1 + ", " + p2 + " is in the area");
				countPoints++;
			} else {
				System.out.println("Point with coordinates: " + p1 + ", " + p2 + " is  NOT in the area");
			}
		}

		System.out.println("The number of points in the area is: " + countPoints);
	}

}
