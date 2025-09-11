package Class;
class Course {
    String name;
    String courseId;
    int credit;

    public Course(String name, String courseId, int credit) {
        this.name = name;
        this.courseId = courseId;
        this.credit = credit;
    }

    public void display() {
        System.out.println("Course: " + name + " | ID: " + courseId + " | Credits: " + credit);
    }
}
