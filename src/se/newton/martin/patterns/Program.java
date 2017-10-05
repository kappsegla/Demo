package se.newton.martin.patterns;

import org.jetbrains.annotations.NotNull;

public class Program {

    public static void doSomething(@NotNull ILogger logger){

        logger.logMessage("doSomething logs.");
    }

    public static void main(String[] args) {

        //With real logger
        //
        ILogger logger = null;//  = new Logger();
        //ILogger logger  = new NullLogger();

        //Do stuff

        //    logger.logMessage("First log entry");
        //Do more stuff

         //   logger.logMessage("Second log entry");
        //....
        doSomething(logger);

    }
}
