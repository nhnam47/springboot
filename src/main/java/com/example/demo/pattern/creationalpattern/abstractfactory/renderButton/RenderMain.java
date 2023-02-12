package com.example.demo.pattern.creationalpattern.abstractfactory.renderButton;

public class RenderMain {

    private static final String OS_SYSTEM = "Windows";

    public static void main(String[] args) {
        GUIFactory factory;
        if (OS_SYSTEM == "Windows") {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.createButton();
        app.paint();
    }
}
