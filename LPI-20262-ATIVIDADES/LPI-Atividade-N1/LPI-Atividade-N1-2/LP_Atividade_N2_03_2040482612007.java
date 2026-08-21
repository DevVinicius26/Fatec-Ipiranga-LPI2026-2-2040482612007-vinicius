//do-while é adequado porque O enunciado diz que o PIN obrigatoriamente precisa ser solicitado pelo menos uma vez, e só depois verificamos se devemos repetir.
import java.util.Scanner;
public class LP_Atividade_N2_03_2040482612007 {
public static final int PIN_CORRETO = 1234; // classe constante, não pode ser alterada
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinDigitado;
        int tentativas = 0;
        do {
            System.out.print("Informe o PIN de acesso: ");
            pinDigitado = sc.nextInt();
            tentativas++;
            if (pinDigitado != PIN_CORRETO) {
                System.out.println("PIN incorreto. Tente novamente.");
            }
        } while (pinDigitado != PIN_CORRETO);
        System.out.println("Acesso concedido! Você utilizou " + tentativas + " tentativa(s).");
        sc.close();
    }
}
