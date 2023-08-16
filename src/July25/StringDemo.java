package July25;

public class StringDemo {
    // String - Collection of character or array of characters
    // primitive data type
    // String is a class


    public static void main(String[] args) {
        String s1 ="Pragra"; // literal - the way of creating string
        System.out.println(s1);
        String s2 =new String("Pragra");
        System.out.println(s2);


        // as we create a string using new keyword it creates new object even if it same with different memory address
        // if we create the string as s1="Gur" then it will refer to same if string if the word is same
        // the object can never be change its reference can be changed  (its immutable)

    }

}
