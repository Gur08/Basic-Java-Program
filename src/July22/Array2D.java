package July22;

public class Array2D {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{2,5,6},{5,2,5}};
        for (int i=0; i< arr.length;i++){
            for (int j=0; j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
