package com.acorn.acorn_server1226_3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @GetMapping("/hi")
    public String hi(){
        return " 안녕하세요 코드수정 ";
    }

}
