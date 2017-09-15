package se.newton.martin.generics;

public class Queue<T> {
    //Vi får inte skapa objekt av typen T i java generics. Använd Object istället
    //och typecasta (T) vid behov. Se deQueue metoden.
    private Object[] value = new Object[100];
    private int lastposition = 0;
    private int firstposition = 0;

    public synchronized void enQueue(T value){
        this.value[lastposition] = value;
        lastposition++;
        notify();

        if(lastposition > this.value.length - 1)
            lastposition = 0;
    }

    public synchronized T deQueue(){
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

        T value = (T)this.value[firstposition];
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
