package q571;

import java.util.Scanner;

public class Main {
	public void printLine() {
		System.out.println("~!@#$^&*()_+|");
	}
	public static void printLine2() {
		System.out.println("~!@#$^&*()_+|");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		
		System.out.println(inp);
		//1.  instance method
		Main m1 = new Main();
		for(int i =0; i<inp; i++) {
			m1.printLine();
		}
		//2. static method
		printLine2();
		Main.printLine2();
		
	}
	
}

//static 키워드는 키워드가 붙는 순간 메모리에 바로 점유
//new 연산자를 붙여 인스턴스를 힙 영역에 생성
//인스턴스 메서드하고 static 메서드하고 구분해서 공부
//자바 모든 클래스의 최상위 부모 클래스 : object
