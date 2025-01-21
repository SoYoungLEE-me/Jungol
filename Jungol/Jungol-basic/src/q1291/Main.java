package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		int e = 0;
		while(true) {
			s = sc.nextInt();
			e = sc.nextInt();
			
			if(s<2 || s >9 || e<2 || e>9) {
				System.out.println("INPUT ERROR!");
			}
			else break;
		}
		sc.close();
		
		for(int i=1; i<=9; i++) {
			if(s<=e) {
				for(int j=s; j<=e; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, i*j);
				}
				System.out.println();
			}else if(s>=e) {
				for(int j=s; j>=e; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, i*j);
				}
				System.out.println();
			}
		
		}
		
	}

}
