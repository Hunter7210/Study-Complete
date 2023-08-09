package Colecoes;

import java.util.HashMap;

import javax.print.DocFlavor.STRING;

public class ExemploHashMap {
    HashMap<String, String> capEstado = new HashMap<>(); // FORMATO PARA DECLARAÇÃO

    HashMap<String, Integer> nomeEstad = new HashMap<>();

    public void test() {

        /* incluindo elementos na lista (chave/valor) */
        capEstado.put("SP", "SÃO PAULO"); // put é usado para preencher, funciona como um .add
        capEstado.put("RJ", "RIO DE JANEIRO");
        capEstado.put("MG", "BELO HORIZONTE");
        capEstado.put("ES", "VITÓRIA");

        // Buscando um valor pela chave
        System.out.println(capEstado.get("ES"));
        for (String i : capEstado.keySet()) { // .keyset() percorre os indices
            System.out.println(i + ": " + capEstado.get(i));

        }

    }

    public void exercicio2() {

        nomeEstad.put("Marcio", 50);
        nomeEstad.put("Marcia", 20);
        nomeEstad.put("Cristiano Ronaldo", 100);
        nomeEstad.put("Marcela", 5);
        nomeEstad.put("Marcelo", 45);
  
         

        for (String i : nomeEstad.keySet()) { // .keyset() percorre os indices
            System.out.println(i + ": " + nomeEstad.get(i)+" anos");
            System.out.println(i+ nomeEstad.get("Cristiano Ronaldo")+" TITULOS");

        }

    }

}
