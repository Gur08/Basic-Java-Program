package August31Streams;

public class ThreadRunnable {
    public static void main(String[] args) {
//        Myrunnable myrunnable =new Myrunnable();
//        Thread thread =new Thread(myrunnable);
//        thread.start();

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.print(" i: " + i);
//                }
//            }
//        };
//        Thread thread =new Thread(runnable);
//        thread.start();

        Runnable runnable =()-> {for (int i = 0; i < 10; i++) {
                    System.out.print(" i: " + i);
                }};
        Thread thread =new Thread(runnable);
        thread.start();
    }
}
class Myrunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" i: " + i);
        }
    }
}