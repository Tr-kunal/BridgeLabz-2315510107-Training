package practice_problem;
import java.util.*;
public class Ques2 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = scr.nextInt();
		System.out.println("Enter Second Number");
		int num2 = scr.nextInt();
		
		int sum = 0;
		sum = num1 + num2;
		System.out.println("Sum:");
		System.out.println(sum);
	}
}
