package StringPractice;

public class Student {
    public static void main(String[] args) {
        String s1 ="Gurpreet";
        byte[] bytes = s1.getBytes();
        for (byte n:bytes) {
            System.out.println(n);
        }

    }
}
