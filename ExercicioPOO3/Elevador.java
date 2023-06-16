package ExercicioPOO3;

import javax.swing.JOptionPane;

public class Elevador {
    // construir o elevador
    // atributos do elevador

    int nMaxAndares;
    int nMaxPessoas;
    int andarAtual;
    int capacidadeAtual;

    // construtor
    public Elevador(int nMaxAndares, int nMaxPessoas) {
        this.nMaxAndares = nMaxAndares; // numero fixo
        this.nMaxPessoas = nMaxPessoas;
    }

    // contruir os metodos
    // set and gets
    public int getAndarAtual() {
        return andarAtual; // numero variavel
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    // metodos adicionais
    // iniciar
    public void iniciar() {
        capacidadeAtual = 0;
        andarAtual = 0;
    }

    // entrar
    public void entrar(int pessoas) {
        if ((capacidadeAtual + pessoas) >= nMaxPessoas) {
            System.out.println("Capacidade max atingida");
            System.out.println("Pessoas para fora" + (capacidadeAtual + pessoas - nMaxPessoas));
        } else {
            capacidadeAtual += pessoas;
        }
    }

    // sair
    public void sair(int pessoas) {
        if (pessoas < capacidadeAtual) {
            capacidadeAtual -= pessoas;
        } else {
            /*
             * System.out.println("Informe um numero valido, Quantidade atual: "
             * +capacidadeAtual );
             */
            JOptionPane.showConfirmDialog(null, "Informe um n° válido, quantidade atual" + capacidadeAtual);
        }
    }

    // SUBIR
    public void subir(int nAndares) {
        if (nAndares + andarAtual > nMaxAndares) {
            /* System.out.println("Não pode subir"); */
            /* System.out.println("Andar atual " + andarAtual); */
            JOptionPane.showMessageDialog(null, "Não pode subir");
            JOptionPane.showMessageDialog(null, "Andar atual " + andarAtual);
        } else {
            andarAtual += nAndares;
        }
    }

    public void descer(int nAndares) {
        if (nAndares < andarAtual) {
            andarAtual -= nAndares;
        } else {
            JOptionPane.showMessageDialog(null, "informe um n° válido, Andar atual: " + andarAtual);
        }
    }

    /*
     * DAVA PARA SER FEITO COM WHILE
     * while (pessoas>capacidadeAtual) {
     * 
     * }
     */

}
