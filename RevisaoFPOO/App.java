package RevisaoFPOO;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais; //Essse import serve para puxar a classe do outro
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.Outros;

public class App {

    public static void main(String[] args) {
        // Criação de obj
        /*
         * Animais obj1 = new Animais("pequeno", "Diogo", "Femea", "Ramister", 07.55);
         */

        // contator
        int contGatos = 0;
        int contCachorro = 0;
        int contOutros = 0;

        boolean ligado = true;

        Gato gato1[] = new Gato[5];
        Cachorro cachorro1[] = new Cachorro[5];
        Outros outros1[] = new Outros[5];
        JOptionPane.showMessageDialog(null, "1- GATO\n 2- CACHORRO\n 3- OUTRO");

        while (ligado) {

            int escolha;

            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));

            if (escolha == 1) {

                gato1[contGatos].setNome(JOptionPane.showInputDialog("Digite o nome:"));
                gato1[contGatos].setCor(JOptionPane.showInputDialog("Digite a cor:"));
                gato1[contGatos].setEspecie(JOptionPane.showInputDialog("Digite a especie: "));
                gato1[contGatos].setGenero(JOptionPane.showInputDialog("Digite o genero:"));
                gato1[contGatos].setPeso(JOptionPane.showInputDialog("Digite o peso:"));
                gato1[contGatos].setPorte(JOptionPane.showInputDialog("Digite o porte:"));
                gato1[contGatos].setPropietario(JOptionPane.showInputDialog("Digite o propietário: "));
                gato1[contGatos].setTemperamento(JOptionPane.showInputDialog("Digite o temperamento: "));

                JOptionPane.showMessageDialog(null,
                        "NOME" + gato1[contGatos].getNome() + "\n" + "COR:" + gato1[contGatos].getCor() + "\n"
                                + "ESPECIE:" + gato1[contGatos].getEspecie() + "\n" + "PESO"
                                + gato1[contGatos].getPeso() + "\n"
                                + "PROPIETÁRIO:" + gato1[contGatos].getPropietario() + "\n" + "PORTE: "
                                + gato1[contGatos].getPorte() + "\n" + "GENERO: " + gato1[contGatos].getGenero() + "\n"
                                + "TEMPERAMENTO:" + gato1[contGatos].getTemperamento());
                contGatos = +1;
            }

            else if (escolha == 2) {
                cachorro1[contCachorro].setNome(JOptionPane.showInputDialog("Digite o nome:"));
                cachorro1[contCachorro].setCor(JOptionPane.showInputDialog("Digite a cor:"));
                cachorro1[contCachorro].setEspecie(JOptionPane.showInputDialog("Digite a especie: "));
                cachorro1[contCachorro].setGenero(JOptionPane.showInputDialog("Digite o genero:"));
                cachorro1[contCachorro].setPeso(JOptionPane.showInputDialog("Digite o peso:"));
                cachorro1[contCachorro].setPorte(JOptionPane.showInputDialog("Digite o porte:"));
                cachorro1[contCachorro].setPropietario(JOptionPane.showInputDialog("Digite o propietário: "));
                cachorro1[contCachorro].setCaramelo(JOptionPane.showInputDialog("É caramelo?(s/n): "));

                JOptionPane.showMessageDialog(null,
                        "NOME" + cachorro1[contCachorro].getNome() + "\n" + "COR:" + cachorro1[contCachorro].getCor()
                                + "\n"
                                + "ESPECIE:" + cachorro1[contCachorro].getEspecie() + "\n" + "PESO"
                                + cachorro1[contCachorro].getPeso()
                                + "\n"
                                + "PROPIETÁRIO:" + cachorro1[contCachorro].getPropietario() + "\n" + "PORTE: "
                                + cachorro1[contCachorro].getPorte() + "\n" + "GENERO: "
                                + cachorro1[contCachorro].getGenero() + "\n"
                                + "CARAMELO:" + cachorro1[contCachorro].getCaramelo());
                contCachorro++;
            } else if (escolha == 3) {

                outros1[contOutros].setNome(JOptionPane.showInputDialog("Digite o nome:"));
                outros1[contOutros].setCor(JOptionPane.showInputDialog("Digite a cor:"));
                outros1[contOutros].setEspecie(JOptionPane.showInputDialog("Digite a especie: "));
                outros1[contOutros].setGenero(JOptionPane.showInputDialog("Digite o genero:"));
                outros1[contOutros].setPeso(JOptionPane.showInputDialog("Digite o peso:"));
                outros1[contOutros].setPropietario(JOptionPane.showInputDialog("Digite o propietário: "));
                outros1[contOutros].setPorte(JOptionPane.showInputDialog("Qual porte?: "));
                outros1[contOutros].setHabitat(JOptionPane.showInputDialog("Digite o habitat:"));

                JOptionPane.showMessageDialog(null,
                        "NOME" + outros1[contOutros].getNome() + "\n" + "COR:" + outros1[contOutros].getCor() + "\n"
                                + "ESPECIE:" + outros1[contOutros].getEspecie() + "\n" + "PESO"
                                + outros1[contOutros].getPeso()
                                + "\n"
                                + "PROPIETÁRIO:" + outros1[contOutros].getPropietario() + "\n" + "PORTE: "
                                + outros1[contOutros].getPorte() + "\n" + "GENERO: " + outros1[contOutros].getGenero()
                                + "\n"
                                + "HABITAT:" + outros1[contOutros].getHabitat());
            }
            else {
                JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!\n TENTE NOVAMENTE!");
            }
            contOutros++;
            ligado = false;

        }
    }

}
