package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum  = num1+num2+num3;
		int avg = sum/3;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		*/
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum/arr.length));

	}

}
