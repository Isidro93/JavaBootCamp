package com.example.springboot;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HighMemJavaWebApp {
    private static final List < byte[] > memoryHog = new ArrayList<>();

    @GetMapping("/allocate") 
    public String allocatememory() {
        try{
            memoryHog.add(new byte[1024 * 1024]);//Allocate 1MB
            return "Allocated: "+ memoryHog.size()+" MB";
        }catch(OutOfMemoryError e){
            return "Out of memory error occurred. ";
        }
    }
}
