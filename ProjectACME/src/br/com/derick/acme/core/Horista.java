package br.com.derick.acme.core;

public class Horista extends Funcionario{
    private int numeroHora;
    private float valorHora;

    public Horista(String nome, int numFunc, int numeroHora, float valorHora) {
        super(nome, numFunc);
        this.numeroHora = numeroHora;
        this.valorHora = valorHora;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumeroHora() {
        return numeroHora;
    }

    public void setNumeroHora(int numeroHora) {
        this.numeroHora = numeroHora;
    }

    @Override
    public float calcularSalario() {
        return this.numeroHora * this.valorHora;
    }
}
