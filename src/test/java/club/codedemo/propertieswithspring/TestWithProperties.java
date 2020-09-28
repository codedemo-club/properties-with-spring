package club.codedemo.propertieswithspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(properties = {"foo2=bar2"})
@TestPropertySource("classpath:test.properties")
@TestPropertySource(properties = "foo1=bar1")
public class TestWithProperties {
    @Autowired
    Environment environment;

    @Value("${foo}")
    private String foo;

    @Value("${foo1}")
    private String foo1;

    @Value("${foo2}")
    private String foo2;

    @Test
    public void test() {
        Assertions.assertEquals("testBar", this.environment.getProperty("foo"));
        Assertions.assertEquals("testBar", this.foo);
        Assertions.assertEquals("bar1", this.foo1);
        Assertions.assertEquals("bar2", this.foo2);
    }
}
