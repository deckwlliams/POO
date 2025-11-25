import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<Produto>();

    lista.add(new Produto(1,2000 , "computador", 4));
        lista.add(new Produto(2, 20, "mouse", 10));
        lista.add(new Produto(3, 100, "teclado", 12));
        lista.add(new Produto(4, 400, "impressora", 8));

        lista.stream().filter(p -> p.getPreco()<= 100)
                .forEach(System.out::println);
        int estoque = 0;
        estoque = lista.stream().map(p -> p.getQtde()).reduce(0,(a, b) -> a + b);
        System.out.println("Estoque = " + estoque);
        double patrimonio;
                patrimonio = lista.stream().map(p -> p.getQtde() * p.getPreco())
                        .reduce(0.0, (a, b) -> a + b);
                System.out.println("Patrimonio = " + patrimonio);
    }
}