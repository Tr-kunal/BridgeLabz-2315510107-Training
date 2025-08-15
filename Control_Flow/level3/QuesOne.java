//Program to check for a Leap Year using multiple if-else statements

package level3;
import java.util.Scanner;

class QuesOne {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter a year: ");
     int year = scr.nextInt();

     if (year >= 1582) {
         // A leap year is divisible by 4, but not by 100
         // which must be divisible by 400.
         if (year % 4 == 0) {
             if (year % 100 == 0) {
                 if (year % 400 == 0) {
                     System.out.println(year + " is a Leap Year.");
                 } else {
                     System.out.println(year + " is not a Leap Year.");
                 }
             } else {
                 System.out.println(year + " is a Leap Year.");
             }
         } else {
             System.out.println(year + " is not a Leap Year.");
         }
     } else {
         System.out.println("Please enter a year of 1582 or later.");
     }
     
     scr.close();
 }
}