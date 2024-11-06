package main;

import controller.Engine;
import model.Database;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
//import org.apache.logging.log4j.core.Logger;
import view.Gui;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main (String[] args)
    {
        logger.trace("This is a TRACE message.");
        logger.debug("This is a DEBUG message.");
        logger.info("This is an INFO message.");
        logger.warn("This is a WARN message.");
        logger.error("This is an ERROR message.");
        logger.fatal("This is a FATAL message.");
        try{
            AppClient client = AppClient.INSTANCE;

            client.getEngine().getStartWindow();
        } catch (Exception e)
        {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
            logger.error("An error occurred:", e); // Log4j logging
        }

       
    }
}
