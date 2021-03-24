import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        double materialRadioativo;
        int tempo = 0;

        System.out.print("Digite a massa inicial do material radioativo: ");
        materialRadioativo = ler.nextDouble();

        do {
            materialRadioativo/=2;
            tempo++;
        } while (materialRadioativo>0.5);

        double segundos = tempo*50;
        double minutos = segundos/60;
        double horas = minutos/60; 

        System.out.print("Massa: " + materialRadioativo 
                        +"\nTempo: "
                        +"\nSegundos: " + segundos
                        +"\nMinutos: " + minutos
                        +"\nHoras:" + horas);
    }
}
