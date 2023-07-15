package July_11.Assignment;

public class PragraWhenEvenNoDoWhileLoop {
    public static void main(String[] args) {
        int i=0;
       do {
            if (i%2==0){
                System.out.println(i+" Pragra");
            }else{
                System.out.println(i);
            }
            i++;
        }while(i<10);
    }
}
