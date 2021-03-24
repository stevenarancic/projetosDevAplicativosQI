import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        ListaDeCompras objListaDeCompras = new ListaDeCompras();

        byte opcao;

        do {

            System.out.print("-----Lista de compras-----"
                            +"\n\n - O que deseja fazer?"
                            +"\n1 - Cadastrar item na lista"
                            +"\n2 - Consultar itens cadastrados"
                            +"\n3 - Alterar itens da lista"
                            +"\n4 - Exibir o tamanho da lista"
                            +"\n5 - Remover itens da lista de compras"
                            +"\n6 - Classificar itens em ordem alfabética"
                            +"\n7 - Limpar a lista de compras"
                            +"\n0 - Fechar o programa"
                            +"\n\nSelecione a opção desejada: ");

                            opcao = ler.nextByte();

            switch (opcao) {
                case 0:
                    System.out.print("Sistema encerrado.");
                    break;

                case 1:
                    System.out.print("\nDigite o nome do produto a se inserir na lista: ");
                    objListaDeCompras.produtos.add(ler.next());
                    break;

                case 2:
                    System.out.print("\nItens cadastrados: " + objListaDeCompras.consultarItensCadastrados());
                    break;

                case 3:
                    System.out.print("Digite o novo produto: ");
                    String novoProduto = ler.next();

                    System.out.print("Digite o slot do produto que será substituido: ");
                    int slot = ler.nextInt();

                    if (slot >= 0 && slot < objListaDeCompras.produtos.size()) {
                        objListaDeCompras.produtos.set(slot, novoProduto);
                        System.out.println("O item " + objListaDeCompras.produtos.get(slot) + " substituido com sucesso !");
                    } else {
                        System.out.println("Esse indice ainda não existe ! \n"
                                + "Tente novamente !");
                    }
                    break;

                case 4:
                    System.out.print("\nTamanho da lista: " + objListaDeCompras.produtos.size());
                    break;

                case 5:
                    System.out.print("\n\nDigite o slot a ser exluido: ");
                    slot = ler.nextInt();

                    if (slot >= 0 && slot < objListaDeCompras.produtos.size()) {
                        objListaDeCompras.produtos.remove(slot);
                        System.out.println("\nO item removido com sucesso !");
                    } else {
                        System.out.println("\nEsse slot ainda não foi criado!");
                    }
                    break;

                case 6:
                    break;

                case 7:
                    objListaDeCompras.produtos.clear();
                    System.out.print("Lista limpa!");
                    break;
            
                default:
                    System.out.print("\n\nDigite somente dentre as opções disponíveis: \n\n\n");
                    break;
            }
        } while (opcao!=0);
    }    
}
