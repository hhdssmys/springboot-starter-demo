package com.liulong.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author clps-liulong.Mr
 * @Date 2019/10/22
 * @Time 16:39
 */
@ConfigurationProperties(prefix = "liulong.hello")
public class HelloProperties {
    //前缀
    private String prefix;
    //后缀
    private String suffix;
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public String getSuffix() {
        return suffix;
    }
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
