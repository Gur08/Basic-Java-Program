package ExceptionAugust19;

import java.io.File;
import java.util.Scanner;


public class FileReading {
    public static void main(String[] args) {
        File f = new File("Pragra.txt");
        try {
            Scanner sc =new Scanner(f);
            while (sc.hasNextLine()){
//                System.out.println(sc.nextLine());
                String s = sc.nextLine();
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
