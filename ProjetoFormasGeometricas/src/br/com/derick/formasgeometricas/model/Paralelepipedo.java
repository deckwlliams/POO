package br.com.derick.formasgeometricas.model;

public class Paralelepipedo extends FormaGeometrica implements InterfaceForma3d{
    private double altura;
    private double largura;
    private double profundidade;
    public Paralelepipedo(double aultura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }


    @Override
    public String toString() {
        return "largura do paralelepipedo " + this.altura +" / " + this.largura +"/ "  + this.profundidade +"/ " + this.calcularVolume();
    }

    @Override
    public double calcularVolume() {
        return this.altura * this.largura * this.profundidade;
    }
}
