package com.liushuo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// @ComponentScan({"dao", "com.liushuo"}) // ComponentScan 如果制定了，只会扫描已写的包 - 不推荐
@SpringBootApplication // ComponentScan 默认扫描当前包及其子包
public class SpringbootWebReqRespApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebReqRespApplication.class, args);
    }

}
