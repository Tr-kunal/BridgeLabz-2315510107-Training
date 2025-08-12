package practice_problem;
import java.util.*;
public class Ques7 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Length");
		double l = scr.nextDouble();
		System.out.println("Enter Breadth");
		double b = scr.nextDouble();

		
		double perimeter = 2*(l+b);
		
		System.out.println("Perimeter of a Rectangle:");
		System.out.println(perimeter);
	}
}
