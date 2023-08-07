package com.example.Todo.Appication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String HelloTodo(){
        return "To-do Application !";

    }
}
