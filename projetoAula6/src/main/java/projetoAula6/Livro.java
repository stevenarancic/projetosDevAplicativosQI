package projetoAula6;

public class Livro {
    private String titulo, genero;
    private String verificarAquisicao;
    private double preco, precoFinal;
    public double desconto = 0;
    
    public Livro() {
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVerificarAquisicao() {
        return verificarAquisicao;
    }

    public void setVerificarAquisicao(String verificarAquisicao) {
        this.verificarAquisicao = verificarAquisicao;
    }
    
    public String verificarLocacao() {
        if (this.verificarAquisicao=="Alugado") {
            this.desconto = this.preco/2;
            this.precoFinal = this.preco - this.desconto;
            
            return "\nO produto será locado, desconto de 50% aplicado\n";
        } 
            this.precoFinal = this.preco;
            return "\nO produto será comprado!\n";
    }
    
    @Override
    public String toString() {
        return "\nDados do livro: \n" 
                + "\nTítulo: " + titulo 
                + "\nGênero: " + genero 
                + "\nO livro será: " + verificarAquisicao
                + "\nValor final: " + precoFinal;
    }
    
}
