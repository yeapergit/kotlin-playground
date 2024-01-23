package com.java.concepts;

public abstract class Veiculo {

    public abstract void combustivel();

    public abstract void rodas();

    public void move() {
        System.out.println("anda");
    }
}
