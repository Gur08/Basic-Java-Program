package ExceptionAugust19;

public class TestException {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*for (int n:arr) {
            System.out.println(n);
        }*/
        try{
            for (int i = 0; i <12; i++) {
                System.out.println(arr[i]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        finally {
            System.out.println("executed even after having Exception");
        }
// try with resources ---> it chk if the implements are closeable or not, they require connection
// it gonna automatic close. in that case we don't need finally block
        // try (Scanner sc = new Scanner(System.in))-- Syntax
    }
}
