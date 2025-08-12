package practice_problem;
import java.util.*;
public class Ques3 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius");
		float cels = scr.nextFloat();

		
		float fahr = (cels * 9/5) + 32;
		;
		System.out.println("Temperature in fahrenheit:");
		System.out.println(fahr);
	}
}
