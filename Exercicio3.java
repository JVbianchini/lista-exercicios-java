import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor cheio e desconto
        System.out.print("Digite o valor cheio da compra: ");
        double valorCheio = scanner.nextDouble();

        System.out.print("Digite o valor do desconto (em %): ");
        double desconto = scanner.nextDouble();

        // Cálculo do novo valor
        double valorDesconto = valorCheio * (desconto / 100);
        double valorFinal = valorCheio - valorDesconto;

        // Exibição dos resultados
        System.out.println("O valor cheio é: " + valorCheio);
        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.println("O novo valor é: " + valorFinal);

        scanner.close();
    }
}
