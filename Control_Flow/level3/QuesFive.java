//Program to check if a number is an Armstrong number
package level3;
import java.util.Scanner;

class QuesFive {
 public static void main(String[] args) {

	 Scanner scr = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int number = scr.nextInt();
     int originalNumber = number;
     int sum = 0;

     while (originalNumber != 0) {
         int digit = originalNumber % 10;
         
         sum += Math.pow(digit, 3);
         
         originalNumber /= 10;
     }
     
     // Check if the sum of cubes equals the original number
     if (sum == number) {
         System.out.println(number + " is an Armstrong number.");
     } else {
         System.out.println(number + " is not an Armstrong number.");
     }
     scr.close();
 }
}