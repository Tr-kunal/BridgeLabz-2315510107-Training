package practice_problem;
import java.util.*;
public class Ques5 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Radius");
		double rad = scr.nextDouble();
		System.out.println("Enter Height");
		double height = scr.nextDouble();

		
		double volume = 3.14*rad*rad*height;
		
		System.out.println("Volume of Cylinder:");
		System.out.println(volume);
	}
}
