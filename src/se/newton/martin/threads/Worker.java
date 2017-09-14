package se.newton.martin.threads;

import java.util.Random;

public class Worker implements Runnable {
    private int[] talserie;
    private int startpos;
    private int endpos;

    public Worker(int[] tal, int start, int end){
        talserie = tal;
        startpos = start;
        endpos = end;
    }

    @Override
    public void run() {
        increaseValues(talserie, startpos, endpos);
    }

    public synchronized int summa(int[] data){
        int summa = 0;
        for (int i = 0; i < data.length; i++) {
            summa += data[i]++;
        }
        return summa;
    }

    public void increaseValues(int[] data, int startpos, int endpos) {
        for (int i = startpos; i < endpos; i++) {
            data[i]++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Random r = new Random();
        int[] tal = new int[100];
        for (int i = 0; i < tal.length; i++) {
            tal[i] = r.nextInt(10);
            System.out.print(tal[i] + ",");
        }

        Worker worker1 = new Worker(tal,0,49);
        Thread thread = new Thread(worker1);
        thread.start();
        Worker worker2 = new Worker(tal,50, tal.length);
        Thread thread2 = new Thread(worker2);
        thread2.start();

        //Här kan main jobba med 1/3 av arrayen

        thread.join();
        thread2.join();

        System.out.println("\nWork done!");

        for (int i = 0; i < tal.length; i++) {
            System.out.print(tal[i] + ",");
        }


        //Thread thread = new Thread(p);
        //thread.start();


    }
}
