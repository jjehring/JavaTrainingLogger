import org.apache.log4j.Logger;

public class myLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("myLog");
        logger.error("ERROR");
        logger.debug("DEBUG");
        logger.info("Just an Info");

        while (true) {
            logger.error("ERROR");
            logger.debug("DEBUG");
            logger.info("Just an Info");
        }


    }
}
