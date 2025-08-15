//Program to find the BMI of a person
package level3;
import java.util.Scanner;

class QuesSeven {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter your weight in kilograms (kg): ");
     double weight = scr.nextDouble();
     System.out.print("Enter your height in centimeters (cm): ");
     double heightInCm = scr.nextDouble();

     // Convert height from cm to meters for the formula
     double heightInMeters = heightInCm / 100.0;

     // Use the formula BMI = weight / (height * height)
     double bmi = weight / (heightInMeters * heightInMeters);

     String status;
     
     if (bmi <= 18.4) {
         status = "Underweight";
     } else if (bmi >= 18.5 && bmi <= 24.9) {
         status = "Normal";
     } else if (bmi >= 25.0 && bmi <= 39.9) {
         status = "Overweight";
     } else {
         status = "Obese";
     }

     System.out.printf("\nYour BMI is: %.2f\n", bmi);
     System.out.println("Your weight status is: " + status);

     scr.close();
 }
}