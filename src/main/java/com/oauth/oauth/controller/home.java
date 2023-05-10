package com.oauth.oauth.controller;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public String home(){
        return "home page";
    }
    @GetMapping("/secured")
    public String secured(){
            return "hello,secured";
    }






}
