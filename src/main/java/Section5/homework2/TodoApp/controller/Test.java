package Section5.homework2.TodoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/v1")
    public String HelloWorld(){
        return "To do Application!!, 어떻게 하는건지 진짜 모르겠다,,,";
    }
}