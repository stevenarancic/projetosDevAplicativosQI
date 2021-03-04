import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.print("Digite um valor: ");
        valor = ler.nextInt();
        
        int resultado = valor%2;

        if (resultado == 0) {
            System.out.print("O número é par!");
        } else {
            System.out.print("O número é ímpar!");
        }
    }
}
