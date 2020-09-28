package club.codedemo.propertieswithspring.properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DatasourcePropertiesTest {

    @Autowired
    DatasourceProperties datasourceProperties;

    @Test
    public void test() {
        assertEquals("testdb", this.datasourceProperties.getDbname());
        assertEquals("sa", this.datasourceProperties.getUsername());
        assertEquals("sapassword", this.datasourceProperties.getPassword());
    }
}