package com.sysbytes.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    public void showMessage(){
        System.out.println("Hello AOP");
    }
}
