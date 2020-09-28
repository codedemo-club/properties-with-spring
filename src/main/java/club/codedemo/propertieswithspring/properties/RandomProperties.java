package club.codedemo.propertieswithspring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 绑定以my打头的随机值
 */
@Component
@ConfigurationProperties(prefix = "my")
public class RandomProperties {
    private String secret;
    private Long bignumber;
    private String uuid;

    /**
     * 随机int
     */
    @Value("${my.number}")
    private int randomInt;

    /**
     * 小于10
     */
    @Value("${my.number.less.than.ten}")
    private int lessThanTen;

    /**
     * 介于1024\65536
     */
    @Value("${my.number.in.range}")
    private int range;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(int randomInt) {
        this.randomInt = randomInt;
    }

    public int getLessThanTen() {
        return lessThanTen;
    }

    public void setLessThanTen(int lessThanTen) {
        this.lessThanTen = lessThanTen;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
