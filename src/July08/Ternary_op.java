package July08;

import java.util.Enumeration;

public class Ternary_op {
    public static void main(String[] args){
        // chk if the number is even or odd
        int num = 10;
        //if(num%2 ==0){
       //    System.out.println("number is even");
      // }else{
       //    System.out.println("number is odd");
       // }
        String result = (num %2 ==0)? "even": "odd";
        System.out.println(result);
    }
}
