class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ImplementConstructor{
    public static void main(String[] args) {
        Student student = new Student("Akshat", 20);
        student.displayDetails();
    }
}
