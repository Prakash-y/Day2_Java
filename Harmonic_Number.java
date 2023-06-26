package Day2;

import java.util.Scanner;

public class Harmonic_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		double sum = 0;
		for(double i =1; i<=num; i++)
		{
			sum = sum +(1/i);
		}
		System.out.println(sum);
	}
}
