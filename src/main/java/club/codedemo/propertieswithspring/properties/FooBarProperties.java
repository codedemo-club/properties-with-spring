package club.codedemo.propertieswithspring.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

/**
 * 介绍PropertySource以及PropertySources注解
 */
@Configuration
//@PropertySource("classpath:foo.properties")
//@PropertySource("classpath:bar.properties")
@PropertySources({
        @PropertySource("classpath:foo.properties"),
        @PropertySource("classpath:bar.properties")
})
public class FooBarProperties {
    @Autowired
    Environment environment;

    public String getName() {
        return this.environment.getProperty("code-demo.name");
    }

    public String getAuthor() {
        return this.environment.getProperty("code-demo.author");
    }
}
