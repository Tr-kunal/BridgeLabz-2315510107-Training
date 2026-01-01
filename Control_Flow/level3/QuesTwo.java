//Program to check for a Leap Year with a single if condition

package level3;
import java.util.Scanner;

class QuesTwo {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter a year: ");
     int year = scr.nextInt();

     if (year >= 1582) {
         // A year is a leap year if it's divisible by 4 but not by 100,
         // unless it is also divisible by 400.
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
             System.out.println(year + " is a Leap Year.");
         } else {
             System.out.println(year + " is not a Leap Year.");
         }
     } else {
         System.out.println("Please enter a year of 1582 or later.");
     }
     scr.close();
 }
}