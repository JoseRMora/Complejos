package com.example.complejos;

class Complejo {

    //Atributos
    protected double real, imaginario;

    //Constructor
    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    //Setters and Getters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    //Métodos

    public String toString(){
        return real + "+" + imaginario + "i";
    }

    /** Suma al complejo de este objeto otro complejo.
     * @param v el complejo que sumamos
     */

    public void suma(Complejo v){
        this.real = real + v.real;
        this.imaginario = imaginario + v.imaginario;
    }

    public void suma(double re, double im) {
        this.real = real + re;
        this.imaginario = imaginario + im;
    }

    public void suma(double re) {
        this.real = real + re;
    }
}


