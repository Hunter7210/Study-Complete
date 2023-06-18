package AtivFinal_Java;

import javax.swing.JOptionPane;

public abstract class Conta {
    // Atributos
    String saldo;
    String numeroConta;

    // métodos
    // construtor
    public Conta(String saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public Conta() {
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    // metodos adicionais
    // saldo
    public void saldo(double value) {
        saldo += value;
    }

    // Saque
    public void saque(double value) {
        if (Integer.parseInt(saldo) == 0) {
            JOptionPane.showMessageDialog(null, "NÃO HÁ SALDO SUFICIENTE" + "\n" + "SALDO= " + saldo);
            JOptionPane.showMessageDialog(null, "POR FAVOR INSIRA OUTRO VALOR");

            if (Integer.parseInt(saldo) > 0) {
                int valorsacar = 0;
                valorsacar = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE O VALOR A SACAR: "));

                if (valorsacar > 0) {
                    JOptionPane.showMessageDialog(null, "NÃO HÁ SALDO SUFICIENTE");

                } else if (valorsacar <= Integer.parseInt(saldo)) {
                    int valorfim = Integer.parseInt(saldo) - valorsacar;
                    JOptionPane.showMessageDialog(null, "SAQUE DE R$" + valorfim + " REALIZADO COM SUCESSO");
                    JOptionPane.showMessageDialog(null, "RETIRE O DINHEIRO ABAIXO");
                }
            }
        }
    }

    // Deposito
    public void deposito() {
        int valorDepos;
        valorDepos = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE O VALOR A DEPOSITAR: "));
        if (valorDepos > 0) {
            valorDepos += Integer.parseInt(saldo);
            JOptionPane.showMessageDialog(null, "DEPÓSITO DE R$" + valorDepos + " REALIZADO COM SUCESSO");
            JOptionPane.showMessageDialog(null, "SEU SALDO ATUAL É R$" + saldo);
            JOptionPane.showMessageDialog(null, "OBRIGADO, VOLTE SEMPRE");
        }
    }

    // emprestimo
    public void emprestimo() {
        int valorEmp;

        JOptionPane.showInputDialog(null, "REGRAS PARA O EMPRÉSTIMO" + "\n"
                + "- O VALOR DO EMPRÉSTIMO DEVE SER NO MIN METADE DO SEU SALDO ATUAL");

        valorEmp = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE O VALOR DESEJADO DO EMPRÉSTIMO: "));
        if (valorEmp >= (Integer.parseInt(saldo) / 2)) {
            valorEmp += Integer.parseInt(saldo);
            JOptionPane.showMessageDialog(null, "EMPRÉSTIMO DE R$" + valorEmp + " APROVADO");
        } else {
            JOptionPane.showMessageDialog(null, "EMPRÉSTIMO DE R$" + valorEmp + " FOI REJEITADO");
            JOptionPane.showMessageDialog(null, "DIGITE UM VALOR DE ACORDO COM AS REGRAS.");
        }
    }

    // sair da conta
    public void sair() {
        JOptionPane.showMessageDialog(null, "VOLTE SEMPRE!");
        /* ligado =false */ // tem q colocar no outro lá
    }

}
