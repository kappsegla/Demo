package se.newton.martin.threads;

import java.util.Scanner;

public class Program implements Runnable {
    @Override
    public void run() {

        int count = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName()+  " says " + count++);
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
//        Thread thread2 = new Thread(p);
//        thread2.start();
//        Thread thread3 = new Thread(p);
//        thread3.start();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Skriv något på tangentbordet och tryck Enter");
            String text = sc.nextLine();
            System.out.println("Du skrev: " + text);
        }

        System.out.println("Väntar på att trådarna ska köra klart, avsluta med Ctrl + C");
        //Do other stuff
        thread.join();
//        thread2.join();
//        thread3.join();
    }
}

