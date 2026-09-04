/*-
* Disciplina: Linguagem de Programacao I
*            Prof. Verissimo
*
* Objetivo do Programa: Simulacao da sequencia de jogadas do Xeque Pastor em um
*                       tabuleiro de xadrez utilizando matriz bidimensional.
*
* Data     : 03/09/2026
* Autor    : Vinicius Coelho Bernardo
*
*/

public class XequePastor {

    // Constantes do Tabuleiro
    private static final int LINHAS = 8;
    private static final int COLUNAS = 8;
    private static final String VAZIO = "   ";
    private static final String ORIGEM = "...";

    public static void main(String[] args) {
        // Matriz bidimensional para representar o tabuleiro
        String[][] tabuleiro = new String[LINHAS][COLUNAS];

        // 1. Inicializa e exibe o estado original do tabuleiro
        inicializarTabuleiro(tabuleiro);
        exibirCabecalhoSecao("Posicao Incial do tabuleiro");
        exibirTabuleiro(tabuleiro);

        // 2. Jogada #1
        exibirCabecalhoSecao("Jogada #1");
        // Brancas jogam e4 (Peão de e2 [6,4] para e4 [4,4])
        executarMovimento(tabuleiro, 6, 4, 4, 4, "---Brancas jogam e4---");
        // Pretas jogam e5 (Peão de e7 [1,4] para e5 [3,4])
        executarMovimento(tabuleiro, 1, 4, 3, 4, "---Pretas jogam e5---");

        // 3. Jogada #2
        exibirCabecalhoSecao("Jogada #2");
        // Brancas jogam Bc4 (Bispo de f1 [7,5] para c4 [4,2])
        executarMovimento(tabuleiro, 7, 5, 4, 2, "---Brancas jogam Bc4---");
        // Pretas jogam Cc6 (Cavalo de b8 [0,1] para c6 [2,2])
        executarMovimento(tabuleiro, 0, 1, 2, 2, "---Pretas jogam Cc6---");

        // 4. Jogada #3
        exibirCabecalhoSecao("Jogada #3");
        // Brancas jogam Dh5 (Dama de d1 [7,3] para h5 [3,7])
        executarMovimento(tabuleiro, 7, 3, 3, 7, "---Brancas jogam Dh5---");
        // Pretas jogam Cf6 (Cavalo de g8 [0,6] para f6 [2,5])
        executarMovimento(tabuleiro, 0, 6, 2, 5, "---Pretas jogam Cf6---");

        // 5. Jogada #4 (Xeque Mate)
        exibirCabecalhoSecao("Jogada #4 (Xeque Mate)");
        // Brancas capturam em f7 com a Dama (h5 [3,7] para f7 [1,5])
        executarMovimento(tabuleiro, 3, 7, 1, 5, "---Brancas capturam Peao PP6 em f7 e Xeque MATE (Dxf7#)---");
    }

    /**
     * Preenche a matriz com as peças nas posições iniciais padrão.
     */
    private static void inicializarTabuleiro(String[][] tabuleiro) {
        // Linha 8: Peças pretas principais
        tabuleiro[0] = new String[]{"tP1", "cP2", "bP3", "dP4", "rP5", "bP6", "cP7", "tP8"};
        // Linha 7: Peões pretos
        tabuleiro[1] = new String[]{"PP1", "PP2", "PP3", "PP4", "PP5", "PP6", "PP7", "PP8"};

        // Linhas 6 a 3: Casas vazias
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }

        // Linha 2: Peões brancos
        tabuleiro[6] = new String[]{"PB1", "PB2", "PB3", "PB4", "PB5", "PB6", "PB7", "PB8"};
        // Linha 1: Peças brancas principais
        tabuleiro[7] = new String[]{"TB1", "CB2", "BB3", "DB4", "RB5", "BB6", "CB7", "TB8"};
    }

    /**
     * Realiza a movimentação de uma peça na matriz e imprime o tabuleiro atualizado.
     */
    private static void executarMovimento(String[][] tabuleiro, int linOrigem, int colOrigem, int linDestino, int colDestino, String mensagem) {
        String peca = tabuleiro[linOrigem][colOrigem];
        tabuleiro[linOrigem][colOrigem] = ORIGEM;
        tabuleiro[linDestino][colDestino] = peca;

        System.out.println(mensagem);
        exibirTabuleiro(tabuleiro);
    }

    /**
     * Exibe os separadores e o título da jogada no console.
     */
    private static void exibirCabecalhoSecao(String titulo) {
        System.out.println("==================================================");
        System.out.println("               " + titulo);
        System.out.println("==================================================");
    }

    /**
     * Imprime o estado atual da matriz no console com os identificadores das colunas e linhas.
     */
    private static void exibirTabuleiro(String[][] tabuleiro) {
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");
        for (int i = 0; i < LINHAS; i++) {
            int numeroLinha = LINHAS - i;
            System.out.print(numeroLinha + " ");
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}