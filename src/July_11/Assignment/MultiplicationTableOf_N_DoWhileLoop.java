package July_11.Assignment;

import java.util.Scanner;

public class MultiplicationTableOf_N_DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to our Mathematic table Class");
        Scanner input =new Scanner(System.in);
        String check ="Yes";
        do {
            System.out.println("Please enter the number to get it's mathematic Table ");
            int num= input.nextInt();
            int i=1;
            int last=1;
            System.out.println("please enter upto what integer you want to see the table");
            last =input.nextInt();
            do {
                int mult=num*i;
                System.out.println(num+" * "+i+" = "+mult);
                i++;
            }while (i<=last);
            System.out.println("Do you still want to continue");
            System.out.println("Press any key to continue and No to exist");
            check = input.next();
        }while(!check.equals("no")&&!check.equals("No"));
    }
}
