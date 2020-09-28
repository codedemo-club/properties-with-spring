package club.codedemo.propertieswithspring.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * 根据配置值spring.application.db-type来加载相应的配置文件
 * 如果未设置spring.application.db-type
 * 则使用mysql做为spring.application.db-type的默认值
 */
@Configuration
@PropertySource("classpath:datasource-${spring.application.db-type:mysql}.properties")
public class DatasourceProperties {
    @Autowired
    Environment environment;

    public String getDbname() {
        return this.environment.getProperty("dbname");
    }

    public String getUsername() {
        return this.environment.getProperty("username");
    }

    public String getPassword() {
        return this.environment.getProperty("password");
    }
}
