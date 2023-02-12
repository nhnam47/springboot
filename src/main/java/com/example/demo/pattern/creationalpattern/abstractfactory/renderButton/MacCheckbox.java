package com.example.demo.pattern.creationalpattern.abstractfactory.renderButton;

public class MacCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Paint Mac checkbox");
    }
}
