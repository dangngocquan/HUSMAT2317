package practice_week_02;

import java.util.Scanner;

public class exe_01_18_CheckAsciiTable {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a character: ");
		char inputChar = scanner.next().charAt(0);
		scanner.close();
		//Output
		System.out.printf("The ASCII value of %s is : %d",inputChar,(int)inputChar);
	}
}
