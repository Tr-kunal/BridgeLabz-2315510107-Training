package practice_problem;
import java.util.*;
public class Ques9 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = scr.nextInt();
		System.out.println("Enter num2");
		int num2 = scr.nextInt();
		System.out.println("Enter num3");
		int num3 = scr.nextInt();

		
		double average = (num1+num2+num3)/3;
		
		System.out.println("Average of Three number:");
		System.out.println(average);
	}
}
