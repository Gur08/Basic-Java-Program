package ExceptionAugust19;

public class CheckedExecption {
    public void runThread() {
        try{
            callThread();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    public void callThread() throws InterruptedException {
        Thread.sleep(1000);
    }
}
class main{
    public static void main(String[] args) {
        CheckedExecption ck =new CheckedExecption();
        ck.runThread();
    }
}
// Throws is used to pass the exception to be handles by someone else
// try can be used inside a catch
// for multiple exception we can do it on one try and catch