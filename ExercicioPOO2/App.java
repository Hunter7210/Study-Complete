package ExercicioPOO2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // criar um vetor de objetos com 10 valores
        Agenda contatos[] = new Agenda[2];
        // criar os objetos e preencher os valores
        for (int i = 0; i < contatos.length; i++) {

            // construir o objeto
            contatos[i] = new Agenda();
            // preencher

            System.out.println("Nome: ");
            contatos[i].setNome(sc.next());
            System.out.println("idade: ");
            contatos[i].setIdade(sc.next());
            System.out.println("telefone: ");
            contatos[i].setTelefone(sc.next());
        }

        // pesquisar a minha lista de contatos
        int cont = 0; // contador
        String nomeBuscado;
        System.out.println("Digite um nome para buscar");

        nomeBuscado = sc.next();
        boolean naoEncontrei = true;
        while (naoEncontrei) {
            if (nomeBuscado.equals(contatos[cont].getNome())) {
                naoEncontrei = false;

                System.out.println("IDADE: " + contatos[cont].getIdade());
                System.out.println("Telefone: " + contatos[cont].getTelefone());

            }
            cont++;

        }

        /*
         * PRIMEIRA FORMA
         * while (!nomeBuscado.equals(contatos[cont].getNome())) { //while é melhor para
         * repetir ate encontrar
         * }
         */

    }
}
