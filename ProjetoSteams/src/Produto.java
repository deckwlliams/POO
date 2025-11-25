public class Produto {
    private int  id;
    private double preco;



    private String descricao;
    private int qtde;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }


    public Produto(int id, double preco, String descricao, int qtde) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id = " + id +
                ", preco = " + preco +
                ", descricao = '" + descricao + '\'' +
                ", qtde = " + qtde +
                '}';
    }
    }
