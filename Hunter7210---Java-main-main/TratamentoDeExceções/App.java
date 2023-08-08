package TratamentoDeExceções;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        boolean ativo = true;

        while (ativo) {

            try {
                int n1;
                int n2;
                int resultado;
                int escolha;

                n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro:"));
                
                    escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma operação\n 1- Adição\n 2- Subtração\n 3- Multiplicação\n 4- Divisão"));           
               /*  catch (){
                    JOptionPane.showMessageDialog(null, "DIGITE UM VALOR NO MENU");
                } */
                n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro numero inteiro:"));
                if (escolha == 1) {
                    resultado = n1 + n2;
                    
                    JOptionPane.showMessageDialog(null, n1 + "+" + n2 + "= " + resultado);

                    ativo = false;
                }

                else if (escolha == 2) {
                    resultado = n1 - n2;

                    JOptionPane.showMessageDialog(null, n1 + "-" + n2 + "= " + resultado);

                    ativo = false;
                }

                else if (escolha == 3) {
                    resultado = n1 / n2;
                    if (n2 == 0) {
                        throw new Exception("NÃO DA PRA FAZER DIVISÃO POR 0");
                    }
                    JOptionPane.showMessageDialog(null, n1 + "/" + n2 + "= " + resultado);

                    ativo = false;
                }
                else if (escolha == 4) {
                    resultado = n1 * n2;
                    JOptionPane.showMessageDialog(null, n1 + "*" + n2 + "= " + resultado);

                    ativo = false;
                }
            } catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(null,"ERRO - Valor digitado nao  é um numero inteiro!");
    
            }
            catch (ArithmeticException e2){
                JOptionPane.showMessageDialog(null,"ERRO - Valor digitado nao e um numero inteiro!");
            }
            catch (Exception e3) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, "ERRO: " + e3.getMessage());

            } finally {
                JOptionPane.showMessageDialog(null, "Bloco finally");
            }
        }
    }

}
