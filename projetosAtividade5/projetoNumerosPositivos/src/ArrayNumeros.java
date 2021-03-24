import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double valores[] = new double [2];

        for(int i = 0; i<2; i++){
            System.out.print("Digite um número positivo: ");
            valores[i] = ler.nextDouble();
        }
        
        double soma, divisao;

        soma = valores[0] + valores[1];
        divisao = soma / 2;

        System.out.print
            (" \nValores digitados: " + Arrays.toString(valores)
            + "\nSoma dos números digitados: " + soma
            + "\nQuantidade de números digitados: " + valores.length
            + "\nMédia dos 2 valores: " + divisao);
    }
}

