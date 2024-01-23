package com.java.concepts;

public class Dummy {

    public static void main(String[] args) {

        //polymorphism
        Student student = new Student();
        Person p = new Student();
        Person p2 = new Person();

        p.diz();
        p2.diz();
        student.diz();

        //inheritance
        student.incrivel();

        //abstraction
        Carro carro = new Carro();
        carro.combustivel(); //essential feature
        carro.rodas(); //essential feature
        carro.move(); //not essential
    }

}
