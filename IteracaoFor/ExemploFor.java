package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exem1() {
        for(int i=0;0<10;i++){
            System.out.println("O n° da Interação é "+i);
        }
    }
    public void exem2() {
        int vetor[]=new int[10];
        for(int i=0; i<vetor.length;i++){            //.lenght é o tamanho, ou seja, vetor.lenght = tamanho do meu vetor;
            System.out.println("Digite o valor do vetor["+i+"]");
            vetor[i]=sc.nextInt();
        }    
    }
}
