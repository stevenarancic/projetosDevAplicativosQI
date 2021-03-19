public class Produto {
    private String nome;
    private double valor;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularDesconto() {
        double desconto = this.valor * 0.025;
        double valorFinal = this.valor - desconto;
        
        return valorFinal;
    }

    @Override
    public String toString() {
        return "\nNome do produto: " + this.nome
                + "\nValor do produto: " + this.valor
                + "\nValor final do produto: " + calcularDesconto();
    }
}