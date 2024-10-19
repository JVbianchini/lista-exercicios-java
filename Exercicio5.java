import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da nota
        System.out.print("Digite a nota (0 a 100): ");
        double nota = scanner.nextDouble();

        // Determinar o conceito
        String conceito;
        if (nota > 90) {
            conceito = "A";
        } else if (nota > 80) {
            conceito = "B";
        } else if (nota > 70) {
            conceito = "C";
        } else if (nota > 60) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // Exibição do conceito
        System.out.println("O conceito é: " + conceito);

        scanner.close();
    }
}
