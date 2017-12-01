package com.tookbra.monine;

import com.tookbra.monine.config.EnableProtocol;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author tookbra
 * @date 2017/12/1
 * @description
 */
@EnableProtocol(name = "monine", port = 6400)
public class Main2 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main2.class, args);
        context.close();
    }
}
