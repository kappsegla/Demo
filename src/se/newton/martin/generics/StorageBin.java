package se.newton.martin.generics;

import se.newton.martin.animalgame.IPet;
import se.newton.martin.animalgame.Mammal;

public class StorageBin<T extends Number> {
    private T storage;

    public T getStorage() {
        return storage;
    }

    public void setStorage(T storage) {
        this.storage = storage;
    }

    public double add(T tal2) {
        return storage.doubleValue() + tal2.doubleValue();
    }
}