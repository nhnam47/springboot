package com.example.demo.pattern.dependencyinjection.inversionofcontrol;


public class UserController {

    private MessageIoC messageService;

    public UserController(MessageIoC messageService) {
        this.messageService = messageService;
    }

    public void send() {

        messageService.send("Hello dependency injection!");
    }
}
