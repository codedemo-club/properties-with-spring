package club.codedemo.propertieswithspring.properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CodeDemoPropertiesTest {
    @Autowired
    CodeDemoProperties codeDemoProperties;

    @Test
    void test() {
        assertEquals("www.codedemo.club", this.codeDemoProperties.getDomain());
        assertEquals("mengyunzhi", this.codeDemoProperties.getOrganization());
        assertEquals(2020, this.codeDemoProperties.getCreateYear());
    }
}