package ExceptionAugust19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("Pragra.txt");
        File file1=new File("Pragra");
    try {
    file.createNewFile();
        }catch (IOException e){
        e.printStackTrace();
    }
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());
        System.out.println(file.canWrite());
try (FileWriter fileWriter =new FileWriter("Pragra.txt");){

    fileWriter.write("Hello I am learning Java please help me in understanding the concept");
    // fileWriter.close(); // we have to close it or use try with resources
}catch (IOException e){
     e.printStackTrace();

}
        System.out.println(file1.delete());
}
    }
