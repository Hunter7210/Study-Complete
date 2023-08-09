package Colecoes;

import java.util.*; //IMPORTAR DESTE JEITO IMPORTA A BIBLIOTECA INTEIRA, DO JEITO ABAIXO VAI IMPORTANDO UM POR U;M
/* import java.util.ArrayList;
import java.util.Collections; */

public class ExemploArrayList {

    ArrayList<String> carros = new ArrayList<>();

    Random rd = new Random();

    ArrayList<Integer> inteiros = new ArrayList<>();

    public void test() {
        // ADICIONANDO ELEMENTOS
        carros.add("Fusca");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Monza");
        carros.add("Monza");

        System.out.println(carros);

        // Ordenando a lista(.sort(Collections))
        Collections.sort(carros); // ordena em ordem alfabética
        System.out.println(carros);

        Collections.reverse(carros); // ordena em ordem reversa.
        System.out.println(carros);

        /* Percorrer a lista com for */
        for (int i = 0; i < carros.size(); i++) { // size mede/percorre o tamanho do arraylist
            System.out.println(carros.get(i)); // get pega o valor que esta na posição i

        }
        /*
         * É possivel percorrer com for-each; ele percorre os vetores, é mais dinamico e
         * mais simples
         */
        for (String s : carros) { // FAZ A MESMA COISA QUE O DE CIMA , DIFERENCÇA É QUE N PRECISA DE CONTADOR E
            System.out.println(s);
        }
        // RETORNA EM STRING, O DE CIMA É EM INT

        // APAGAR OS ELEMENTOS DO ARRAYLIST
        carros.clear();
        System.out.println(carros);

        /* OS ELEMENTOS DO ARRAYLIST SÃO NA VERDADE OBJ */
    }

    public void exercicio1() {

        inteiros.add(rd.nextInt(0, 1000));
        inteiros.add(rd.nextInt(0, 1000));
        inteiros.add(rd.nextInt(0, 1000));
        inteiros.add(rd.nextInt(0, 1000));
        inteiros.add(rd.nextInt(0, 1000));

        System.out.println(inteiros);

        Collections.sort(inteiros);
        System.out.println(inteiros);

        Collections.reverse(inteiros);
        System.out.println(inteiros);
    }
    //EXITE TAMBEM O LINKEDLIST

    //Diferença dele para o Arraylist: ele armazena seus itens em containers, ele não recria os vetores, ele adiciona mais containers
    //POSSUI FUNCIONALIDADES A MAIS QUE O ARRAYLIST: 
    //QUANDO USAR:  planejamento de produção , controle logistico

    //TAMBEM EXITE HASHMAP
    // Entra com pares de valores


    
}
