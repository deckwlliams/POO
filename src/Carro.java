public class Carro {
    //caracteristicas de carro
    String marca;
    String modelo;
    int ano;
    String cor;
    int km;
    double preco;

// criar um botao para que posso executar algo

void exibirAnuncio(){
    System.out.println("Anuncio do carro: ");
    System.out.println(marca + "-" + modelo + "("+ano+")");
    System.out.println(cor + " KM:" + km + " R$" + preco);

}
}
