import java.util.Scanner;

public class LP_Atividade_N1_1_09_2040482612007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota final do aluno: ");
        double notaFinal = scanner.nextDouble();

        String situacaoIfElse;
        if (notaFinal >= 6) {
            situacaoIfElse = "Aprovado";
        } else {
            situacaoIfElse = "Reprovado";
        }

        String situacaoTernario = notaFinal >= 6 ? "Aprovado" : "Reprovado";

        /*
         * Exemplo de ternário encadeado:
         * String situacao = notaFinal >= 6 ? "Aprovado" : notaFinal >= 4 ? "Exame" : "Reprovado";
         * Deve ser evitado porque reduz a legibilidade e dificulta a manutenção do código.
         */
        System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
        System.out.println("Situação (if-else): " + situacaoIfElse);
        System.out.println("--- Abordagem 2: Operador Ternário Simples ---");
        System.out.println("Situação (Ternário): " + situacaoTernario);

        scanner.close();
    }
}
