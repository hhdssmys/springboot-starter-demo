package com.liulong.starter.service;

import com.liulong.starter.properties.HelloProperties;

/**
 * @author clps-liulong.Mr
 * @Date 2019/10/22
 * @Time 16:41
 */
public class HelloService {
    HelloProperties helloProperties;

    public String sayHello(String name) {
        return helloProperties.getPrefix() + ", " + name + ", " + helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

}
