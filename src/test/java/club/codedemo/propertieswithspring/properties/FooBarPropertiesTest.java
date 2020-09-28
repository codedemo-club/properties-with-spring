package club.codedemo.propertieswithspring.properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FooBarPropertiesTest {
    @Autowired
    FooBarProperties fooBarProperties;

    @Test
    public void test() {
        assertEquals("codedemo.club", this.fooBarProperties.getName());
        assertEquals("panjie", this.fooBarProperties.getAuthor());
    }
}