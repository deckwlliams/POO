package br.com.derick.formasgeometricas.model;

public class Cubo extends FormaGeometrica implements InterfaceForma2d, InterfaceForma3d{
    private double lado;
    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo d lado:" + this.lado + "A:" + this.calcularArea() + " P:" + this.calcularPerimetro() + " V:" + this.calcularVolume();
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.lado, 3);
    }
}
