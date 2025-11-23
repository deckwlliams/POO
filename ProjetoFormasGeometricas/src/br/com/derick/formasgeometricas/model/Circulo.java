package br.com.derick.formasgeometricas.model;

public class Circulo extends FormaGeometrica implements InterfaceForma2d {
    private double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }

    @Override
    public double calcularArea() {
        return (this.raio * this.raio)*Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.raio;
    }
}
