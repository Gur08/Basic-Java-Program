package August31Streams;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
    private int id;
    private String name;
    private String email;
    private List<String> subjects;

    public OptionalDemo(int id, String name, String email, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "OptionalDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    public static void main(String[] args) {

    String name =null;

//    if (name == null){
//        System.out.println("Name not found");
//    }else
//        name.toLowerCase(); Why to handle null pointer exception before optional class

        OptionalDemo optionalDemo =new OptionalDemo(101,"Gurpreet",null,
                Arrays.asList("Maths","Physics","History","Science"));


//        Optional<Object> empty = Optional.empty();
//        System.out.println(empty); // Wrap around empty

        Optional<String> email1 = Optional.ofNullable(optionalDemo.getEmail());
        System.out.println(email1);
        // This method check if the null value is present for not
//
//        System.out.println(email1.orElse("default@gmail.com"));
//        // This method will the chk the value is present then throw the value otherwise print the default value
////
//        email1.orElseThrow(() -> new NoSuchElementException("Email not present"));
//        // This method will the chk the value is present then throw the value otherwise throw the exception

        System.out.println(email1.map(String::toString).orElseGet(()->"Default@gmail,com"));
        // This method will the chk the value is present then throw the value otherwise print the default value

//        Optional<String> email2 = Optional.of(optionalDemo.getEmail()); // it will throw null pointer exception
//        // as it just a method in optional class
//        System.out.println(email2);
        System.out.println(email1.isPresent());
    }
}
