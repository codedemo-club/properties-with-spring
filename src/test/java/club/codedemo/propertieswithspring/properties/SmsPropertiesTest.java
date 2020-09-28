package club.codedemo.propertieswithspring.properties;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SmsPropertiesTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SmsProperties smsProperties;

    @Test
    void test() {
        assertEquals("http://api.codedemo.club/sendMessage",
                this.smsProperties.getApiUrl());

        assertEquals("thisisid",
                this.smsProperties.getId());

        assertEquals("thisiskey",
                this.smsProperties.getKey());

        logger.info(this.smsProperties.getToken());
        logger.info(this.smsProperties.getEvnToken());
        logger.info(this.smsProperties.getAppName());
        logger.info(this.smsProperties.getCodeDemoAuthor());
        logger.info(this.smsProperties.getCodeDemoName());
    }
}