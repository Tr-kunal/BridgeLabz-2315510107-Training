//Program to check if a number is an Abundant Number
package level3;
import java.util.Scanner;

class QuesNine {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int number = scr.nextInt();
     int sum = 0;
     
     for (int i = 1; i < number; i++) {
         // Check if number is divisible by i
         if (number % i == 0) {
             // If true, add i to sum
             sum += i;
         }
     }

     // Outside the loop, check if sum is greater than number
     if (sum > number) {
         System.out.println(number + " is an Abundant Number.");
     } else {
         System.out.println(number + " is not an Abundant Number.");
     }

     scr.close();
 }
}