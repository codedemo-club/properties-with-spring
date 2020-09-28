package club.codedemo.propertieswithspring.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * 将sms.properties配置文件加载至Environment
 */
@Configuration
@PropertySource("classpath:sms.properties")
public class SmsProperties {

    @Autowired
    Environment environment;

    /**
     * 直接获取application.properties(默认情景模式)中的key
     */
    @Value("${key}")
    private String key;

    /**
     * 直接获取aplication.properties(默认情景模式)中的token
     * 如果未获取到token，则使用defaultToken做为token默认值
     */
    @Value("${token:defaultToken}")
    private String token;

    @Value("${spring.application.name}")
    private String appName;

    /**
     * 获取自定义的code-demo配置值
     */
    @Value("${code-demo.author}")
    private String codeDemoAuthor;

    public String getApiUrl() {
        return this.environment.getProperty("apiUrl");
    }

    public String getId() {
        return this.environment.getProperty("id");
    }

    public String getKey() {
        return this.key;
    }

    public String getToken() {
        return this.token;
    }

    public String getEvnToken() {
        return this.environment.getProperty("token");
    }

    public String getAppName() {
        return this.appName;
    }

    public String getCodeDemoAuthor() {
        return this.codeDemoAuthor;
    }

    public String getCodeDemoName() {
        return this.environment.getProperty("code-demo.name");
    }
}
