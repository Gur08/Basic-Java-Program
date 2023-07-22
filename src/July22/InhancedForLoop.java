package July22;

import java.util.Scanner;

public class InhancedForLoop {
    // for( type something: array){
    // print that something
    // }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner in =new Scanner(System.in);
        int y = in.nextInt();
        String name[] = new String[y];
        System.out.println("Please enter the names");
        for(int i=0; i<y;i++){
            name[i]= in.next();
        }
        System.out.println("Enter Input");
        for (String n :name){
            System.out.println(n);
        }
    }
}
