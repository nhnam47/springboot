package com.example.demo.pattern.creationalpattern.factorymethod.message;

public class MessagePrinter {

    private MessageService messageService;

    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        System.out.println(messageService.getMessage());
    }
}
