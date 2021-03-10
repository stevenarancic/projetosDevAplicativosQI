package projetoAula6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente objetoCliente = new Cliente();
        Livro objetoLivro = new Livro();
        Scanner ler = new Scanner(System.in);
        
        byte opcao;

        do {
            System.out.print("---SISTEMA DE LIVRARIA---\n"
                + "\nO que deseja cadastar?: \n"
                + "\n1 - Cliente\n"
                + "2 - Livro\n"
                + "\n"
                + "Digite a opção desejada: ");
        opcao = ler.nextByte();
        
        switch(opcao){
            case 1:
                System.out.print("\n---CADASTRO DE CLIENTE---\n");

                    System.out.print("\nDigite o nome do cliente: ");
                    objetoCliente.setNome(ler.next());
                    
                    System.out.print("Digite a idade do cliente: ");
                    objetoCliente.setIdade(ler.nextFloat());
                    
                    do {
                        System.out.print("\nSelecione o gênero do cliente: \n"
                        + "\n1 - Masculino\n"
                        + "2 - Feminino\n"
                        + "\nDigite a opção desejada: ");
                
                        opcao = ler.nextByte();

                        switch(opcao) {
                            case 1:
                                objetoCliente.setGenero("Masculino");
                                break;
                            case 2:
                                objetoCliente.setGenero("Feminino");
                                break;
                            default:
                                System.out.println("\nDigite apenas dentre as opções listadas!");
                        }
                    } while (opcao>2 || opcao<1);
                    
                    System.out.print(objetoCliente.toString() + "\n\nCliente cadastrado com sucesso!");
                break;
            case 2:
                System.out.print("\n---CADASTRO DE LIVRO---\n");

                    System.out.print("\nDigite o título do livro: ");
                            objetoLivro.setTitulo(ler.next());
                    
                    do {
                        System.out.print("\nSelecione o gênero do livro: \n"
                            + "\n1 - Terror\n"
                            + "2 - Suspense\n"
                            + "3 - Comédia\n"
                            + "\nDigite a opção desejada: ");

                            opcao = ler.nextByte();

                            switch (opcao) {
                                case 1:
                                    objetoLivro.setGenero("Terror");
                                    break;
                            
                                case 2:
                                    objetoLivro.setGenero("Suspense");
                                    break;

                                case 3:
                                    objetoLivro.setGenero("Comédia");
                                    break;

                                default:
                                    System.out.print("\nDigite somente dentre as opções listadas!\n");
                            }

                    } while (opcao>3 || opcao<1);
                    
                    System.out.print("\nDigite o preço do livro: ");
                    objetoLivro.setPreco(ler.nextDouble());

                    do {
                        System.out.print("\nO livro será comprado ou alugado? obs: livro alugado tem 50% de desconto.\n"
                        +"\n1 - Alugado\n"
                        +"2 - Comprado\n"
                        +"\nDigite a opção desejada: ");

                        opcao = ler.nextByte();

                        switch (opcao) {
                            case 1:
                                objetoLivro.setVerificarAquisicao("Alugado");

                                System.out.print(objetoLivro.verificarLocacao());
                                break;
                            
                            case 2:
                                objetoLivro.setVerificarAquisicao("Comprado");
                                System.out.print(objetoLivro.verificarLocacao());
                                break;
                        
                            default:
                                System.out.print("\nDigite somente dentre as opções listadas!\n");
                        }

                    } while (opcao>2 || opcao<1);
                    
                System.out.print(objetoLivro.toString() + "\n\nLivro cadastrado com sucesso!");
                break;
            default:
                System.out.println("\nDigite apenas dentre as opções listadas!\n");
        }
        } while (opcao>2 || opcao<1);
    }
}
