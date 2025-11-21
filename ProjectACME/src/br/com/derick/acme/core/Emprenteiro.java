package br.com.derick.acme.core;

public class Emprenteiro extends Funcionario {
    private float valorEmpreita;
    public Emprenteiro(String nome, int numFunc, float valorEmpreita) {
        super(nome, numFunc);
        this.valorEmpreita = valorEmpreita;
    }

    public float getValorEmpreita() {
        return valorEmpreita;
    }

    public void setValorEmpreita(float valorEmpreita) {
        this.valorEmpreita = valorEmpreita;
    }


    @Override
    public float calcularSalario() {
        return this.valorEmpreita;
    }
}
