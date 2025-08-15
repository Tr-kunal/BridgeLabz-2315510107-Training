//Program to count the number of digits in an integer
package level3;
import java.util.Scanner;

class QuesSix {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     int number = scr.nextInt();

     int count = 0;
     
     if (number == 0) {
         count = 1;
     } else {
         while (number != 0) {
             // Remove the last digit
             number /= 10;
             count++;
         }
     }
     
     System.out.println("The number of digits in " + number + " is: " + count);
          scr.close();
 }
}