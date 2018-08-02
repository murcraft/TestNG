package by.htp.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogApp {

	    @Test
	    public void LogTest(){
	        Logger logger = LogManager.getRootLogger();
	        logger.info("Information message");
	        logger.debug("Debug message");
	        logger.trace("Trace message");
	        logger.error("Error message");
	        logger.fatal("Fatal message");
	        logger.warn("Warning message");
	    }
	

}
