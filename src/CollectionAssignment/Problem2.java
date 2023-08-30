package CollectionAssignment;

public class Problem2 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 2, 34, 66, 5, 4, 33, 45, 6, 8, 56, 76, 78, 98, 34, 37, 12, 12, 23, 43, 54, 56};
        System.out.println("\nNumbers greater than 50 are :-");
        for (int num : numbers) {
            if (num > 50) {
                System.out.print(num + " , ");
            }
        }

        System.out.println("Greatest number is :");
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println( max);
        System.out.println("\nSmallest number is :");
        int min=50;
        for (int num :numbers) {
            if (num < min){
                min=num;
            }
        }
        System.out.println(min);
    }
}
