package practice_week_02;

import java.util.Scanner;

public class exe_01_11_TimeConverter {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input seconds: ");
		int numberSeconds = scanner.nextInt();
		scanner.close();
		//Solve
		int hour = numberSeconds/3600;
		int minute = (numberSeconds - 3600*hour)/60;
		int seconds = numberSeconds - 3600*hour - 60*minute;
		//Output
		System.out.printf("%d:%d:%d",hour,minute,seconds);
	}
}
