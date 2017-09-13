package se.newton.martin.exceptions;

public class MyException extends Exception {

    private int i;
    public MyException(int i){
        this.i = i;
    }

    @Override
    public String toString() {
        return "MyExceptions says that " + i + " is a bad number";
    }
}
