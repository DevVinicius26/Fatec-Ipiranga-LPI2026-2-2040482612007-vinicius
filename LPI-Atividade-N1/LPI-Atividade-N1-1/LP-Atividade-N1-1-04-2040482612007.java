import java.util.Scanner;

public class LP_Atividade_N1_1_04_2040482612007 {
    public static final String NOME_INSTITUICAO = "FATEC Ipiranga";
    public static final int PRAZO_MAXIMO_EMPRESTIMO = 14;

    public static int calcularDiasDevolucao(final int diasEmprestimo) {
        // Limita o empréstimo ao prazo máximo institucional.
        return Math.min(diasEmprestimo, PRAZO_MAXIMO_EMPRESTIMO);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de dias do empréstimo: ");
        final int diasEmprestimo = scanner.nextInt();
        final int diasCalculados = calcularDiasDevolucao(diasEmprestimo);

        // diasEmprestimo = 20; // Erro de compilação: variável final não pode ser reatribuída.

        System.out.println("Instituição: " + NOME_INSTITUICAO);
        System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO_EMPRESTIMO + " dias.");
        System.out.println("Dias calculados para devolução: " + diasCalculados);

        scanner.close();
    }
}
