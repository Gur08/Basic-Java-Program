package StringPractice;

public class ClassRevise {
    public static void main(String[] args) {

        String s1 ="Pragra";
        //System.out.println(s1);
        String s2 = new String("Pragra");
        String s3 = "Pragra";
        String s4 = "Pragra";
        String s5 = new String("Pragra");
        System.out.println(s1==s2); //True
        System.out.println(s1==s3); //True
        System.out.println(s1==s4); //True
        System.out.println(s2==s5); //True
        System.out.println(s3==s4); //True

        System.out.println(s1.equals(s2)); //False
        System.out.println(s1.equals(s3)); //True
        System.out.println(s1.equals(s4)); //True
        System.out.println(s2.equals(s5)); //False
        System.out.println(s3.equals(s4)); //True
    }
}
