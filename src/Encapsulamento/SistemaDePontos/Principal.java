package Encapsulamento.SistemaDePontos;

public class Principal {
    static void main(String[] args) {
        Aluno aluno = new Aluno("Fernanda");

        aluno.ganharPontos(120);
        aluno.exibirStatus();
    }
}
