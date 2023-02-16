package org.example;

public class Animal {

    String nombre;
    String genero;

    double peso=1;
    Animal pareja;

    public Animal() {
    }

    public Animal(String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    public Animal(String nombre, String genero, double peso, Animal Pareja) {
        this.nombre=nombre;
        this.genero= genero;
        this.peso = peso;
        this.pareja= pareja;
    }
    public void encontrarPareja(Animal pareja){this.pareja=pareja;}
    }




