package practice_problem;
import java.util.*;
public class Ques10 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Distance in KM");
		float km = scr.nextFloat();

		
		double miles  = km * 0.621371;
		;
		System.out.println("Distance in Miles:");
		System.out.println(miles);
	}
}
