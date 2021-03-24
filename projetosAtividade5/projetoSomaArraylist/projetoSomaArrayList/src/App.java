import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Double> numerosDigitados = new ArrayList<>();
        double somaDoArrayList = 0;
        Scanner ler = new Scanner(System.in);

        byte opcao;

        do {
            System.out.print
            ("\n---Programa de soma de valores-----"
            + "\n-----------------------------------"
            + "\n---1: Adicionar um valor-----------"
            + "\n---2: Somar valores já digitados---"
            + "\n-----------------------------------"
            + "\n---0: Fechar o programa------------"
            + "\n\n---Digite a opção desejada: ");

            opcao = ler.nextByte();
                switch (opcao) {
                    case 1:
                        System.out.print("\nDigite um valor a ser adicionado: ");
                        numerosDigitados.add(ler.nextDouble());
        
                        System.out.print("\nAdicionar mais um valor?\n"
                                        +"1 - Sim"
                                        +"\n2 - Não"
                                        +"\nDigite a opção desejada: ");
                                        opcao = ler.nextByte();
                        do {
                            switch (opcao) {
                                case 1:
                                    System.out.print("\nDigite um valor a ser adicionado: ");
                                    numerosDigitados.add(ler.nextDouble());
        
                                    System.out.print("\nAdicionar mais um valor?\n"
                                                    +"1 - Sim"
                                                    +"\n2 - Não"
                                                    +"\nDigite a opção desejada: ");
        
                                                    opcao = ler.nextByte();
                                    break;
                                default:
                                    break;
                            }
                        } while (opcao==1);
                        break;
                
                    case 2:
                        if (numerosDigitados.isEmpty()==true) {
                            System.out.print("\n\nNenhum número foi digitado, por favor, insira valores para a soma!\n\n");
                            break;
                        } else {
                            for (int i = 0; i < numerosDigitados.size(); i++) {
                                somaDoArrayList += numerosDigitados.get(i);
                            }
                            System.out.print("\nResultado da soma: " + somaDoArrayList + "\n");
                        }
                        break;
        
                    case 0:
                        System.out.print("Sistema encerrado.");
                        break;
        
                    default:
                        break;
                }
        } while (opcao!=0);
    }
}
