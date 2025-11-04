public class UaiBiMotors {
    public static void main(String[] args) {
        Carro c1, c2;
        c1 = new Carro();
        c2 = new Carro();

        c1.marca = "Porse";
        c1.modelo = "Ford";
        c1.cor = "Azul";
        c1.ano = 2020;
        c1.km = 0;
        c1.preco = 50500;

        c2.marca = "Chevrolt";
        c2.modelo = "Corsa";
        c2.cor = "Vermelho";
        c2.ano = 2020;
        c2.km = 0;
        c2.preco = 23000;
        
//        c1.exibirAnuncio();
//        c2.exibirAnuncio();
        c1.simularSeguro(3);
//        System.out.println("Carro:");
//        System.out.println(c1.marca + "-" + c1.modelo + "("+c1.ano+")");
//        System.out.println(c1.cor + " KM:" + c1.km + " R$" + c1.preco);
    System.out.println("______Calculando iPVA______");
    double ipvaC1 = c1.calcularIPVA();
    double ipvaC2 = c2.calcularIPVA();
    if(ipvaC1 == 0 ) {
        System.out.println("Veiculo Isento");
    }

    else{
        System.out.println("Valor do IPVA "+ ipvaC1);
    }
        if(ipvaC2 == 0 ) {
            System.out.println("Veiculo Isento");
        }
        else{
            System.out.println("Valor do IPVA "+ ipvaC2);
        }
    }

}
