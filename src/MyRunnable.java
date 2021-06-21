public class MyRunnable implements Runnable{
    public void run(){
        go();
    }
    public void go(){
        System.out.println("Вершина стека");
    }
}

class ThreadTestDrive{
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();

        try {
            myThread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Возвращаемся в метод main");

//        Thread thread2 = new Thread(threadJob);
//        thread2.start();
//        System.out.println("th");
    }
}
