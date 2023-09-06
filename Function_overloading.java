public class Studentinfo {

    String name;
    int age;

    public void display(String name) {
        System.out.println(name);
    }

    public void display(int age) {
        System.out.println(age);
    }

    public void display(String name, int age) {
        System.out.println(name = " " + age);
    }

    void Student(s1){
        s1.name;
        s1.age;
    }

}

public class Function_overloading {

    public static void main(String args[]){
        Studentinfo s = new Studentinfo(s);
        s.name = "Raja";
        s.age = 24;

        Student s1 = Student(s);
        s1.display(s.name, s.age);
    }

}
