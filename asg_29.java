import java.util.ArrayList;

class Student {
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Roll No.: " + rollNo + ", Name: " + name + ", Age: " + age;
    }
}

public class asg_29 {
    public static void main(String[] args) {
        // Creating an ArrayList to store Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Adding student records
        studentList.add(new Student(101, "Alice", 20));
        studentList.add(new Student(102, "Bob", 21));
        studentList.add(new Student(103, "Charlie", 22));

        // Displaying student records
        System.out.println("Student Records:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
