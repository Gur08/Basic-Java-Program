package Java8Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        List <Person> list = new ArrayList<>();
        list.add(new Person("Dave",23,"India"));
        list.add(new Person("Joe",18,"USA"));
        list.add(new Person("Ryan",54,"Canada"));
        list.add(new Person("Iyan",5,"India"));
        list.add(new Person("Ray",63,"China"));
        List<Person> india = list.stream().filter((e) -> e.country.equals("India")).collect(Collectors.toList());
        System.out.println("Person belongs to India : "+india);
        Optional<Person> india1 = list.stream().findFirst().filter(e -> e.country.equals("India"));
        System.out.println("The first person in the list belongs to india is "+india1);
        long count = list.stream().filter(e -> e.age > 30).count();
        System.out.println("Number of employees above 30 are : "+count);
        List<String> collect = list.stream().map(e -> e.name.toUpperCase()).collect(Collectors.toList());
        System.out.println("Names in uppercase : "+collect);
        List<Integer> collect1 = list.stream().map(e -> e.name.length()).collect(Collectors.toList());
        System.out.println("Length of each name : "+collect1);
    }
}
class Person{
    String name;
    int age;
    String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}