package projetoCliente;
import java.lang.String;

public class Cliente {
    private String nome;
    private byte idade;
    private double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String classificarIdade(){
        if (idade>17) {
            return "maior de idade!";
        }
        return "menor de idade!";
    }
    
    public String classificarRenda(){
        if (renda>14999) {
            return "rico!";
        }
        return "não é rico!";
    }
}
