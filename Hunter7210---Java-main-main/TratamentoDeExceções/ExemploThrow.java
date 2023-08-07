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

                datanasc = datanasc.replace("/", ""); //REPLACE(RENOVE) REMOVE AS BARRAS DO TEXTO;

                if (senha.length() < 8) {
                    throw new Exception("Senha menor q 8 caracteres");
                
                }
                else if (name.equals(senha)) {
                    throw new Exception("NOME = SENHA");

                }else if (datanasc.equals(senha)){
                    throw new Exception("SENHA == DATA DE NASCIMENTO");
                }
                else if (senha.contains("123") || senha.contains("abc") ){
                    throw new Exception("SENHA FRACA");
                }


               // if (!senha.contains([a-z]) && !senha.contains([A-Z]) ) { //DA O ERRO,PORQUE FALTA PORO VETOR ETC. // ! É uma negação, ele muda o sentido, Ex: quero procurar algo que não contain;  //CONTAINS PODE ATE PARECER IGUAL AO EQUALS, POREM O EQUALS PEGA TUDO E COMPARA EX: GATO == GATO; MAS O CONTAINS PEGA PARTES EX: 12/02/2000 CONTAINS(12) == TRUE; 
    

                JOptionPane.showMessageDialog(null, "Cadastro com sucesso", "senha", 0);
                tenteNovamente = false;

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage(), "senha", 0);
            }
        }
    }
}
