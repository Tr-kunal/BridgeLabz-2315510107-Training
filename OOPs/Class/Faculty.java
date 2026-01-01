package Class;
class Faculty {
    String name;
    String id;
    String department;
    Course course;  // Faculty handles one course

    public Faculty(String name, String id, String department, Course course) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.course = course;
    }

    // Faculty assigns grade to student
    public void grading(Student s, String grade) {
        s.courses.put(course, grade);
    }

    public void display() {
        System.out.println("---- Faculty Details ----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Teaches: " + course.name);
        System.out.println("-------------------------");
    }
}

