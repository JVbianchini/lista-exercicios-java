import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é: Par");
        } else {
            System.out.println("O número é: Ímpar");
        }

        // Positivo ou negativo
        if (numero >= 0) {
            System.out.println("O número é: Positivo");
        } else {
            System.out.println("O número é: Negativo");
        }

        // Verificar se é primo
        boolean isPrimo = true;
        if (numero <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }
        System.out.println("O número é primo: " + (isPrimo ? "Sim" : "Não"));

        // Raiz quadrada
        System.out.println("A raiz quadrada do número é: " + Math.sqrt(numero));

        // Número elevado ao cubo
        System.out.println("O número elevado a 3 é: " + Math.pow(numero, 3));

        scanner.close();
    }
}
