package se.newton.martin.threads;

public class Program implements Runnable {
    @Override
    public void run() {

        int count = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName()+  " says " + count++ );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Program p = new Program();
        Thread thread = new Thread(p);
        thread.start();
        Thread thread2 = new Thread(p);
        thread2.start();
        Thread thread3 = new Thread(p);
        thread3.start();
        System.out.println("Väntar på att trådarna ska köra klart, avsluta med Ctrl + C");
        //Do other stuff
        thread.join();
        thread2.join();
        thread3.join();
    }
}

