package practiceClass.week02;

import java.util.Scanner;

//Exercise 1.10
public class TemperatureConverter {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the degree in Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		scanner.close();
		//Solve
		double celsius = (5*(fahrenheit-32))/9;
		//Output
		System.out.printf("%s degree Fahrenheit is equal to %s in Celsius",fahrenheit, celsius);
	}
}
