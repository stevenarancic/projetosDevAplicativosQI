package projetoCliente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente objetoCliente = new Cliente();
        
        System.out.print("Digite o nome do cliente: ");
        objetoCliente.setNome(ler.next());
        
        System.out.print("Digite a idade do cliente: ");
        objetoCliente.setIdade(ler.nextByte());
        
        System.out.print("Digite a renda do cliente: ");
        objetoCliente.setRenda(ler.nextDouble());
        
        System.out.println(objetoCliente.classificarIdade());
        System.out.println(objetoCliente.classificarRenda());
    }
    
}
