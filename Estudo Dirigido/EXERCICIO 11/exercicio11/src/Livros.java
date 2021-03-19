public class Livros {
    public int codigo;
    int quantidade;
    double preco;
    String descricao;

    String livro1() {
        this.codigo = 1;
        this.descricao = "Livro 1";
        this.preco = 10;

        return "Código: " + codigo + ", Descrição: " + this.descricao + ", Preço: " + this.preco;
    }

    String livro2() {
        this.codigo = 2;
        this.descricao = "Livro 2";
        this.preco = 20;

        return "Código: " + codigo + ", Descrição: " + this.descricao + ", Preço: " + this.preco;
    }

    String livro3() {
        this.codigo = 3;
        this.descricao = "Livro 3";
        this.preco = 30;

        return "Código: " + codigo + ", Descrição: " + this.descricao + ", Preço: " + this.preco;
    }
}