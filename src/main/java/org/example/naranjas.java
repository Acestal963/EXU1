package org.example;

public class naranjas {
    public int tiempo;
    public int tamano;

    public naranjas(int tan){
        this.tamano=tan;
    }

    public void tiempo(int tam){
        this.tiempo=tam*50;
    }

    public void reduce() {
        this.tiempo-=50;
    }



}
