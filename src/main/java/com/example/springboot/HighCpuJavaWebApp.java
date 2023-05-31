package com.example.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HighCpuJavaWebApp {

    @GetMapping("/highcpu")
    
    public String highCpu(){
        long result=0;
        long startTime=System.currentTimeMillis();
        for(long i=1; i <= 100000000; i++) {
            result += i;
        }
        long endTime=System.currentTimeMillis();
        long elapsedTime=endTime - startTime;
        return"Result: "+ result + ", Time taken: "+ elapsedTime + " milliseconds";
    }
}
