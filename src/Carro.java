public class Carro {
    //caracteristicas de carro
   private  String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int km;
    private double preco;


// criar um botao para que posso executar algo

void exibirAnuncio(){
    System.out.println("Anuncio do carro: ");
    System.out.println(marca + "-" + modelo + "("+ano+")");
    System.out.println(cor + " KM:" + km + " R$" + preco);

}
void simularSeguro(int perfil){
    if (perfil == 0){
        System.out.println("Perfil: idoso -1.5%");
        System.out.println("R$" + preco * 0.015);
    }
    else if (perfil == 1){
        System.out.println("Perfil: Chefe de familia - 2.5%");
        System.out.println("R$" + preco * 0.025);
    }
    else if (perfil == 2){
        System.out.println("Perfil: Jovem - 14%");
        System.out.println("R$" + preco * 0.14);
    }
    else {
        System.out.println("Não temos esse perfil");
    }
 }

double calcularIPVA(){
  double valorIpva;
   if (ano<= 2002){
       valorIpva = 0;
   }else{
       valorIpva = preco * 0.035;
   }
   return valorIpva;

  }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
