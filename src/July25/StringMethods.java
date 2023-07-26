package July25;

public class StringMethods {
    public static void main(String[] args) {
        String s1= "Pragra";
        String s2= "Pragra";
        String s3 = "Keyboard";
        String s4 ="abc";
        System.out.println(s1.compareTo(s2));//return the integer
        System.out.println(s1.concat(s2));
        System.out.println(s1.replace('a', 'p'));
        System.out.println(s1.contains("Pragra"));
        System.out.println(s1.contentEquals("Pragra"));
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s1.substring(2));
        System.out.println(s1.codePointAt(1));
    }
}
