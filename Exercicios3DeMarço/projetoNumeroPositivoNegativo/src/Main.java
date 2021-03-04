import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = ler.nextInt();

        if(numero>=0) {
            System.out.print("o número é positivo!");
        } else {
            System.out.print("o número é negativo!");
        }
    }
}
