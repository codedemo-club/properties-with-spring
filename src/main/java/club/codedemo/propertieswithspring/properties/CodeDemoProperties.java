package club.codedemo.propertieswithspring.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 通过设置前缀来达到类与配置项的映射
 */
@Component
@ConfigurationProperties(prefix = "code-dome")
public class CodeDemoProperties {
    private String domain;
    private String organization;
    private int createYear;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }
}
