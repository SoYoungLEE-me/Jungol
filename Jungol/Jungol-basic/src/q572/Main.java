package q572;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
		System.out.printf("%.2f", getArea(r)) ;
		
	}
	public static double getArea(int r) {
		double result = r*r*3.14;
		return result;
	}

}
