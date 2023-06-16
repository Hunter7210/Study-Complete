import java.util.Random;
import java.util.Scanner;

public class IteracaoWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        
        System.out.println("Por favor escolha uma numero");
        int nEscolhido = sc.nextInt();
        int i =0; //VARIAVEL i é muito comum de ser usada, 
        
        while (i<300){
            
            System.out.println("o n° da Iteração é "+i);
            i+=1; // É possivel usar tambem i++, sempre vai adicionar +1; Ou tambem pode ser usado i--, Para sempre diminuir 1.
        
            if (i==nEscolhido){
                System.out.println("Seu numero é "+i);
                i=300;

            }
        }
    }
    public void exemplo2() {
        int vetor[]=new int[10];
        int i =0;

        while (i<10) {
            System.out.println("Informe o valor do índice "+i+"do vetor");
            vetor[i]=sc.nextInt();
            i++;
        }
        //IMPRIMIR DO MENOR PARA O MAIOR
        /*
        i=0;
        while (i<10){
            System.out.println("O vetor["+i+"]="+vetor[i]);
            i++;
            */
            //IMPRIMIR DO MAIOR PARA O MENOR
        while (i>0){
            i--;
            System.out.println("O vetor["+i+"]="+vetor[i]);
            
        }

    }
    public void exemplo3() {
        //WHILE QUANDO EU NÃO DETERMINO O VALOR FINAL.
        Random rd = new Random();  //Função RANDOM serve para randomizar, ou seja, sortear aleatoriamento.

        int valorSorteado = rd.nextInt(5); //ELE VAI SORTEAR COM UM RANGE DE 10, OU SEJA, VAI SORTEAR UM NUMERO INTEIRO DE 0 ATÉ 9
        Boolean tenteNovamente = true; 
        while (tenteNovamente){
            System.out.println("    DIGITE UM NUMERO    ");
            int nDigitado = sc.nextInt();

            if (nDigitado==valorSorteado) {
                System.out.println("    ACERTOU!!!     ");
                tenteNovamente=false;
            }
            else{
                System.out.println("    ERROU!!!     ");
            }
        }
    }
    
}