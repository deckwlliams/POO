package br.com.derick.acme.core;

public class Chefe  extends Funcionario{
    private float salarioBase;
    private float adicionalFuncao;
    private float benefiioTerno;

    public Chefe(String nome, int numFunc, float salarioBase, float adicionalFuncao, float benefiioTerno) {
        super(nome, numFunc);
        this.salarioBase = salarioBase;
        this.adicionalFuncao = adicionalFuncao;
        this.benefiioTerno = benefiioTerno;
    }
    public float getBenefiioTerno() {
        return benefiioTerno;
    }

    public void setBenefiioTerno(float benefiioTerno) {
        this.benefiioTerno = benefiioTerno;
    }

    public float getAdicionalFuncao() {
        return adicionalFuncao;
    }

    public void setAdicionalFuncao(float adicionalFuncao) {
        this.adicionalFuncao = adicionalFuncao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }


    @Override
    public float calcularSalario() {
        return this.salarioBase+ this.salarioBase * this.adicionalFuncao/100 + this.benefiioTerno;
    }
}
