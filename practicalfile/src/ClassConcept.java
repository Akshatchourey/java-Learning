class Person {
    String name;
    int age;
    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ClassConcept{
    public static void main(String[] args){
        Person person = new Person();
        person.setDetails("Anusha", 18);
        person.displayDetails();
    }
}
