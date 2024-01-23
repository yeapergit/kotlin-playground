package com.java.concepts;

public class Carro extends Veiculo{
    @Override
    public void combustivel() {
        System.out.println("gasoleo");
    }

    @Override
    public void rodas() {
        System.out.println("4 rodas");
    }
}
