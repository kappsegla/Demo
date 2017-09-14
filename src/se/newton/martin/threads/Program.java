package se.newton.martin.threads;

import java.util.Scanner;

public class Program implements Runnable {

    public boolean keepGoing = true;

    @Override
    public void run() {
        int count = 0;
        while (keepGoing) {
            System.out.println(Thread.currentThread().getName() + " says " + count++);
            try {
                sleepTime();
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }

        }
    }

    public synchronized void sleepTime() throws InterruptedException {
        wait(3000);
    }

    public synchronized void wakeUp() {
        notify();
    }


    public static void main(String[] args) throws InterruptedException {
        Program p = new Program();
        Thread thread = new Thread(p);
        thread.start();
//        Thread thread2 = new Thread(p);
//        thread2.start();
//        Thread thread3 = new Thread(p);
//        thread3.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("Tryck Enter för att stoppa tråden");
        String text = sc.nextLine();
        p.keepGoing = false;
        p.wakeUp();

        System.out.println("Väntar på att trådarna ska köra klart, avsluta med Ctrl + C");
        //Do other stuff
        thread.join();
        System.out.println("Tråden klar. Programmet avslutas.");
//        thread2.join();
//        thread3.join();
    }
}

