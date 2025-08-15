//Program to calculate a student's grade based on percentage
package level3;
import java.util.Scanner;

class QuesThree {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter marks for Physics: ");
     int physics = scr.nextInt();
     System.out.print("Enter marks for Chemistry: ");
     int chemistry = scr.nextInt();
     System.out.print("Enter marks for Maths: ");
     int maths = scr.nextInt();

     // Compute the percentage
     double averageMark = (physics + chemistry + maths) / 3.0;

     String grade;
     String remarks;

     // Calculate grade as per the guidelines
     if (averageMark >= 80) {
         grade = "A";
         remarks = "(Level 4, above agency-normalized standards)";
     } else if (averageMark >= 70) {
         grade = "B";
         remarks = "(Level 3, at agency-normalized standards)";
     } else if (averageMark >= 60) {
         grade = "C";
         remarks = "(Level 2, below, but approaching agency-normalized standards)";
     } else if (averageMark >= 50) {
         grade = "D";
         remarks = "(Level 1, well below agency-normalized standards)";
     } else if (averageMark >= 40) {
         grade = "E";
         remarks = "(Level 1-, too below agency-normalized standards)";
     } else {
         grade = "R";
         remarks = "(Remedial standards)";
     }
     
     System.out.println("Report");
     System.out.printf("Average Mark: %.2f%%\n", averageMark);
     System.out.println("Grade: " + grade);
     System.out.println("Remarks: " + remarks);
     scr.close();
 }
}