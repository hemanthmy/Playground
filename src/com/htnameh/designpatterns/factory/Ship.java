package com.htnameh.designpatterns.factory;

/**
 * @author hemanth
 * @since 11/2/19
 */
public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Cargo delivered using ship");
    }

}