package projetoAula6;

public class Cliente {
    private String nome, genero;
    private float idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "\nDados do cliente: \n" 
                + "\nNome: " + nome 
                + "\nGênero: " + genero
                + "\nIdade: " + idade;
    }
    
}
