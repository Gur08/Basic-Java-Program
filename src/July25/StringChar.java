package July25;

public class StringChar {
    public static void main(String[] args) {
        String s1 ="pragra";
        char[] chars =s1.toCharArray();
        for (char ch :chars) {
            System.out.print(" "+ch);
        }
        System.out.println(" ");
        System.out.println(s1.charAt(3));

    }
}