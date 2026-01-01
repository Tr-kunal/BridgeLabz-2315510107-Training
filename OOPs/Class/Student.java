package Class;
import java.util.*;

class Student {
    String name;
    int id;
    String mail;
    String gender;

    HashMap<Course, String> courses = new HashMap<>();

    public Student(String name, int id, String mail, String gender) {
        this.name = name;
        this.id = id;
        this.mail = mail;
        this.gender = gender;
    }

    public double gradeCalculate() {
        if (courses.isEmpty()) return 0.0;
        double sum = 0;
        for (String grade : courses.values()) {
            switch (grade) {
                case "A": sum += 10; break;
                case "B": sum += 8; break;
                case "C": sum += 6; break;
                case "D": sum += 5; break;
                default: sum += 0;
            }
        }
        return sum / courses.size();
    }

    public void display() {
        System.out.println("---- Student Details ----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mail: " + mail);
        System.out.println("Gender: " + gender);
        System.out.println("Courses Enrolled:");
        for (Course c : courses.keySet()) {
            System.out.println("   " + c.name + " (" + c.courseId + ") -> Grade: " + courses.get(c));
        }
        System.out.println("CGPA: " + gradeCalculate());
        System.out.println("-------------------------");
    }
}
