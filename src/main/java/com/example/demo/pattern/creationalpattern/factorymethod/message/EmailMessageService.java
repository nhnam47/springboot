package com.example.demo.pattern.creationalpattern.factorymethod.message;

public class EmailMessageService implements MessageService{
    @Override
    public String getMessage() {
        return "Email";
    }
}
