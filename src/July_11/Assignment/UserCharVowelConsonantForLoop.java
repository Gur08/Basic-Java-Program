package July_11.Assignment;

import java.util.Scanner;

public class UserCharVowelConsonantForLoop {
    public static void main(String[] args) {
        for (String input = "Yes";(!input.equals("No")&&!input.equals("no"));){
            System.out.println("Welcome to our Alphabet Identification site ");
            System.out.println("Please Enter a Single Character to check whether it Consonant or Vowel");
            Scanner sc=new Scanner(System.in);
            char user = sc.next().charAt(0);
            int i=0;
            switch (user){
                case'a':
                case'e':
                case'i':
                case'o':
                case'u':
                case'A':
                case'E':
                case'I':
                case'O':
                case'U':
                    i++;
            }
            if (i==1){
                System.out.println("Enter Character "+user+" is a Vowel");
            } else if (((user > 'a') && (user <= 'z')) || ((user>'A') &&(user<= 'Z'))) {
                System.out.println("Enter Character "+user+" is a Consonant");
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("Do you still want to continue");
            System.out.println("Press any key to continue and No for exist");
            input=sc.next();

        }
    }
}
