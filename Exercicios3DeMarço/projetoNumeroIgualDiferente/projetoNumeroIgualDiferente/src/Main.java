import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double valor1, valor2;

        System.out.print("Digite um valor: ");
        valor1 = ler.nextDouble();

        System.out.print("Digite outro valor: ");
        valor2 = ler.nextDouble();

        if (valor1==valor2) {
            System.out.print("Os valores são iguais!");
        } else {
            System.out.print("Os valores são diferentes!");
        }
    }
}
