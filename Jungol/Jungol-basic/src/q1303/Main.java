package q1303;

import java.util.Scanner;

//숫자사각형


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		int k = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println("");
		}
		
		
	}

}
