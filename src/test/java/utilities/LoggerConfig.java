package utilities;

import base.TestBase;
import org.apache.log4j.*;

import java.io.IOException;

public class LoggerConfig {

    public  Logger logger;

    public LoggerConfig() throws IOException {
        logger = Logger.getLogger(LoggerConfig.class);
        PatternLayout layout = new PatternLayout();
        layout.setConversionPattern("%d{yyyy-MM-dd HH:mm:ss} - %C - %M - %m%n");
        ConsoleAppender consoleAppender = new ConsoleAppender(layout);
        FileAppender appender = new FileAppender(layout, System.getProperty("user.dir")+"/src/test/logs/log.txt", true);
        logger.addAppender(appender);
        logger.addAppender(consoleAppender);
        logger.setLevel(Level.ALL);
    }

    public  Logger getLogger() {
        return logger;
    }
}
