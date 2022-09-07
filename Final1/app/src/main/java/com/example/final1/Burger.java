package com.example.final1;

import java.io.Serializable;

public class Burger implements Serializable {
    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public int getBurgerImage() {
        return burgerImage;
    }

    public void setBurgerImage(int burgerImage) {
        this.burgerImage = burgerImage;
    }

    public Burger(String burgerName, int burgerImage) {
        this.burgerName = burgerName;
        this.burgerImage = burgerImage;
    }

    private String burgerName;
    private int burgerImage;




}
