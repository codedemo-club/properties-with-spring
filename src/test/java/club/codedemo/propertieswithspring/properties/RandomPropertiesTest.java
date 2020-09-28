package club.codedemo.propertieswithspring.properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RandomPropertiesTest {
    @Autowired
    RandomProperties randomProperties;

    @Test
    void test() {
        assertNotNull(this.randomProperties.getSecret());
        assertNotNull(this.randomProperties.getBignumber());
        assertNotNull(this.randomProperties.getUuid());
        System.out.println(this.randomProperties.getRandomInt());
        assertEquals(true, this.randomProperties.getLessThanTen() < 10);
        assertEquals(true, this.randomProperties.getRange() >= 1024);
        assertEquals(true, this.randomProperties.getRange() <= 65536);
    }
}