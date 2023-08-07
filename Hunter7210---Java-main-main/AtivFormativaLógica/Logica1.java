package AtivFormativaLógica;


import java.util.Random;
import java.util.Scanner;

/**
 * logica
 */
public class Logica1 {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();// Numeros aleatorios

    public void ativ1() {

        System.out.println("Por favor digite o numnero de colunas desejadas: ");
        int col = sc.nextInt();
        System.out.println("Por favor digite o numnero de Linhas desejadas: ");
        int row = sc.nextInt();

        int tab[][] = new int[col][row];

        // MATRIZ NORMAL
        // preencher a matriz
        for (int i = 0; i < col; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            for (int j = 0; j < row; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                // System.out.println("tab["+i+"]["+j+"]=");
                tab[i][j] = rd.nextInt(9); // preencher o valor na posição
            }
        }
        // Imprimindo no Formato de matriz
        for (int i = 0; i < col; i++) { // qunatida de elemntos que tenho na primeira dimensao da matriz
            // laço vai percorrer a 1° dimensão(camada) da matriz
            System.out.print("| ");
            for (int j = 0; j < row; j++) { // EXECUTA SEMPRE DE DENTRO PRA FORA
                // laço preencher a 2° dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("=====================");

        // MATRIZ Substituida
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                tab[i][j] = rd.nextInt(9);
                if (i > j) {
                    tab[i][j] = 1;
                } else if (i == j) {
                    tab[i][j] = 0;
                } else if (j > i) {
                    tab[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < col; i++) {
            System.out.print("| ");
            for (int j = 0; j < row; j++) {
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println("|");
        }

    }

    public void ativ2() {
        int aleatorio = rd.nextInt(1000)+1;
        int cont = 0;
        int resp;
        boolean tentativas = true;
        while (tentativas) {
    
            System.out.println("Por favor faça seu palpite: ");
            resp = sc.nextInt();
            cont++;
            if (resp == aleatorio) {
                System.out.println("!Você acertou!");
                tentativas = false;
            } else if (resp > aleatorio) {
                System.out.println("Seu palpite precisa ser menor");
            } else if (resp < aleatorio) {
                System.out.println("Seu palpite precisa ser maior");
            }   
        }
        System.out.println(cont);
    }

    public void ativ3() {
        int vetor[] = new int[rd.nextInt(900) + 100];
        /* int nTentativas[] = new int[aleatorio]; */

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 0) {
                System.out.println("Numeros pares no vetor ["+(i+1)+"]: " +vetor[i]);
                System.out.println();
                
            }            
            if (vetor[i]%2 != 0) {
                System.out.println("Numeros impares no vetor ["+(i+1)+"]: " +vetor[i]);
                System.out.println();
                
            }            
        }
        

    }
}