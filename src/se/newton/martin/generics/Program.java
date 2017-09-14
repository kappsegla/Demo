package se.newton.martin.generics;

import se.newton.martin.ovning3.shapes.Rectangle;
import se.newton.martin.ovning3.shapes.Shape;

public class Program {

    /**
     * Javadoc comment. This is a generic method that can take any reference as input.
     * Type is decided at compiletime.
     * @param arg
     * @param <T>
     */
    public static <T> void genericMethod(T arg) {
        System.out.println(arg);
    }

    public static void  main(String[] args) {
        StorageBin<Integer> placeToStoreThings = new StorageBin<>();
        placeToStoreThings.setStorage(10);
        placeToStoreThings.add(20);

        genericMethod("Test");
        genericMethod(345);
        genericMethod(new Rectangle(10,10));

    }
}
