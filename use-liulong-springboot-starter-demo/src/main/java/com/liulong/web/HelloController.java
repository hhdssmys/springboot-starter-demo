package com.liulong.web;

//import com.liulong.starter.service.HelloService;
import com.liulong.starter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author clps-liulong.Mr
 * @Date 2019/10/22
 * @Time 16:59
 */
@Controller
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/v1/{name}")
    @ResponseBody
    public String contextLoads(@PathVariable String name) {
        return helloService.sayHello(name);
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }
}
