package se.newton.martin.generics;

public class Queue {
    private int[] value = new int[100];
    private int lastposition = 0;
    private int firstposition = 0;

    public synchronized void enQueue(int value){
        this.value[lastposition] = value;
        lastposition++;
        notify();

        if(lastposition > this.value.length - 1)
            lastposition = 0;
    }

    public synchronized int deQueue(){
        while( isEmpty())
        {
            //Finns inget att läsa ut. Kön är tom.
            //Vänta lite
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int value = this.value[firstposition];
        firstposition++;

        if(firstposition > this.value.length - 1)
            firstposition = 0;
        return value;
    }

    public boolean isEmpty()
    {
        return firstposition == lastposition;
    }

}
