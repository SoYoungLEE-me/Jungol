package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		
		int obesity = weight+100-height;
		System.out.println(obesity);
		if(obesity>0) {
			System.out.print("Obesity");
		}
		sc.close();
		
		
	}

}
