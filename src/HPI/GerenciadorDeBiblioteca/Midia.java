package HPI.GerenciadorDeBiblioteca;

public class Midia {
    private String titulo;
    private int ano;

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String gerarCodigo() {
        String tresPrimeiros = titulo.substring(0, 3);
        return "LIB-" + tresPrimeiros + ano;
    }
}
