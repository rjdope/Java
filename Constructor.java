import javax.print.DocFlavor.STRING;

class Student {

    String name;
    int age;

    public void display() {
        System.out.println(this.name + "  " + this.age);
    }

    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
    }

    Student() {

    }
}

public class Constructor {

    public static void main(String[] args) {
        Student s = new Student();
        s.display();

        Student s1 = new Student(s);
        s.name = "Raja";
        s.age = 24;
        s.display();
    }
}
