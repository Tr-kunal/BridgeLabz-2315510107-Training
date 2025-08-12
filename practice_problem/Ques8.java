package practice_problem;
import java.util.*;
public class Ques8 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Exponent");
		int e = scr.nextInt();
		System.out.println("Enter Base");
		int b = scr.nextInt();

		
		double power = Math.pow(b, e);
		
		System.out.println("ans:");
		System.out.println(power);
	}
}
