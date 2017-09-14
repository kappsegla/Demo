package se.newton.martin.threads;

public class Workers implements Runnable {
        @Override
        public void run() {

        }

        public static void main(String[] args) throws InterruptedException {
            Program p = new Program();
            Thread thread = new Thread(p);
            thread.start();

        }
    }
