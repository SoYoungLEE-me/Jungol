package q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		int res1 = num1+ 100;
		int res2 = num2%10;
		
		System.out.println(res1 + " " + res2);
	}

}
