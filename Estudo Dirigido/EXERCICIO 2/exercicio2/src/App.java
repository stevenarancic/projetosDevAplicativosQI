import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Produto objProduto = new Produto();

        System.out.print("Digite o nome do produto: ");
        objProduto.setNome(ler.next());

        System.out.print("Digite o valor do produto: ");
        objProduto.setValor(ler.nextDouble());

        System.out.print(objProduto.toString());
    }
}
