package com.example.demo.pattern.creationalpattern.abstractfactory.computercompany.products;

public class AsusGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Run Assembling Asus Gpu.");
    }
}
