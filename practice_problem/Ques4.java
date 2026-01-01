package practice_problem;
import java.util.*;
public class Ques4 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Radius");
		double rad = scr.nextDouble();

		
		double area = 3.14*rad*rad;
		
		System.out.println("Area of Circle:");
		System.out.println(area);
	}
}
