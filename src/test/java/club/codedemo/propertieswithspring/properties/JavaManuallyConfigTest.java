package club.codedemo.propertieswithspring.properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JavaManuallyConfigTest {

    @Value("${java-manually.type}")
    String javaManuallyType;

    @Autowired
    Environment environment;

    @Test
    void testValue() {
        assertEquals("java", this.javaManuallyType);
    }

    /**
     * 使用PropertySourcesPlaceholderConfigurer注入配置时
     * 不能够通过Environment获取相应的值
     */
    @Test
    void testEnvironment() {
        assertNull(this.environment.getProperty("java-manually.type"));
    }
}