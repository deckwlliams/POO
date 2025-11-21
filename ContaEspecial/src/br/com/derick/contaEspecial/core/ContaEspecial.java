package br.com.derick.contaEspecial.core;

public class ContaEspecial extends Conta {
private double limite;


    public ContaEspecial(int numeroConta, String CPF, String nomeTitular, double saldo, double limite) {
        super(numeroConta, CPF, nomeTitular, saldo);
        this.limite = limite;
    }
    public String toString() {
        return super.numeroConta + " " + super.CPF + " " + super.nomeTitular +  "R$ " + super.saldo;
    }
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;

        }
        @Override
    public  boolean debitar(double valor) {
        if (super.saldo >= valor) {
            super.saldo -= valor;
            return true;
        }
        return false;
    }
}



