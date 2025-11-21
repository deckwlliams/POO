package br.com.derick.acme.core;

public abstract class Funcionario {
    protected String nome;

    protected int numFunc;
    public Funcionario(String nome, int numFunc) {
        this.nome = nome;
        this.numFunc = numFunc;
    }
    //aqui eu defino a "Dependencia das minhas classes filhas"
    public abstract float calcularSalario();
    public int getNumFunc() {
        return numFunc;
    }

    public void setNumFunc(int numFunc) {
        this.numFunc = numFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + numFunc;
    }

}
