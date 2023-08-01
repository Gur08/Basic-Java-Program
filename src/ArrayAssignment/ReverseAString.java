package ArrayAssignment;

public class ReverseAString {
    public static void main(String[] args) {
        String sc ="Pragra";
        System.out.println(sc);
        char[] charArray = sc.toCharArray();
        for (char n:charArray) {
            System.out.print(" "+n);
        }
        for(int i= charArray.length-1;i>=0;i--){
            System.out.println(" ");
            System.out.print(" "+charArray[i]);
        }
    }

}
