package StringAssignment;

public class StringToArray {
    public static void main(String[] args) {
        String s1 = "Pragra";
        char[] charArray = s1.toCharArray();
        for (int i = 0; i <charArray.length ; i++) {
            System.out.println(charArray[i]);
        }
        System.out.println(" ");
        for (int j = 0; j < charArray.length; j++) {
            System.out.print(charArray[j]+"  ");
        }
    }
}
