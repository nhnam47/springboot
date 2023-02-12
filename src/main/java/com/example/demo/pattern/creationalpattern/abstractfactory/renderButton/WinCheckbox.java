package com.example.demo.pattern.creationalpattern.abstractfactory.renderButton;

public class WinCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Paint checkbox");
    }
}
