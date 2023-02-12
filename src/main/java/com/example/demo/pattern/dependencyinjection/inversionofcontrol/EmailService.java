package com.example.demo.pattern.dependencyinjection.inversionofcontrol;

public class EmailService implements MessageIoC {

    @Override
    public void send(String s) {
        System.out.println("Email message: " + s);

    }
}
