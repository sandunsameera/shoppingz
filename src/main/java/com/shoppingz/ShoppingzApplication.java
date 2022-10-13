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

    //controllers
    @RestController
    public static class ShoppingController {
        @RequestMapping("/shopping")
        public String index() {
            return "index.html";
        }
    }

    //controllers
    @RestController
    public static class SandunController {
        @RequestMapping("/sandun")
        public String index() {
            return "index.html";
        }
    }

    @RestController
    public static class cacheController {
        @RequestMapping("/cache")
        public String index() {
            return "index.html";
        }
    }

    @RestController
    public static class deployController {
        @RequestMapping("/deploy")
        public String index() {
            return "index.html";
        }
    }

    @RestController
    public static class firstRelease {
        @RequestMapping("/first")
        public String index() {
            return "index.html";
        }
    }
    @RestController
    public static class secondRelease {
        @RequestMapping("/second")
        public String index() {
            return "index.html";
        }
    }
    
    @RestController
    public static class secondRelease {
        @RequestMapping("/third")
        public String index() {
            return "index.html";
        }
    }

}
