package utilities;

import base.TestBase;
import org.apache.log4j.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

public class LoggerConfig {

    public  Logger logger;

    public LoggerConfig() throws IOException {
        logger = Logger.getLogger(LoggerConfig.class);
        PatternLayout layout = new PatternLayout();
        layout.setConversionPattern("%d{yyyy-MM-dd HH:mm:ss} - %C - %M - %m%n");
        ConsoleAppender consoleAppender = new ConsoleAppender(layout);
        DailyRollingFileAppender appender = new DailyRollingFileAppender(layout, System.getProperty("user.dir")+"/src/test/logs/log.txt","yyyy-MM-dd");
        logger.addAppender(appender);
        logger.addAppender(consoleAppender);
        logger.setLevel(Level.ALL);
    }

    public  Logger getLogger() {
        return logger;
    }
}
