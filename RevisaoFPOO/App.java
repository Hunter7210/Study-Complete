package RevisaoFPOO;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import RevisaoFPOO.Agenda.Agendamento;
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
        int cont = 0;
        /*
         * int contGatos = 0;
         * int contCachorro = 0;
         * int contOutros = 0;
         */
        boolean ligado = true;

        Gato gato1[] = new Gato[5];
        Cachorro cachorro1[] = new Cachorro[5];
        Outros outros1[] = new Outros[5];

        Agendamento agenda1[] = new Agendamento[5];

        JOptionPane.showMessageDialog(null, "Bem Vindo ao VETPET");

        while (ligado) {

            int escolha;
            int escolha2;

            /* Agendar e cadastrar */
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Que tipo de serviço vc está interessado? \n 1- Fazer cadastro \n 2- Agendar consulta \n 3- Sair"));

            if (escolha == 1) {
                escolha2 = Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Qual é o seu PET?\n 1-Gato \n 2-Cachorro \n 3-Outro"));

                if (escolha2 == 1) {
                    // criar obj
                    gato1[cont] = new Gato(null, null);// new GATO() GATO É um construtor;

                    // PREENCHER ATRIBUTOS DO OBJ
                    gato1[cont].setNome(JOptionPane.showInputDialog("Digite o nome:"));
                    gato1[cont].setCor(JOptionPane.showInputDialog("Digite a cor:"));
                    gato1[cont].setEspecie(JOptionPane.showInputDialog("Digite a especie: "));
                    gato1[cont].setGenero(JOptionPane.showInputDialog("Digite o genero:"));
                    gato1[cont].setPeso(JOptionPane.showInputDialog("Digite o peso:"));
                    gato1[cont].setPorte(JOptionPane.showInputDialog("Digite o porte:"));
                    gato1[cont].setPropietario(JOptionPane.showInputDialog("Digite o propietário: "));
                    gato1[cont].setTemperamento(JOptionPane.showInputDialog("Digite o temperamento: "));

                    JOptionPane.showMessageDialog(null,
                            "NOME" + gato1[cont].getNome() + "\n" + "COR:" + gato1[cont].getCor() + "\n"
                                    + "ESPECIE:" + gato1[cont].getEspecie() + "\n" + "PESO"
                                    + gato1[cont].getPeso() + "\n"
                                    + "PROPIETÁRIO:" + gato1[cont].getPropietario() + "\n" + "PORTE: "
                                    + gato1[cont].getPorte() + "\n" + "GENERO: " + gato1[cont].getGenero()
                                    + "\n"
                                    + "TEMPERAMENTO:" + gato1[cont].getTemperamento());

                    cont = +1;
                }

                else if (escolha2 == 2) {

                    cachorro1[cont] = new Cachorro(null, null);

                    cachorro1[cont].setNome(JOptionPane.showInputDialog("Digite o nome:"));
                    cachorro1[cont].setCor(JOptionPane.showInputDialog("Digite a cor:"));
                    cachorro1[cont].setEspecie(JOptionPane.showInputDialog("Digite a especie: "));
                    cachorro1[cont].setGenero(JOptionPane.showInputDialog("Digite o genero:"));
                    cachorro1[cont].setPeso(JOptionPane.showInputDialog("Digite o peso:"));
                    cachorro1[cont].setPorte(JOptionPane.showInputDialog("Digite o porte:"));
                    cachorro1[cont].setPropietario(JOptionPane.showInputDialog("Digite o propietário: "));
                    cachorro1[cont].setCaramelo(JOptionPane.showInputDialog("É caramelo?(s/n): "));

                    JOptionPane.showMessageDialog(null,
                            "NOME" + cachorro1[cont].getNome() + "\n" + "COR:"
                                    + cachorro1[cont].getCor()
                                    + "\n"
                                    + "ESPECIE:" + cachorro1[cont].getEspecie() + "\n" + "PESO"
                                    + cachorro1[cont].getPeso()
                                    + "\n"
                                    + "PROPIETÁRIO:" + cachorro1[cont].getPropietario() + "\n" + "PORTE: "
                                    + cachorro1[cont].getPorte() + "\n" + "GENERO: "
                                    + cachorro1[cont].getGenero() + "\n"
                                    + "CARAMELO:" + cachorro1[cont].getCaramelo());
                    cont++;

                } else if (escolha2 == 3) {

                    outros1[cont] = new Outros(null, null);

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
                                    + "ESPECIE:" + outros1[cont].getEspecie() + "\n" + "PESO"
                                    + outros1[cont].getPeso()
                                    + "\n"
                                    + "PROPIETÁRIO:" + outros1[cont].getPropietario() + "\n" + "PORTE: "
                                    + outros1[cont].getPorte() + "\n" + "GENERO: "
                                    + outros1[cont].getGenero()
                                    + "\n"
                                    + "HABITAT:" + outros1[cont].getHabitat());
                    cont++;
                } else {
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!\n TENTE NOVAMENTE!");
                }

            } else if (escolha == 2) {

                String proprietario;

                int escolcad;

                boolean encontrado = false;

                proprietario = JOptionPane.showInputDialog(null, "Digite o nome do proprietario do animal");

                for (int i = 0; i < cont; i++) {
                    if (gato1[i].getPropietario().equals(proprietario)) {
                        JOptionPane.showMessageDialog(null, "CADASTRO ENCONTRADO");

                        encontrado = true;
                        break;
                    }
                }
                for (int i = 0; i < cont; i++) {
                    if (cachorro1[i].getPropietario().equals(proprietario)) {
                        JOptionPane.showMessageDialog(null, "CADASTRO ENCONTRADO");
                        encontrado = true;
                        break;
                    }
                }
                for (int i = 0; i < cont; i++) {
                    if (outros1[i].getPropietario().equals(proprietario)) {
                        JOptionPane.showMessageDialog(null, "CADASTRO ENCONTRADO");
                        encontrado = true;
                        break;
                    }
                }
                String dataAgenda = JOptionPane.showInputDialog(null, "Informe a data de agendamento");
                String horaAgenda = JOptionPane.showInputDialog(null, "Informe a hora de agendamento");
                boolean agendaOK = true;

                while (agendaOK) {

                    for (int i = 0; i < cont; i++) {
                        if (agenda1[i].getDataHora().equals(dataAgenda + horaAgenda)) {
                            JOptionPane.showMessageDialog(null, "Horario já agendado, escolha outro");
                        } else {
                            agendaOK = false;
                            JOptionPane.showMessageDialog(null,"Agendamento Sucesso");
                            agenda1[cont] = new Agendamento();
                            agenda1[cont].setHora(horaAgenda);
                         /*    agenda1[cont].setData();     */

                        }
                    }
                }

                /*
                 * escolcad = Integer.parseInt(JOptionPane.showInputDialog(null,
                 * "Já possui cadastro?\n 1- SIM \n 2- NÃO"));
                 * 
                 * if (escolcad == 1) {
                 * JOptionPane.showMessageDialog(
                 * null,"Preencha o cadastro a seguir \nSeus dados estão seguro conosco");
                 * 
                 * 
                 * 
                 * 
                 * 
                 * 
                 * agenda1[cont] = new Agendamento(null, null, null, null);
                 * 
                 * /* agenda1[cont].setDia(JOptionPane.showInputDialog(null,
                 * "Qual dia você deseja agendar sua consulta"));
                 * agenda1[cont].setMes(JOptionPane.showInputDialog(null,
                 * "Qual mês você deseja agendar sua consulta"));
                 */
                /*
                 * agenda1[cont].setHora(JOptionPane.showInputDialog(null,
                 * "Qual hora você deseja agendar sua consulta"));
                 * 
                 * JOptionPane.showMessageDialog(null,"DATA DE SEU AGENDAMENTO: "+
                 * agenda1[cont].getDia()+"/"+ agenda1[cont].getMes()+" "+
                 * agenda1[cont].getHora());
                 * 
                 * if () {
                 * JOptionPane.showMessageDialog(null, "por favor insira outra data");
                 * }
                 * else {
                 * JOptionPane.showMessageDialog(null, "");
                 * }
                 */

                /*
                 * }
                 * else if (escol == 2){
                 * JOptionPane.showMessageDialog(
                 * null,"Só agendamos consultas com animais que já possuem cadastro na VET PET \n Por favor faça o cadastro \n Obrigado!"
                 * );
                 * }
                 */

            }

            ligado = false;
        }
    }

}
