package com.example.demo.pattern.dependencyinjection.inversionofcontrol;

import javax.management.InstanceNotFoundException;
import java.io.FileNotFoundException;

public class DependencyInjectionMain {
    public static void main(String[] args) throws InstanceNotFoundException, FileNotFoundException {
        MessageIoC messageService = (MessageIoC) Injector.getInstance("messageService");
        UserController userController = new UserController(messageService);
        userController.send();
    }
}
