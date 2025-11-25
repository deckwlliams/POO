package br.com.derick.contaEspecial.core;

public class Conta {
    protected int numeroConta;
    protected String CPF;
    protected  String nomeTitular;
    protected double saldo;

    public Conta(int numeroConta, String CPF, String nomeTtular, double saldo) {
        this.numeroConta = numeroConta;
        this.CPF = CPF;
        this.nomeTitular = nomeTtular;
        this.saldo = saldo;
    }
    public String toString() {
        return this.numeroConta  + " - " + this.CPF + " - " + this.nomeTitular + " - "
                + this.saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public String getNomeTtular() {
        return nomeTitular;
    }

    public void setNomeTtular(String nomeTtular) {
        this.nomeTitular = nomeTtular;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void Creditar(double valor) {
        this.saldo += valor;
    }
    public boolean debitar(double valor) {
        if( this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }





}
