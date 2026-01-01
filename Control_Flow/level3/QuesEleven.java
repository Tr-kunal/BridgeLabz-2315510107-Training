//Program to find the day of the week for a given date
package level3;
import java.util.Scanner;

class QuesEleven {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter the month (1-12): ");
     int m = scr.nextInt();
     System.out.print("Enter the day (1-31): ");
     int d = scr.nextInt();
     System.out.print("Enter the year: ");
     int y = scr.nextInt();

     // Calculate the day of the week using the given formulas
     int y0 = y - (14 - m) / 12;
     int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
     int m0 = m + 12 * ((14 - m) / 12) - 2;
     int d0 = (d + x + 31 * m0 / 12) % 7;

     System.out.println("The day of the week is: " + d0);

     scr.close();
 }
}