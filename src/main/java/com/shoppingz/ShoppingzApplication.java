package com.shoppingz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ShoppingzApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingzApplication.class, args);

    }

    //controllers
    @RestController
    public static class HomeController {
        @RequestMapping("/")
        public String index() {
            return "index.html";
        }
    }

}
