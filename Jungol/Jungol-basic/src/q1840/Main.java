package q1840;

import java.util.Scanner;

//치즈 문제
//일단 입력 받아서 배열 만들어야지
//배열 만든 만큼 입력 또 받아야 함
//치즈는 1 공기는 0
//

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] board = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		sc.close();

	}

}
