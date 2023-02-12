package com.example.demo.pattern.creationalpattern.abstractfactory.renderButton;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Paint Window Button");
    }
}
