package August31Streams;

public class ThreadJoin {
    public static void main(String[] args) {
        Thread thread = new Thread(new Myrunnable2("Thread 1"));
        Thread thread1 = new Thread(new Myrunnable2("Thread 2"));
        thread1.start();
        thread.start();
        try {
            thread1.join();
            thread.join(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Myrunnable2 implements Runnable{
String name;

    public Myrunnable2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" i: " + i);            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}