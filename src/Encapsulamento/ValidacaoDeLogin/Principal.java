package Encapsulamento.ValidacaoDeLogin;

import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario aluno = new Usuario("aluno2025", "escola@123");
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.print("Digite o seu usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a sua senha: ");
            String senha = scanner.nextLine();

            if (aluno.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
        scanner.close();
    }
}
