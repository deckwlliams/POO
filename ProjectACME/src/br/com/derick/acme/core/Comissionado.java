package br.com.derick.acme.core;

public class Comissionado extends Funcionario {
    private float salarioBase;
    private float comissario;

    public Comissionado(String nome, int numFunc, float salarioBase, float comissario) {
        super(nome, numFunc);
        this.salarioBase = salarioBase;
        this.comissario = comissario;
    }
    public float getComissario() {
        return comissario;
    }

    public void setComissario(float comissario) {
        this.comissario = comissario;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }


    @Override
    public float calcularSalario() {
        return this.salarioBase + this.salarioBase * this.comissario/100;
    }
}
