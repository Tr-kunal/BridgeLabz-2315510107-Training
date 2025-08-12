package practice_problem;
import java.util.*;
public class Ques6 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Principal");
		double p = scr.nextDouble();
		System.out.println("Enter Rate");
		double r = scr.nextDouble();
		System.out.println("Enter Time");
		double t = scr.nextDouble();

		
		double si = (p * r * t) / 100;
		
		System.out.println("Simple Interest Becomes:");
		System.out.println(si);
	}
}