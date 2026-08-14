import java.util.Scanner;

public class LP_Atividade_N1_1_06_2040482612007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome de usuário: ");
        String texto = scanner.hasNextLine() ? scanner.nextLine() : null;

        // Com &&, texto.length() só é executado se texto != null for verdadeiro.
        // Se fosse usado & simples, as duas expressões seriam avaliadas e texto.length()
        // poderia lançar NullPointerException quando texto fosse null.
        if (texto != null && texto.length() > 0) {
            System.out.println("Usuário válido fornecido: " + texto);
        } else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }

        scanner.close();
    }
}
