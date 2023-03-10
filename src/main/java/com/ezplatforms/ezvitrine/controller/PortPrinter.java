package com.ezplatforms.ezvitrine.controller;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class PortPrinter {

    @Value("${server.port}")
    private String port;

    public void printPort() {
        System.out.println("Server port: " + port);
    }
}
