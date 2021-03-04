import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double valor1, valor2;

        System.out.print("Digite um valor: ");
        valor1 = ler.nextDouble();

        System.out.print("Digite outro valor: ");
        valor2 = ler.nextDouble();

        if (valor1>valor2) {
            System.out.print("O primeiro valor é maior!");
        } else if(valor1==valor2){
            System.out.print("Os dois valores são iguais!");
        } else {
            System.out.print("O segundo valor é maior!");
        }
    }
}
