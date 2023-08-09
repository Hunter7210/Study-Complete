package Colecoes;

import java.util.LinkedList;

public class ExemploLinkedList {
    LinkedList <String> pessoas =new LinkedList<>();

    public void test() {
        //adiciona normalmente
        pessoas.add("Pedro");
        pessoas.add("Maria");
        pessoas.add("João");

        System.out.println(pessoas);
        //.addFirst adiciona o item na primeira posição, .addLast adiciona o item na ultima posição
        pessoas.addFirst("Cecília"); 

       //remove o ultimo nome
       pessoas.removeLast();

       //Imprime a lista
       System.out.println(pessoas); 
    }
}
