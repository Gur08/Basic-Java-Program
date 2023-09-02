package August31Streams;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
    private int id;
    private String name;
    private String email;

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

    @Override
    public String toString() {
        return "Optional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public OptionalDemo(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static void main(String[] args) {

    String name =null;

//    if (name == null){
//        System.out.println("Name not found");
//    }else
//        name.toLowerCase();
OptionalDemo optionalDemo =new OptionalDemo(101,"Gurpreet","Gur@gmail.com");
        Arrays.asList("Maths","Science","Physics","History");

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> email1 = Optional.ofNullable(optionalDemo.getEmail());
        System.out.println(email1);

        System.out.println(email1.orElse("default@gmail.com"));

        email1.orElseThrow(() -> new NoSuchElementException("Email not present"));
        System.out.println(email1.map(String::toString).orElseGet(()->"Default@gmail,com"));


    }
}
