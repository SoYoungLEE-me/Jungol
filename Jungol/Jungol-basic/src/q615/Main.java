package q615;

import java.util.Scanner;

class Student{
	private String name;
	private int score1;
	private int score2;
	
	public Student(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	public void print() {
		System.out.println(name + " " + score1 + " " + score2);
	}
	public int getScore1() {
		return score1;
	}
	public int getScore2() {
		return score2;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Student[] student = new Student[2];
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<student.length; i++) {
			String name = sc.next();
			int score1 = sc.nextInt();
			int score2 = sc.nextInt();
			student[i] = new Student(name, score1, score2);
		}
		sc.close();
		
		
		for(int i=0; i<student.length; i++) {
			student[i].print();
		}
		
		 int score1_avg = 0, score2_avg = 0;
	     for (int i = 0; i < student.length; i++) {
	        score1_avg += student[i].getScore1();
	        score2_avg += student[i].getScore2();
	     }
		
		score1_avg /= student.length; 
        score2_avg /= student.length; 
		
		System.out.print("avg " + score1_avg + " " + score2_avg );
		

	}

}

//객체 속성은 하나의 객체가 갖는 온전한 속성임. 그래서 평균 구하는걸 원해 안에 과목별 메서드로 만드려고 했는데 적절한 구조는 아니라고 하시네. 
//여러 객체의 속성을 합해서 구하는 메서드는 밖에 쪽에 클래스를 만드는 식으로 하는게 좋음
//학생 수를 동적으로 받으려면 변수 n으로 학생 수 입력받으면 됨
