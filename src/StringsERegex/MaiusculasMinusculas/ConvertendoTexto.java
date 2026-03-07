package StringsERegex.MaiusculasMinusculas;

import java.util.Scanner;

public class ConvertendoTexto {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        String textoMaiusculas = texto.toUpperCase();
        String textoMinusculas = texto.toLowerCase();

        System.out.println("Texto em maiúsculas: " + textoMaiusculas);
        System.out.println("Texto em minúsculas: " + textoMinusculas);
    }
}
