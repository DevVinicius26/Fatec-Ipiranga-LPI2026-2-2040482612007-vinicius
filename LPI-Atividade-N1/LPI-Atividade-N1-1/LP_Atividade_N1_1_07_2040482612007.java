import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LP_Atividade_N1_1_07_2040482612007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor A (ex.: 1.00): ");
        String valorA = scanner.nextLine();

        System.out.print("Informe o valor B (ex.: 0.90): ");
        String valorB = scanner.nextLine();

        System.out.print("Informe o valor total da compra: ");
        String valorCompra = scanner.nextLine();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        double aDouble = Double.parseDouble(valorA);
        double bDouble = Double.parseDouble(valorB);
        double resultadoDouble = aDouble - bDouble;

        // BigDecimal construído por String preserva exatamente o decimal informado.
        BigDecimal aBig = new BigDecimal(valorA);
        BigDecimal bBig = new BigDecimal(valorB);
        BigDecimal resultadoBig = aBig.subtract(bBig);

        BigDecimal compra = new BigDecimal(valorCompra);
        BigDecimal parcela = compra.divide(
                BigDecimal.valueOf(numeroParcelas), 2, RoundingMode.HALF_UP);

        System.out.println("--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
        System.out.println("Resultado esperado de " + valorA + " - " + valorB + " seria " + resultadoBig.toPlainString());
        System.out.println("Resultado real obtido com double: " + resultadoDouble);
        System.out.println("--- Correção exata utilizando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): " + resultadoBig.toPlainString());
        System.out.println("--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
        System.out.println("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas
                + "x: R$ " + parcela.toPlainString() + " por parcela.");

        scanner.close();
    }
}
