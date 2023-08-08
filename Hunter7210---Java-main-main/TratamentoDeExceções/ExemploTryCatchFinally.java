package TratamentoDeExceções;

import javax.swing.JOptionPane;

public class ExemploTryCatchFinally {

    public static void main(String[] args) {
        // Teste try catch finally
        String fraseinicial = null;
        String frasefinal = null;
        try {

            fraseinicial = JOptionPane.showInputDialog(null, "Digite uma frase: ");

            if (fraseinicial.equals("")) {
                fraseinicial = null;
            }

            frasefinal = fraseinicial.toUpperCase();

        } catch (Exception e) {
            frasefinal = "Não foi digitado uma frase";

        } finally {

            JOptionPane.showMessageDialog(null, frasefinal);
        }

    }

}
