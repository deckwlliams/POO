public class Main {
    public static void main(String[] args) {
        try {
            Produto p = new Produto();
            p.setId(0);
            p.setDescricao("Arroz");

            System.out.println(p);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
