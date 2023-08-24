package ExceptionAugust19;

public class ControlException {
    public static void main(String[] args) {
        String name ="Pragra";
        name =null;
try {
    System.out.println(name.toLowerCase());
    System.out.println("Hello Hi"); //---> it will not be executed because the code is break in last line
}catch (NullPointerException e){ // we can replace null point exception by runtime exception or exception because these are the parent class
    e.printStackTrace(); //----> print stack gives the stack tray of where the error exactly
    // if the code is in catch block it will execute
}
catch (RuntimeException e){
    e.printStackTrace();
}catch (Exception e){
    e.printStackTrace();
}
//        System.out.println("Hello");

finally{
    System.out.println("I'm in Finally block");
        }
        // Try and catch is used to make the flow of the program even though it have exception
        //
    }
}
// how to make finally not to execute
// use the statement system.exit(status:0); that has to be the first statement in finally
// I can have multiple catch block with one try block
// if we want the code should run whatever is the exception the we write in a finally block -- like we use scanner
// block but if we have exception to close the scanner class