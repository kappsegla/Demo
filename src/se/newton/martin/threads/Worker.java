package se.newton.martin.threads;

public class Worker implements Runnable {
        @Override
        public void run() {

        }

        public static void main(String[] args) throws InterruptedException {





            Worker p = new Worker();
            Thread thread = new Thread(p);
            thread.start();


        }
    }
