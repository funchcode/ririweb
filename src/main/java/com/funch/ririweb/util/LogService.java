package com.funch.ririweb.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



@Service
public class LogService {
    private final Logger logger = LoggerFactory.getLogger(LogService.class);

    public void log() {
        logger.trace("TRACE");
        logger.debug("DEBUG");
        logger.error("ERROR");
        logger.info("INFO");
        logger.warn("WARN");
    }
}
