package July25;

public class Student {
    String name;
    int age;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student =new Student();
        student.name ="Peter";
        student.age=25;
//       System.out.println(student.age+" "+student.name);
        System.out.println(student);
    }
}
