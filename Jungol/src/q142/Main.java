package q142;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.close();

        for (int j = 0; j < (n * 2) - 1; j++) { 
            if (j < n) {
                for (int k = 0; k <= j; k++) {
                    System.out.print("*");
                }
            } else { 
                for (int h = 0; h < (n * 2 - 1) - j; h++) { // 별 개수 감소
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
