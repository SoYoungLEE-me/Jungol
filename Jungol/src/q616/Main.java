package q616;

import java.util.Scanner;

class Triangle {
    private int x1, y1, x2, y2, x3, y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    
    public double[] Center(){
    	double centerX = (x1+x2+x3)/3.0;
    	double centerY = (y1+y2+y3)/3.0;
    	double[] center = {centerX, centerY};
    	return center;
    	
    }

}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
	    int y1 = sc.nextInt();
	    
	    int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        
        sc.close();
        
        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
        double[] center = triangle.Center();
        
        System.out.printf("(%.1f, %.1f)%n", center[0], center[1]);
	

	}

}
