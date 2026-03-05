package HPI.GerenciadorDeBiblioteca;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + "| Revista: " + getTitulo() +
                " - Edição: " + edicao);
    }
}
