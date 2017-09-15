package se.newton.martin.generics;

import se.newton.martin.ovning3.shapes.Rectangle;
import se.newton.martin.ovning3.shapes.Shape;

public class Program {


    /**
     * Javadoc comment. This is a generic method that can take any reference as input.
     * Type is decided at compiletime.
     *
     * @param arg
     * @param <T>
     */
     public static <T> void genericMethod(T arg) {
        System.out.println(arg);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        Thread producer = new Thread(new Producer(q));
        producer.start();

        Thread consumer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Consumer1 says:" + q.deQueue());
                }
            }
        });
        consumer1.start();

        Thread consumer2 = new Thread( () -> {
                while (true) {
                    System.out.println("Consumer2 says:" + q.deQueue());
                }
        });
        consumer2.start();

//        q.enQueue(1);
//        System.out.println(q.deQueue());
//
//        q.enQueue(1);
//        q.enQueue(2);
//        System.out.println(q.deQueue());
//        System.out.println(q.deQueue());


//        StorageBin<Integer> placeToStoreThings = new StorageBin<>();
//        placeToStoreThings.setStorage(10);
//        placeToStoreThings.add(20);
//
//        genericMethod("Test");
//        genericMethod(345);
//        genericMethod(new Rectangle(10,10));

    }
}
