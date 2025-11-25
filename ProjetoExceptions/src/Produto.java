public class Produto {
    private int id;
    private String descricao;

    public Produto() {
        // Construtor padrão
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws IsExceptions  {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IsExceptions("Descrição é obrigatória!");
        }
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws IsExceptions {
        if (id <= 0) {
            throw new IsExceptions("Id inválido! O id deve ser maior que zero.");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
