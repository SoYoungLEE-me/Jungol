package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		sc.close();
		
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if((str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') || 
	                (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z'))
				count++;
        }
		
		char[] temp = new char[count];
		int index = 0;
		for (int i = 0; i < str1.length(); i++) {
			if((str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') || 
	                (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')) {
				temp[index] = str1.charAt(i);
				index++;
			}
			
        }
		String str2 = new String(temp);
		
		System.out.println(str2.toUpperCase());
	}
}
