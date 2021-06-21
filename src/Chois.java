public class Chois implements Runnable{
    public static void main(String[] args) {
        Chois runnable = new Chois();
        Thread a = new Thread(runnable);
        Thread b = new Thread(runnable);
        a.setName("a");
        b.setName("b");
        a.start();
        b.start();
        }

    synchronized public void run(){
        for (int i = 0; i < 5; i++){

            String name = Thread.currentThread().getName();
            System.out.println(name + " " + i);
        }
    }
}

