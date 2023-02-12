package com.example.demo.pattern.creationalpattern.factorymethod.message;

public class SMSMessageService implements MessageService{
    @Override
    public String getMessage() {
        return "SMS message.";
    }
}
