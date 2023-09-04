package August31Streams;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread thread = new Thread(new Myrunnable3(),"Thread1");
        Thread thread1 = new Thread(new Myrunnable3(),"Thread2");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread.start();
    }
}
class Myrunnable3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" With Priority " + Thread.currentThread().getPriority()+ " is counting " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}