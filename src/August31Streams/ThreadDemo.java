package August31Streams;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" i: "+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo =new ThreadDemo();
        threadDemo.start();
        for (int j = 0; j < 10; j++) {
            System.out.print(" j: "+j);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    }
