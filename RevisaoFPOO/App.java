package RevisaoFPOO;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int escolha;

        boolean ligado = true;

        Gato gato1[] = new Gato[2];
        Cachorro cachorro1[] = new Cachorro[2];
        Outros outros1[] = new Outros[2];

        while (ligado) {

            JOptionPane.showMessageDialog(null, "1- GATO\n 2- CACHORRO\n"+"3- OUTRO");
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));
           

            if (escolha == 1) {

                gato1[cont].setNome(JOptionPane.showInputDialog("Digite o nome:"));
                gato1[cont].setCor(JOptionPane.showInputDialog("Digite a cor:"));
                gato1[cont].setEspecie(JOptionPane.showInputDialog("Digite a especie: "));
                /* gato1[cont].setGenero(JOptionPane.showInputDialog("Digite o genero:")); */
                gato1[cont].setPeso(JOptionPane.showInputDialog("Digite o peso:"));
                gato1[cont].setPorte(JOptionPane.showInputDialog("Digite o porte:"));
                gato1[cont].setPropietario(JOptionPane.showInputDialog("Digite o propietário: "));
                gato1[cont].setTemperamento(JOptionPane.showInputDialog("Digite o temperamento: "));

                JOptionPane.showMessageDialog(null,
                        "NOME" + gato1[cont].getNome() + "\n" + "COR:" + gato1[cont].getCor() + "\n"
                                + "ESPECIE:" + gato1[cont].getEspecie() + "\n" + "PESO" + gato1[cont].getPeso() + "\n"
                                + "PROPIETÁRIO:" + gato1[cont].getPropietario() + "\n" + "PORTE: "
                                + gato1[cont].getPorte()+"\n"+ "GENERO: "+ gato1[cont].getGenero() +"\n"+"TEMPERAMENTO:"+gato1[cont].getTemperamento());
            }

            if (escolha == 2) {

                cachorro1[cont].setNome(JOptionPane.showInputDialog("Digite o nome:"));
                cachorro1[cont].setCor(JOptionPane.showInputDialog("Digite a cor:"));
                cachorro1[cont].setEspecie(JOptionPane.showInputDialog("Digite a especie: "));
                cachorro1[cont].setGenero(JOptionPane.showInputDialog("Digite o genero:"));
                cachorro1[cont].setPeso(JOptionPane.showInputDialog("Digite o peso:"));
                gato1[cont].setPorte(JOptionPane.showInputDialog("Digite o porte:"));
                cachorro1[cont].setPropietario(JOptionPane.showInputDialog("Digite o propietário: "));
                cachorro1[cont].setCaramelo(JOptionPane.showInputDialog("É caramelo?(s/n): "));

                JOptionPane.showMessageDialog(null,
                        "NOME" + cachorro1[cont].getNome() + "\n" + "COR:" + cachorro1[cont].getCor() + "\n"
                                + "ESPECIE:" + cachorro1[cont].getEspecie() + "\n" + "PESO" + cachorro1[cont].getPeso() + "\n"
                                + "PROPIETÁRIO:" + cachorro1[cont].getPropietario() + "\n" + "PORTE: "
                                + cachorro1[cont].getPorte()+"\n"+ "GENERO: "+ cachorro1[cont].getGenero() +"\n"+"CARAMELO:"+cachorro1[cont].getCaramelo());
            }
            if (escolha == 3) {

                outros1[cont].setNome(JOptionPane.showInputDialog("Digite o nome:"));
                outros1[cont].setCor(JOptionPane.showInputDialog("Digite a cor:"));
                outros1[cont].setEspecie(JOptionPane.showInputDialog("Digite a especie: "));
                outros1[cont].setGenero(JOptionPane.showInputDialog("Digite o genero:"));
                outros1[cont].setPeso(JOptionPane.showInputDialog("Digite o peso:"));
                outros1[cont].setPropietario(JOptionPane.showInputDialog("Digite o propietário: "));
                outros1[cont].setPorte(JOptionPane.showInputDialog("Qual porte?: "));
                outros1[cont].setHabitat(JOptionPane.showInputDialog("Digite o habitat:"));

                JOptionPane.showMessageDialog(null,
                        "NOME" + outros1[cont].getNome() + "\n" + "COR:" + outros1[cont].getCor() + "\n"
                                + "ESPECIE:" + outros1[cont].getEspecie() + "\n" + "PESO" + outros1[cont].getPeso() + "\n"
                                + "PROPIETÁRIO:" + outros1[cont].getPropietario() + "\n" + "PORTE: "
                                + outros1[cont].getPorte()+"\n"+ "GENERO: "+ outros1[cont].getGenero() +"\n"+"HABITAT:"+ outros1[cont].getHabitat());
            }
            cont++;
            ligado = false;

        }
    }

}
