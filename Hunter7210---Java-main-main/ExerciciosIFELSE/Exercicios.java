package ExerciciosIFELSE;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        System.out.println("Informe o primeiro valor");
        int valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O 1° Valor(" + valor1 + ") é maior");
        } else {
            System.out.println("O 2° Valor(" + valor2 + ") é maior");
        }
    }

    public void Exercicio2() {
        System.out.println("Informe seu ano de nascimento: ");
        int dNascimento = sc.nextInt();
        if (dNascimento <= 2006) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Pode votar");
        }

    }

    public void Exercicios3() {
        System.out.println("Digite sua senha: ");
        int senhaD = sc.nextInt();
        if (senhaD == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    public void Exercicio4() {
        System.out.println("Digite a quantidade de maçãs compradas: ");
        int quantMaca = sc.nextInt();
        double precoMaca;
        if (quantMaca >= 12) {
            precoMaca = 0.3;
        } else {
            precoMaca = 0.25;
        }
        double precoFinal = quantMaca * precoMaca;
        System.out.println("Maças compradas:" + quantMaca);
        System.out.println("Valor total da compra:" + precoFinal);
    }

    public void Exercicio5() {
        System.out.println("Digite um valor inteiro: ");
        int valorP = sc.nextInt();
        System.out.println("Digite outro valor inteiro: ");
        int valorS = sc.nextInt();
        System.out.println("Digite outro valor inteiro: ");
        int valorT = sc.nextInt();
        /* int compP; */
        if (valorP > valorS) {
            /* compP = valorP; */
        } else if (valorP > valorT) {
        }
    }
}
