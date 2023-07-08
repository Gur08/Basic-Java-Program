package July08.Loops;

public class SumNaturalNumber {
    public static void main(String[] args) {
      /*  int a=1;
        while(a<=10) {
            int b = a+1;
            int c=(a*b)/2;
            System.out.println(a);
            a++;
            if(a==11) {
               System.out.println(c);
            }
        }*/
        int a =1;
        int b=0;
        while(a<=10){
            b+=a;
           // System.out.println(a);
            a++;
           // if(a==11){
           //     System.out.println("Sum of first 10 Natural Number = "+b);
           // }
        }
        System.out.println("Sum of first 10 Natural Number = "+b);
    }
}
