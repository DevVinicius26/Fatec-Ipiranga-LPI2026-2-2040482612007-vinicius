
// O while é adequado porque a quantidade de repetições é desconhecida antes do início do laço
import java.util.Scanner;

public class LP_Atividade_N2_02_2040482612007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da venda (ou 0 para encerrar): ");
        double valorVenda = sc.nextDouble();

        double valorTotalVendido = 0;
        int quantidadeVendas = 0;

        while (valorVenda != 0) {
            // processa a venda
            valorTotalVendido += valorVenda;
            quantidadeVendas++;
            // depois lê a próxima venda
            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = sc.nextDouble();
        }

        if (quantidadeVendas > 0) {
            double mediaVenda = valorTotalVendido / quantidadeVendas;

            System.out.printf("Total vendido no turno: R$ %.2f%n", valorTotalVendido);
            System.out.println("Quantidade de vendas: " + quantidadeVendas);
            System.out.printf("Valor médio por venda: R$ %.2f%n", mediaVenda);
        } else {
            System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
        }

        sc.close();
    }
}