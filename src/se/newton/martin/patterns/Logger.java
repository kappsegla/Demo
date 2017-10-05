package se.newton.martin.patterns;

public class Logger implements ILogger {
    @Override
    public void logMessage(String message){
        System.out.println(message);
    }
}
