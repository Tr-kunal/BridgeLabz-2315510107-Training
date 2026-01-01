//Program to create a calculator using switch case
package level3;
import java.util.Scanner;

class QuesTen {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter the first number: ");
     double first = scr.nextDouble();
     
     System.out.print("Enter the operator (+, -, *, /): ");
     String op = scr.next();
     
     System.out.print("Enter the second number: ");
     double second = scr.nextDouble();
     double result = 0;

     // Use switch case to perform the operation based on the operator
     switch (op) {
         case "+":
             result = first + second;
             System.out.println(first + " + " + second + " = " + result);
             break;
         case "-":
             result = first - second;
             System.out.println(first + " - " + second + " = " + result);
             break;
         case "*":
             result = first * second;
             System.out.println(first + " * " + second + " = " + result);
             break;
         case "/":
             // Check for division by zero
             if (second != 0) {
                 result = first / second;
                 System.out.println(first + " / " + second + " = " + result);
             } else {
                 System.out.println("Error: Cannot divide by zero.");
             }
             break;
         default:
             System.out.println("Invalid Operator.");
             break;
     }
     scr.close();
 }
}