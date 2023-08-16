package July25;

public class ImmutableString {
    public static void main(String[] args) {
        String s1 ="Pragra";
        String s2 ="Pragra";
        String s3 =new String("Pragra");
        String s4 = new String("Pragra1");
        System.out.println(s1==s2);
        System.out.println(s1==s3); // check the memory address and content
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); // Check the content only
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s2));
        // interview question
    }
}
