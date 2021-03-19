import java.util.ArrayList;

public class Carrinho {
    ArrayList<Double> valorCarrinho = new ArrayList<>();
    ArrayList<String> listaDeLivros = new ArrayList<>();

    double valorFinal() {
        double valorFinal = 0;

        for (int i = 0; i < valorCarrinho.size(); i++) {
            valorFinal += valorCarrinho.get(i);
        }

        return valorFinal;
    }

    @Override
    public String toString() {
        ArrayList<String> listaTotal = new ArrayList<>();
        String lista = "";

        for(int i = 0; i < listaDeLivros.size() ; i++){
            lista = ("Livro de índice " + i + ": " + listaDeLivros.get(i) + "\n");
            listaTotal.add(lista);
    }
        return "\nDados do carrinho: \n\n" + listaTotal;
    }
}   
