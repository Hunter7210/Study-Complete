package Matrizes;

import java.util.Random;
import java.util.Scanner;

public class MatrizesExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(); // Numeros aleatorios

    public void exemplo1() {
        // Exemplo de criação/preenchimento/impressão de matriz
        // declara a minha matriz de 2 dimensões
        int tab[][] = new int[10][9]; // 10 e 9 são o tamanho do meu espaço(vetor), ainda para preencher

        // preencher a matriz
        for (int i = 0; i < 10; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            for (int j = 0; j < 9; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                // System.out.println("tab["+i+"]["+j+"]=");
                tab[i][j] = rd.nextInt(1, 9); // preencher o valor na posição

            }
        }
        // Imprimir a minha matriz
        for (int i = 0; i < 10; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            for (int j = 0; j < 9; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                System.out.println("tab[" + i + "][" + j + "]=" + tab[i][j]);

            }
        }
        // Imprimindo no Fomrato de matriz
        for (int i = 0; i < 10; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            System.out.print("| ");
            for (int j = 0; j < 9; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println("|");
        }

    }

    public void exemplo2() {

        int tab[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tab[i][j] = 0;
                if (i == j) {
                    tab[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("tab[" + i + "][" + j + "]=" + tab[i][j]);
            }
        }
        for (int i = 0; i < 5; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            System.out.print("| ");
            for (int j = 0; j < 5; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exemplo3() {

        int tab[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tab[j][i] = rd.nextInt(1, 9);

            }
        }

        for (int i = 0; i < 4; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            System.out.print("| ");
            for (int j = 0; j < 4; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                System.out.print(+tab[i][j] + " ");

            }
            System.out.println("|");
        }
        System.out.println("=============");

        for (int i = 0; i < 4; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            System.out.print("| ");
            for (int j = 0; j < 4; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                System.out.print(+tab[j][i] + " ");
            }
            System.out.println("|");
        }
    }

    public void exemplo4() {

        int tab[][] = new int[5][5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tab[i][j] = rd.nextInt(5);
                if (i == j) {
                    soma += tab[i][j];
                }
            }
        }
        for (int i = 0; i < 5; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            System.out.print("| ");
            for (int j = 0; j < 5; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("Resultado =" + soma);
    }

    public void exemplo5() {

        int tab[][] = new int[5][5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tab[i][j] = rd.nextInt(2);
                if (i > j) {
                    soma += tab[i][j];
                }
            }
        }
        for (int i = 0; i < 5; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            System.out.print("| ");
            for (int j = 0; j < 5; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("Resultado =" + soma);
    }

    public void exemplo6() {

        int tab[][] = new int[5][5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tab[i][j] = rd.nextInt(5);
                if (i < j) {
                    soma += tab[i][j];
                }
            }
        }
        for (int i = 0; i < 5; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            System.out.print("| ");
            for (int j = 0; j < 5; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("Resultado =" + soma);
    }
}
