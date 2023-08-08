package TratamentoDeExceções;

import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        boolean tenteNovamente = true;
        String senha;
        String name;
        String datanasc;

        while (tenteNovamente) {
            try {
                name = JOptionPane.showInputDialog(null, "Informe um nome");
                senha = JOptionPane.showInputDialog(null, "Informe uma senha");
                datanasc = JOptionPane.showInputDialog(null, "Informe sua data de nascimento(dd/mm/aaaa): ");

                datanasc = datanasc.replace("/", "");
                JOptionPane.showMessageDialog(null, datanasc);

                if (senha.length() < 8) {
                    throw new Exception("Senha menor q 8 caracteres");
                }
                else if (name.equals(senha)) {
                    throw new Exception("Valores iguais, por favor tente novamente");
                }else if (datanasc.equals(senha)){
                    throw new Exception("Valores1 iguais, por favor tente novamente");
                }

                JOptionPane.showMessageDialog(null, "Cadastro com sucesso", "senha", 0);
                tenteNovamente = false;

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage(), "senha", 0);
            }
        }
    }
}
