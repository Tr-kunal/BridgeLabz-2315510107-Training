//Program to check if a number is a Harshad Number 
//A Harshad number is an integer which is divisible by the sum of its digits

package level3;
import java.util.Scanner;

class QuesEight {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int number = scr.nextInt();
     
     int originalNumber = number;
     int sum = 0;

     while (number != 0) {
         int digit = number % 10;
         sum += digit;
         number /= 10;
     }

     // Check if the original number is perfectly divisible by the sum
     if (originalNumber > 0 && originalNumber % sum == 0) {
         System.out.println(originalNumber + " is a Harshad Number.");
     } else {
         System.out.println(originalNumber + " is not a Harshad Number.");
     }
     scr.close();
 }
}