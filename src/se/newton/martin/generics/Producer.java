package se.newton.martin.generics;

import java.util.Random;

public class Producer implements Runnable {

    private Queue<String> q;

    public Producer(Queue<String> q) {
        this.q = q;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            q.enQueue("" + random.nextInt());
            try {
                Thread.sleep(random.nextInt(10)*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
