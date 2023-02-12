package com.example.demo.pattern.creationalpattern.factorymethod.message;

public class Message {

    public static void main(String[] args) {
        MessageService messageService = new EmailMessageService();
        MessagePrinter messagePrinter = new MessagePrinter(messageService);
        messagePrinter.sendMessage();
        MessageService smsMessage = new SMSMessageService();
        MessagePrinter smsPrinter = new MessagePrinter(smsMessage);
        smsPrinter.sendMessage();
    }
}
