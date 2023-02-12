package com.example.demo.pattern.creationalpattern.abstractfactory.renderButton;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    void createButton() {
        this.button = factory.createButton();
    }

    void paint() {
        button.paint();
    }

}
