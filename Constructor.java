import javax.print.DocFlavor.STRING;

class Student {

    String name;
    int age;

    public void display() {
        System.out.println(this.name + "  " + this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Constructor {

    public static void main(String[] args) {
        Student s = new Student("Raja", 24);
        s.display();
    }
}
