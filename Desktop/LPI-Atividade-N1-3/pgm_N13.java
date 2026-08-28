import java.util.Locale;
import java.util.Scanner;

public class pgm_N13 { 
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // --- DECLARAÇÃO ---
        System.out.print("Quantidade de leituras: ");
        int quantidadeLeituras = scanner.nextInt();
        double[] leituras = new double[quantidadeLeituras];

        // Leitura dos elementos do vetor
        for (int i = 0; i < leituras.length; i++) {
            System.out.print("Temperatura (°C): ");
            leituras[i] = scanner.nextDouble();
        }

        // --- PERCURSO ---
        System.out.println("-- Leituras Registradas --");
        for (int i = 0; i < leituras.length; i++) {
            System.out.printf("Leitura [%d]: %.1f°C\n", i, leituras[i]);
        }

          // --- ACESSO DIRETO ---
        System.out.println("-- Acesso Direto --");
        System.out.printf("Primeira leitura (indice 0): %.1f°C\n", leituras[0]);
        System.out.printf("Ultima leitura (indice %d): %.1f°C\n", (leituras.length - 1), leituras[leituras.length - 1]);

        // --- BUSCA LINEAR: EXTREMOS ---
        double maiorTemperatura = leituras[0];
        int indiceMaiorTemperatura = 0;
        double menorTemperatura = leituras[0];
        int indiceMenorTemperatura = 0;

        for (int i = 1; i < leituras.length; i++) {
            if (leituras[i] > maiorTemperatura) {
                maiorTemperatura = leituras[i];
                indiceMaiorTemperatura = i;
            }
            if (leituras[i] < menorTemperatura) {
                menorTemperatura = leituras[i];
                indiceMenorTemperatura = i;
            }
        }

        System.out.println("--- Busca Linear: Extremos ---");
        System.out.printf("Maior temperatura: %.1f°C (indice %d)\n", maiorTemperatura, indiceMaiorTemperatura);
        System.out.printf("Menor temperatura: %.1f°C (indice %d)\n", menorTemperatura, indiceMenorTemperatura);

        // --- BUSCA LINEAR: ALERTA ---
        System.out.print("Temperatura critica de alerta (°C): ");
        double temperaturaCritica = scanner.nextDouble();

        System.out.println("-- Busca Linear: Alerta --");
        boolean encontrou = false;

        for (int i = 0; i < leituras.length; i++) {
            if (leituras[i] >= temperaturaCritica) {
                System.out.printf("Alerta: temperatura critica atingida na leitura de indice %d (%.1f°C).\n", i, leituras[i]);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma leitura atingiu ou ultrapassou a temperatura critica informada.");
        }

        scanner.close();
    }
}