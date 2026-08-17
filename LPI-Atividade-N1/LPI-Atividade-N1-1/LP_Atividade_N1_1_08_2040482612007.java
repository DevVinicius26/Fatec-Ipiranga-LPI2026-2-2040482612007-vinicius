import java.util.Locale;
import java.util.Scanner;

public class LP_Atividade_N1_1_08_2040482612007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = Double.parseDouble(scanner.nextLine());

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = Integer.parseInt(scanner.nextLine());

        // Após a conversão, os cálculos financeiros são feitos somente em centavos.
        long valorTotalCentavos = Math.round(valorTotalReais * 100.0);
        long valorParcelaCentavos = valorTotalCentavos / numeroParcelas;
        double valorParcelaExibicao = valorParcelaCentavos / 100.0;

        /*
         * Vantagem: trabalhar com inteiros evita erros binários de ponto flutuante e é simples.
         * Desvantagem: exige controle manual de escala e não é tão flexível quanto BigDecimal.
         */
        System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + valorTotalCentavos + " centavos.");
        System.out.printf(Locale.US,
                "Divisão de R$%.2f por %d em centavos: %d centavos por parcela.%n",
                valorTotalReais, numeroParcelas, valorParcelaCentavos);
        System.out.printf(Locale.US, "Valor convertido para exibição: R$ %.2f%n", valorParcelaExibicao);

        scanner.close();
    }
}
