package CollectionAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1WithStream {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex",23,"USA"));
        list.add(new Employee("Dave",34,"India"));
        list.add(new Employee("Carl",21,"USA"));
        list.add(new Employee("Joe",56,"Russia"));
        list.add(new Employee("Amit",64,"China"));
        list.add(new Employee("Ryan",19,"Brazil"));
        List<Employee> collect = list.stream().filter(x -> x.age > 50).collect(Collectors.toList());
        System.out.println("Employees above 50 are :\n"+collect+"\n");
        List<Employee> collect1 = list.stream().filter(y -> y.country.equals("USA")).collect(Collectors.toList());
        System.out.println("Employees from USA are :\n"+collect1);
    }
}
