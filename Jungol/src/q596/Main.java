package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();
		
		char temp[] = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
            temp[i] = str.charAt(str.length() - 1 - i);
        }
		
		String str2 = new String(temp);
		
		if(str.length()<num) {
			System.out.println(str2);
		}
		else {
			System.out.println(str2.substring(0,num));
		}

	}
}

/*
 String change = str.split("");
 
 if(change.length() < num){
 	for(int i = change.length-1; i >= 0; i--){
 		System.out.print(change[i]);
 	} else {
 		for (int i = change.length-1; i>=length-num; i--){
 			System.out.print(change[i]);
 		}
 	}
 */

