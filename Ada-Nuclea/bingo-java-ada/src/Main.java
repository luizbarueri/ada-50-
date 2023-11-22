import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] nomeJogadores = new String[] { "Ana", "Maria", "Tereza", "Mariza", "Luiz"};
        Scanner leitor = new Scanner(System.in);
        Random rnd = new Random();
        //Chama a mensagem inicial
        textoInicial();
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();
        System.out.println("Entre com a quantidade de Jogadores:");
        int linhas = leitor.nextInt();
        int colunas = 5;
        int[][] bingo = new int[linhas][colunas];
        int[] tabelaSorteados = new int[60];
        int numeroJogadorGanhador = 0;
        String numerosSorteados = "";
        String cartela = "";
        //===================================================================================
        //Cria tabela de numeros para sorteio de 1 a 60.
        for (int x = 0; x < 60; x++) {
            tabelaSorteados[x] = x + 1;
        }

        // Imprimir o array embaralhado
        //System.out.println("Array aleatório: " + Arrays.toString(tabelaSorteados));
        System.out.println("Tabelas de Jogadores:");
        System.out.println("=================================================================");
        //===================================================================================
        int numero = 0;
        boolean deuBingo = false;
        while (opcao == 1 && linhas > 0) {
           // System.out.println();
            //Pega um numero sorteado do indice de 1 a 60
            //Gerar cartelas com 5 numeros ppara cada jogador sem repetição!
            int contador = 0;
            boolean existe = false;
            for (int l = 0; l < linhas; l++) {
                while (contador < 5) {
                    int indiceAleatorio = rnd.nextInt(60) + 1;

                    for (int x = 0; x < 5; x++) {
                        if (bingo[l][x] == indiceAleatorio) existe = true;
                    }
                    if (existe == false) {
                        bingo[l][contador] = indiceAleatorio;
                        //System.out.print(bingo[l][contador] + ",");
                        contador++;
                    }
                    existe = false;
                }
                System.out.println();
                contador = 0;
            }
            //imprimi cartelas
            for (int x = 0; x < linhas; x++) {
                for (int y = 0; y < 5; y++) {
                    cartela += bingo[x][y] + ",";
                }
                System.out.println("Jogador " + (x + 1) + " - " +  cartela);
                cartela = "";
            }

            //------------------------------------------------------------------------------------
            //Embaralha Array para numeros sorteados.
            for (int i = 0; i < 60; i++) {
                // Gerar um índice aleatório para trocar com o índice atual
                int indiceAleatorio = rnd.nextInt(60);
                // Trocar os elementos nos índices i e indiceAleatorio
                int temp = tabelaSorteados[i];
                tabelaSorteados[i] = tabelaSorteados[indiceAleatorio];
                tabelaSorteados[indiceAleatorio] = temp;
            }
            //------------------------------------------------------------------------------------
            numero = 0;
            deuBingo = false;
            numerosSorteados = "";
            while (deuBingo == false) {
                int numeroSorteado = tabelaSorteados[numero];
                numero++;
                numerosSorteados += numeroSorteado + ",";

                for (int l = 0; l < linhas; l++) {
                    for (int c = 0; c < 5; c++) {
                        if (bingo[l][c] == numeroSorteado)  bingo[l][c] = 0;
                    }
                }
                //verifica se tem 5 zeros na cartela do jogador
                int contaZero = 0;
                for(int v = 0; v < linhas; v++) {
                    contaZero = 0;
                    for (int k = 0; k < 5; k++) {
                        if(bingo[v][k] == 0) contaZero++;
                        if (contaZero == 5) {
                            deuBingo = true;
                            numeroJogadorGanhador = v;
                        }
                    }
                }
            }
            System.out.println("=================================================================");
            System.out.println("                  BIIIGOOOOOOOOOOOOO !!!                         ");
            System.out.println("=================================================================");
            System.out.println("Números sorteados:");
            System.out.println(numerosSorteados);
            System.out.println("=================================================================");
            System.out.println("Vencedor: Jogador - " + (numeroJogadorGanhador + 1));
            System.out.println("Cartela do ganhador: " + Arrays.toString(bingo[numeroJogadorGanhador]));
            System.out.println("=================================================================");
            System.out.println("Deseja jogar Novamente, Digite - [1] ou Digite - [0] para Sair.: ");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                System.out.println("Entre com a quantidade de Jogadores:");
                linhas = leitor.nextInt();
                if (linhas <= 0)  opcao = 0;
            }
        }
    }

    //-----------------------------------------------------------------------------------
    //FUNCAO
    public static void textoInicial() {
        System.out.println("=================================================================");
        System.out.println("=================== BINGO JAVA ADA ==============================");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("     Digite - [1] para Jogar, Dgite - [0] para Sair");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("=================================================================");
    }
    //===================================================================================

}