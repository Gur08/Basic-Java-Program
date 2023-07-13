package July_11;

import java.util.Scanner;

public class ContinueDemo {
        public static void main(String[] args) {
            //break -it will break the for loop
            // continue-- skip the current iteration
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Chandigarh sector");
            int Sector;
            for(int i=1;i<=10;i++){
                Sector= sc.nextInt();
                if (Sector==13){
                    continue;
                }
                System.out.println(Sector);
            }

        }
    }

