import java.util.TreeSet;

public class CVX implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("1");
        System.out.println("2");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CVX());
        thread.start();
        Thread thread1 = new Thread(new CVX());
        thread1.start();
        thread.setName("t1");
        thread1.setName("t2");

    }
}
