import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Livros objLivros = new Livros();
        Carrinho objCarrinho = new Carrinho();
        
        byte opcao;

        do {
            System.out.print("VENDA DE LIVROS"
                + "\n1 - Adicionar livros ao carrinho"
                + "\n2 - Consultar carrinho"
                + "\n3 - Limpar Carrinho"
                + "\n4 - Finalizar compra"
                + "\n5 - Encerrar programa"
                + "\nSelecione a opção desejada: ");

                opcao = ler.nextByte();

                switch (opcao) {
                    case 1:
                        System.out.print("\nEscolha dentre os itens disponíveis: "
                            + "\n1 - Livro 1"
                            + "\n2 - Livro 2"
                            + "\n3 - Livro 3"
                            + "\nSelecione a opção desejada: ");
                            opcao = ler.nextByte();

                            switch (opcao) {
                                case 1:
                                    objCarrinho.listaDeLivros.add(objLivros.livro1());
                                    objCarrinho.valorCarrinho.add(objLivros.preco);

                                    System.out.println("\nLivro adicionado ao carrinho com sucesso!\n");
                                    break;

                                case 2:
                                    objCarrinho.listaDeLivros.add(objLivros.livro2());
                                    objCarrinho.valorCarrinho.add(objLivros.preco);

                                    System.out.println("\nLivro adicionado ao carrinho com sucesso!\n");
                                    break;
                            
                                case 3:
                                    objCarrinho.listaDeLivros.add(objLivros.livro3());
                                    objCarrinho.valorCarrinho.add(objLivros.preco);
                                    
                                    System.out.println("\nLivro adicionado ao carrinho com sucesso!\n");
                                    break;
                                default:
                                    break;
                            }
                        break;

                    case 2:
                        if (objCarrinho.listaDeLivros.isEmpty()) {
                            System.out.print("\nSeu carrinho está vazio!\n\n");
                        } else {
                            System.out.println("\n" + objCarrinho.toString() + "\n"
                                + "\nValor total: " + objCarrinho.valorFinal() + "\n");
                        }
                        break;

                    case 3:
                        if (objCarrinho.listaDeLivros.isEmpty()) {
                            System.out.print("\nSeu carrinho já está vazio, não há nada para tirar daqui!\n\n");
                        } else {
                            objCarrinho.listaDeLivros.clear();
                            objCarrinho.valorCarrinho.clear();
                            System.out.print("\nCarrinho limpo!\n");
                        }
                        break;

                    case 4:
                        if (objCarrinho.listaDeLivros.isEmpty()) {
                            System.out.print("\nNenhum livro foi adicionado ao carrinho! \n\n");
                        } else {
                            System.out.print("\n" + objCarrinho.toString()
                                            + "\nValor total: " + objCarrinho.valorFinal() + "\n\n");

                            System.out.print("Confirmar compra?"
                            +"\n1 - Sim"
                            +"\n2 - Não"
                            +"\nSelecione a opção desejada: ");

                            opcao = ler.nextByte();

                            switch (opcao) {
                                case 1:
                                    opcao = 6;
                                    System.out.print("\nCompra confirmada, sistema encerrado!\n");
                                    break;

                                case 2:
                                    System.out.print("\nCerto, voltando ao menu principal!\n");
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;

                    case 5:
                        System.out.println("\nSistema encerrado");
                        break;
                
                    default:
                        break;
                }
        } while (opcao!=5);
    }
}
