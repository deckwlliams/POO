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
        c1.preco = 2000;

        c2.marca = "Chevrolt";
        c2.modelo = "Corsa";
        c2.cor = "Vermelho";
        c2.ano = 2020;
        c2.km = 0;
        c2.preco = 2000;
        
        c1.exibirAnuncio();
        c2.exibirAnuncio();

//        System.out.println("Carro:");
//        System.out.println(c1.marca + "-" + c1.modelo + "("+c1.ano+")");
//        System.out.println(c1.cor + " KM:" + c1.km + " R$" + c1.preco);
    }
}
