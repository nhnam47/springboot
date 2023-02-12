package com.example.demo.pattern.creationalpattern.abstractfactory.renderButton;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Paint Mac button");
    }
}
