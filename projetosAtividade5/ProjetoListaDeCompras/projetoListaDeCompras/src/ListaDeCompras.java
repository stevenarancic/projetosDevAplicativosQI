import java.util.ArrayList;

public class ListaDeCompras {
    ArrayList <String> produtos = new ArrayList<>();

    public String limparListaDeCompras(){
        produtos.clear();
        return "limpo!";
    }

    public String consultarItensCadastrados(){
        if (produtos.size() > 0) {
            return "Itens cadastrados: " + produtos.toString();
        } 
        return "Nenhum item foi cadastrado!";
    }
}