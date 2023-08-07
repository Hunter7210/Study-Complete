package Operadores;

import java.util.Scanner;

public class NotaFrequencia 
{
    Scanner sc = new Scanner(System.in); // Criação de objeto, para utilizar o scanner
    public void calcular() //Criação de metodo 
    {
        System.out.println("Informe a nota 1 do aluno: ");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do aluno: ");
        int nota2 = sc.nextInt();
        //Operação aritimética
        double media = (nota1+nota2)/2; //Ou poderia ser feito com: media = nota1; media += nota2; media/=2; 
        System.out.println("A media do aluno é "+media);
        boolean mediaAprovada =  media>=50; 
        System.out.println("O aluno esta aprovado por nota?" +mediaAprovada);
        System.out.println("Informe a frequência do aluno:");
        int frequência = sc.nextInt();
        boolean frequênciaAprovada = frequência>=75;
        System.out.println("O aluno esta aprovado por frequencia?" +frequênciaAprovada);
        System.out.println("===================true = Aprovado; False = Reprovado==================="); 
        Boolean AprovadoCurso = (mediaAprovada==true)&&(frequênciaAprovada==true);
        System.out.println("O aluno está aprovado no curso?"+AprovadoCurso);
    }
}
