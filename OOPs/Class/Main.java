package Class;
public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("OOPS", "C101", 4);
        Course c2 = new Course("Data Structures", "C102", 3);

        Faculty f1 = new Faculty("Dr. Sharma", "F01", "CSE", c1);
        Faculty f2 = new Faculty("Dr. Mehta", "F02", "CSE", c2);

        Student s1 = new Student("Kartik", 101, "kunal123@gmail.com", "Male");

        f1.grading(s1, "A");
        f2.grading(s1, "B");

        f1.display();
        f2.display();
        s1.display();
    }
}