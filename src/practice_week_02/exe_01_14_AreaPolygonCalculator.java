package practice_week_02;

import java.util.Scanner;

public class exe_01_14_AreaPolygonCalculator {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number of sides on the polygon: ");
		int numberSides = scanner.nextInt();
		System.out.print("Input the length of one of the sides: ");
		double side = scanner.nextDouble();
		scanner.close();
		//Solve
		double area = (numberSides*side*side)/(4*Math.tan(Math.PI/numberSides));
		//Output
		System.out.println("The area is: " + area);
	}
}
