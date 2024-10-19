import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Exibição dos resultados
        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + palavra.length() + " dígitos");
        System.out.println("A primeira letra é: " + palavra.charAt(0));

        // Letra central
        int posicaoCentral = palavra.length() / 2;
        System.out.println("A letra central da palavra é: " + palavra.charAt(posicaoCentral));

        // Última letra
        System.out.println("A última letra é: " + palavra.charAt(palavra.length() - 1));

        // Palavra ao contrário
        StringBuilder palavraInvertida = new StringBuilder(palavra).reverse();
        System.out.println("A palavra escrita ao contrário é: " + palavraInvertida);

        // Em maiúsculas e minúsculas
        System.out.println("A palavra toda em maiúsculo: " + palavra.toUpperCase());
        System.out.println("A palavra toda em minúsculo: " + palavra.toLowerCase());

        scanner.close();
    }
}
