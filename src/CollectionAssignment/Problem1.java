package CollectionAssignment;

import jdk.jfr.DataAmount;

import java.util.*;
import java.util.function.Predicate;

public class Problem1 {
    public static void main(String[] args) {
        List<Employee>list=new ArrayList<>();
        list.add(new Employee("Alex",23,"USA"));
        list.add(new Employee("Dave",34,"India"));
        list.add(new Employee("Carl",21,"USA"));
        list.add(new Employee("Joe",56,"Russia"));
        list.add(new Employee("Amit",64,"China"));
        list.add(new Employee("Ryan",19,"Brazil"));
        System.out.println("\nEmployees above 50 are:-");
        for (Employee names :list) {
            if (names.age>50){
                System.out.println(names);
            }
            }

        System.out.println("\nEmployees from USA are :-");
        for (Employee names1:list) {
            if (names1.country.equals("USA")){
                System.out.println(names1);
            }
        }
        }
    }

class Employee{
public String name;
public int age;
public String country;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;

    }
}