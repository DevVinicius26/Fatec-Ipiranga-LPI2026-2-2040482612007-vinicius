import java.math.BigDecimal;
import java.util.Scanner;

public class LP_Atividade_N1_1_10_2040482612007 {
    private static String formatarNumero(double valor) {
        return BigDecimal.valueOf(valor).stripTrailingZeros().toPlainString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor A: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o valor B: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o valor C: ");
        double c = scanner.nextDouble();

        System.out.print("Informe o valor D: ");
        double d = scanner.nextDouble();

        System.out.print("Informe a média do aluno: ");
        double media = scanner.nextDouble();

        System.out.print("Informe o percentual de presença: ");
        double presenca = scanner.nextDouble();

        // Quatro operadores: +, *, - e -. A multiplicação ocorre antes de soma/subtrações.
        double resultadoSemParenteses = a + b * c - d - b;
        double resultadoComParenteses = a + (b * c) - d - b;

        boolean aprovadoDireto = (media >= 6) && (presenca >= 75);

        System.out.println("--- Demonstração de Precedência Aritmética ---");
        System.out.println("Resultado Sem parênteses: " + resultadoSemParenteses);
        System.out.println("Resultado Com parênteses explícitos: " + resultadoComParenteses);
        System.out.println("Nota: Ambos dão o mesmo resultado pela precedência natural (*, /");
        System.out.println("depois +), mas a segunda forma é mais legível.");
        System.out.println("--- Validação do Critério de Aprovação ---");
        System.out.println("Entrada -> Média: " + formatarNumero(media)
                + " | Presença: " + formatarNumero(presenca) + "%");
        System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);

        scanner.close();
    }
}
