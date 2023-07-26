package July25;

public class Employee {
    int id;
    String firstname;
    String lastname;
    int age;
    String typeOfEmployment;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", typeOfEmployment='" + typeOfEmployment + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee s=new Employee();
        s.age=25;
        s.id=414;
        s.firstname ="Gurpreet";
        s.lastname ="Singh";
        s.typeOfEmployment="Permanent";
        s.salary=160000;
        System.out.println(s);
    }
}
