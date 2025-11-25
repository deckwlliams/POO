package br.com.derick.contaEspecial.usrinterface;

import br.com.derick.contaEspecial.core.Conta;
import br.com.derick.contaEspecial.core.ContaEspecial;

public class Banco {
    public static void main(String[] args) {

        Conta c  = new Conta(4334, "987654321", "Derick", 500);
    System.out.println(c);
        ContaEspecial e = new ContaEspecial(3422,"33232","Carlos", 100, 10000);
        System.out.println(e);

        if(e.debitar(3000)){
            System.out.println("Debitado com sucesso");
        }
        else {
        System.out.println("Saldo insufuciente");
        }
        System.out.println(e);
    }
}
