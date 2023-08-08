import java.util.Scanner;

public class ExercicosFor {
    Scanner sc = new Scanner(System.in);

    public void exerc1() {

    }

    public void exerc2() {
        double vetor[] = new double[10];
        for (int i = 0; i < vetor.length; i++) {

            System.out.println("vetor[" + (i + 1) + "]=");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor[" + (i + 1) + "]=" + vetor[i]);
        }
    }
    public void exerc3() {
        
        double notas[]=new double[4]; //Vetor para notas
        //Preencher as notas do vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota "+(i+1)+" do aluno: ");
            notas[i]=sc.nextDouble();
        }
        
        double media=0; //Variavel para calcular a media
        //calcular a media e imprimir as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota "+(i+1)+"= "+notas[i]);
            media+=notas[i]; //Acumulando o valor das notas na variavel media    
        }
        media/=notas.length;//Dividir média pelo n° de notas do vetor
        System.out.println("A media do aluno é "+media);
    }
    public void exerc4() {

        String caracter[]=new String[10];
        /* String letras[]=new String[]{"a","b","c","d","e","f","g","h","i","j"}; */
        
        int cont =0;
        int vogal=0; 
        for (int i = 0; i < caracter.length; i++) {
            System.out.println("Digite um caracter:" +i);
            caracter[i]=sc.next(); 

            if (caracter[i]=="a"|| caracter[i]=="e" ||caracter[i]=="i"|| caracter[i]=="o" ||caracter[i]=="u") {
                vogal++;
                System.out.println(caracter[i]+"é volgal");
            }
            else{
                cont++;
            System.out.println(caracter[i]+" é consoante");
            }
        }
        System.out.println("O numero de consoantes é "+cont);
        System.out.println("O numero de consoantes é "+vogal);



        /* for (int i = 0; i < caracter.length; i++) {
            System.out.println("Digite um caracter:" +i);
            caracter[i]=sc.next(); 
        
        if ( caracter[i] == "a") {
            System.out.println("dfdsfssdfsd");
        }
        }
         */
    }
    public void exerc4a() {
        System.out.println("Digite uma palavra: ");
        String palavra =sc.next();
        palavra = palavra.toLowerCase();//SERVE  PARA DEIXAR TUDO MINUSCULO
        int cont=0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i); //Char é um caracter; CharAt é para ler cada caracter separadamente 
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
            }
            else
            {
                cont++;
            System.out.println(c+ " é consoante");
            }
        }
        System.out.println("O n° de Consoantes é "+cont);
    }  
    public void exerc5Gambiarra() {
        //Exercicios impar
        int vetorNumeros[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int vetorNPar[]=new int[20];
        int vetorNImpar[]=new int[20];

        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i]%2==0) {
                vetorNPar[i]= vetorNumeros[i];
            } 
            else 
            {
                vetorNImpar[i]= vetorNumeros[i];
            }
        }
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Vetor["+i+"]="+vetorNumeros[i]);
            System.out.println("Vetor Par["+i+"]="+vetorNPar[i]);
            System.out.println("VetorImpar["+i+"]="+vetorNImpar[i]);
        
        }
    }
    public void exerc5CertoContador() { //CONTADOR É MUITO IMPORTANTE;
        //Exercicio 5 com contador
        int vetorNumeros[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int contImpar=0;
        int contPar=0;
        //  Contando quantos nuemros pares e quantos numeros impares
       for (int i = 0; i < vetorNumeros.length; i++) {
                if(vetorNumeros[i]%2==0){
                    contPar++;
                }else
                {
                    contImpar++;
                }
        }
        //Criando os vetores com o tamanho correto
        int vetorPar[]=new int[contPar];
        int vetorImpar[]=new int[contImpar];
        //Distribuindo os valores nos vetores
        contImpar=0; //Zerar o contador
        contPar=0;//Zerar o contador
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i]%2==0) {
                vetorPar[contPar]=vetorNumeros[i];
                contPar++; //Conta o numero de itrens par
            }
            else{
                vetorImpar[contImpar]=vetorNumeros[i];
                contImpar++; //Conta o numero de itrens impar
            }
        }
        //imprimir os vetores
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Vetor["+i+"]="+vetorNumeros[i]);
        }
        
        for (int i = 0; i < vetorImpar.length; i++) {
            System.out.println("VetorImpar["+i+"]="+vetorImpar[i]);
        }
        
        for (int i = 0; i < vetorPar.length; i++) {
            System.out.println("VetorPar["+i+"]="+ vetorPar[i]);
        }
    
    }
    public void exerc6() {
        //Conceito de Matriz
        //Laço dentro de laço

        double alunos[]= new double[10]; //Vetor media do alunos
        double notas[]= new double[4]; //Vetor media do alunos
        int cont=0;
        
        //laço para receber as medias do aluno
        for (int i = 0; i < alunos.length; i++) {
            //Laço para receber as notas
            for(int j = 0; j< notas.length;j++){
                System.out.println("Digite a nota "+(j+1)+" do aluno "+(i+1)+":"); //SEMPRE EXECUTA O LAÇO DE DENTRO PRIMEIRO.
                notas[j]=sc.nextDouble();
                alunos[i]+=notas[j]; //Acumula as notas do aluno 1
            }
            alunos[i]/=notas.length;

            if(alunos[i]>=7){
                cont++;
            }

        }
        //IMPRIMIR AS MEDIAS
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(" A media do aluno é "+(i+1)+" é "+alunos[i]);
        }
        //IMPRIMIR O CONTATOR
        System.out.println("O n° de alunos com nota >=7 é "+ cont);


    }
}
