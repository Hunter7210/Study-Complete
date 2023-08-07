package ExercicioPOO3;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // construir o elevador

        Elevador elevador1 = new Elevador(10, 10);
        elevador1.iniciar();
        boolean ligado = true;
        int acao;
        while (ligado) {

            JOptionPane.showConfirmDialog(null, "1- ENTRAR\n 2-SAIR\n 3-SUBIR\n 4-DESCER\n 5-DESLIGAR");

            acao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));

            switch (acao) {
                case 1:
                    elevador1.entrar(
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Quantas pessoas")));
                    break;

                case 2:
                    elevador1.sair(
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Quantos Andares")));
                    break;

                case 3:
                    elevador1.subir(
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Quantos Andares ")));
                    break;

                case 4:
                    elevador1.descer(
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Quantos Andares")));
                    break;
                case 5:
                    ligado = false;

                default:
                    JOptionPane.showMessageDialog(null, "Informe uma ação existente");
                    break;
            }
        }
    }
}
