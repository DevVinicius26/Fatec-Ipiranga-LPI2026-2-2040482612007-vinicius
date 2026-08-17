import java.util.Scanner;

public class LP_Atividade_N1_1_01_2040482612007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // byte: 8 bits, de -128 a 127.
        System.out.print("Idade do Aluno: ");
        byte idade = scanner.nextByte();

        // short: 16 bits, de -32.768 a 32.767.
        System.out.print("Número de Faltas: ");
        short faltas = scanner.nextShort();

        // int: 32 bits, de -2.147.483.648 a 2.147.483.647.
        System.out.print("Matrícula ID: ");
        int matriculaId = scanner.nextInt();

        // long: 64 bits, de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.
        System.out.print("Código Nacional do Estudante: ");
        long codigoNacional = scanner.nextLong();

        // float: 32 bits, aproximadamente ±1,4E-45 a ±3,4E38.
        System.out.print("Nota do Trabalho: ");
        float notaTrabalho = scanner.nextFloat();

        // double: 64 bits, aproximadamente ±4,9E-324 a ±1,8E308.
        System.out.print("Nota da Prova Final: ");
        double notaProvaFinal = scanner.nextDouble();

        // char: 16 bits, de '\u0000' (0) a '\uffff' (65.535).
        System.out.print("Conceito Final do Aluno: ");
        char conceitoFinal = scanner.next().charAt(0);

        // boolean: representa apenas os valores true ou false.
        System.out.print("Aluno está Aprovado (true/false): ");
        boolean aprovado = scanner.nextBoolean();

        System.out.println("--- Dados do Aluno Fictício ---");
        System.out.println("Idade do Aluno: " + idade + " anos");
        System.out.println("Número de Faltas: " + faltas);
        System.out.println("Matrícula ID: " + matriculaId);
        System.out.println("Código Nacional do Estudante: " + codigoNacional);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova Final: " + notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " + conceitoFinal);
        System.out.println("Aluno está Aprovado? " + aprovado);

        scanner.close();
    }
}
