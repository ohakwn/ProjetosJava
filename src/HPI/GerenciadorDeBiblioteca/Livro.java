package HPI.GerenciadorDeBiblioteca;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + "| Livro: " + getTitulo() +
                " - Autor: " + autor);
    }
}
