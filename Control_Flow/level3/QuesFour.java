//Program to check if a number is a prime number
package level3;
import java.util.Scanner;

class QuesFour {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter a number greater than 1: ");
     int number = scr.nextInt();

     // Use a boolean variable to store the result
     boolean isPrime = true;

     if (number <= 1) {
         isPrime = false;
     } else {
         for (int i = 2; i <= Math.sqrt(number); i++) {
             // If the number is divisible by any other number, it's not prime
             if (number % i == 0) {
                 isPrime = false;
                 break; // Exit the loop as soon as a factor is found
             }
         }
     }
     if (isPrime) {
         System.out.println(number + " is a prime number.");
     } else {
         System.out.println(number + " is not a prime number.");
     }
     scr.close();
 }
}