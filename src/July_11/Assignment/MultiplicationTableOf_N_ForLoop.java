package July_11.Assignment;

import java.util.Scanner;

public class MultiplicationTableOf_N_ForLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to our Mathematic table Class");
        Scanner input =new Scanner(System.in);

        for (String check ="Yes";!check.equals("no")&&!check.equals("No");){
            System.out.println("Please enter the number to get it's mathematic Table ");
            int num= input.nextInt();
            int last=1;
            System.out.println("please enter upto what integer you want to see the table");
            last =input.nextInt();
            for (int i=1;i<=last;i++){
                int mult=num*i;
                System.out.println(num+" * "+i+" = "+mult);
            }
            System.out.println("Do you still want to continue");
            System.out.println("Press any key to continue and No to exist");
            check = input.next();
        }
    }
}
