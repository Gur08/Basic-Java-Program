package July22;

import java.util.Scanner;

public class Matrix3x3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 2D Array size first no will be row and second is column");
        int x= in.nextInt();
        int y=in.nextInt();

        int matrix[][] =new int[x][y];

        System.out.println("Please enter the array values");
        for(int i=0; i< matrix.length ;i++){
            for (int j=0; j< matrix[0].length ;j++){
                matrix[i][j]= in.nextInt();
            }
        }

        for (int a=0;a< matrix.length ;a++){
            for (int b=0;b< matrix[0].length ;b++){
                System.out.print(matrix[a][b]+" ");
            }
            System.out.println(" ");
        }

    }
}
