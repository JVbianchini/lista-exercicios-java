import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;
        double maiorNota = 0;
        double menorNota = 10;

        // Entrada das notas dos alunos
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
        }

        // Cálculo da média
        double media = soma / 5;

        // Exibição dos resultados
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A média da turma é: " + media);

        scanner.close();
    }
}
