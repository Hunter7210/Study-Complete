package Arraylist;

import javax.swing.JOptionPane;

public class ExemploArraylist {
    // ATRIBUTOS
    int cont = 0;

    // CRIAR UM VETOR1 COM TAMANHO CONT
    // CRIAR UM VETOR2 COM TAMANHO CONT+1
    // COPIAR UM VETOR1 PARA O VETOR2

    int v1[] = new int[cont];

    // METODOS
    public void add(int add) {
        int v2[] = new int[cont + 1];
        /* vou copiar o v1 para o v2 */
        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[i];
        }
        // Adicionei o valor do add a ultima posição do vetor2
        v2[v2.length - 1] = add;
        // Copiar o v2 para o v1;
        // redefinir o tamanho do v1
        int v1[] = new int[cont + 1];

        for (int i = 0; i < v2.length; i++) {
            v1[i] = v2[i];
        }
        cont++;

    }
    public void imprimir(){
        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i]);
        }
    }
}
