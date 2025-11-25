import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista;
        lista = new ArrayList<Produto>();
        lista.add(new Produto(1000, "computador", 1));
        lista.add(new Produto(1000, "impressora", 2));
        lista.add(new Produto(1000, "estante", 3));
        lista.add(new Produto(1000, "mesa", 4));

        for(Produto produto : lista){
            System.out.println(produto);
        }
        System.out.println("---------------------");
        lista.remove(2);
for(Produto produto : lista){
    System.out.println(produto);
}
    }
}