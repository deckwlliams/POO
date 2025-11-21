package br.com.drick.acme.userInterface;

import br.com.derick.acme.core.*;

public class MainClass {
    public static void main(String[] args) {
        Funcionario folha[] = new Funcionario[8];
        folha[0] = new Chefe("Caio",01, 10000,2500, 122);
        folha[1] = new Comissionado("jonas", 02, 2344, 22);
        folha[2] = new Comissionado("joana", 02, 33234, 22);
        folha[3] = new Horista("joana", 03, 34, 22);
        folha[4] = new Emprenteiro("Derick", 04, 23);
        folha[5] = new Comissionado("Bolsani", 02, 2344, 22);
        folha[6] = new Comissionado("Paganini", 02, 2344, 22);
        folha[7] = new Comissionado("Clarck", 02, 2344, 22);

        for (int i = 0; i < folha.length; i++) {
            System.out.println(folha[i]);
        }    }
}
