package IteracaoFor;

import java.util.Scanner;


public class ExerciciosFor {
    Scanner sc=new Scanner(System.in);
    public void exercicio4() {
        
        int vetor[]=new int[10];

        for(int i=0;0<10;i++){
            System.out.println("Digite o caracter do vetor["+i+"]");
            String caracter = sc.nextLine();
            
            if(caracter != "a") {
                System.out.println("Consoantes utilizadas");
            
            }

        }
        
    }
}
