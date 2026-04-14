package io.github.AntonioCoelho19.controllers;

import io.github.AntonioCoelho19.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController /*Para ele ser conhecido como controlador rest */
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting") /* Reconhecer greeting como metodo exposto ao HTTP, ou seja, ao digitar o localhost/greeting, ele encontra a função greeting */
    public Greeting greeting (
            @RequestParam(value = "name", defaultValue = "World")
            String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
