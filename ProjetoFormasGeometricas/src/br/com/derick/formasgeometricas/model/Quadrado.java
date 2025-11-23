package br.com.derick.formasgeometricas.model;

public class Quadrado extends FormaGeometrica implements InterfaceForma2d {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "quadrado de lado"+ this.lado+" A:"+this.calcularArea() + " P:" +  this.calcularPerimetro();
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }
}

