package AtivFinal_Java;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        int cont = 0;

        ContaPF contaPF[] = new ContaPF[5];
        ContaPJ contaPJ[] = new ContaPJ[5];

        boolean ligado = true;
        int acao;
        int acao1;
        int acao2;

        while (ligado) {

            int numContaP = 1000 + cont + 1;
            int numContaE = 10000 + cont + 1;

            contaPF[cont].setNumeroConta(Integer.toString(numContaE));
            contaPJ[cont].setNumeroConta(Integer.toString(numContaP));

            int corSen;
            int senha = 0;

            JOptionPane.showMessageDialog(null, "1- CRIAR CONTA\n 2- ENTRAR");
            acao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));

            JOptionPane.showMessageDialog(null, "1- Pessoa Física\n 2- Pessoa Juridica");
            acao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));

            if (acao == 1 && acao1 == 1) {

                // contruir o objeto
                contaPF[cont] = new ContaPF(null, null, null, null, null, null, null, null, null);
                // preencher

                contaPF[cont].setNomeP(JOptionPane.showInputDialog("Digite seu nome:"));
                contaPF[cont].setIdadeP(JOptionPane.showInputDialog("Digite sua idade:"));
                contaPF[cont].setDatNasc(JOptionPane.showInputDialog("Digite sua data de nascimento: "));
                contaPF[cont].setcPF(JOptionPane.showInputDialog("Digite seu CPF:"));
                contaPF[cont].setEndeP(JOptionPane.showInputDialog("Digite seu endereço:"));
                contaPF[cont].setEmailP(JOptionPane.showInputDialog("Digite seu e-mail: "));
                contaPF[cont].setNomeMaeP(JOptionPane.showInputDialog("Digite o nome da mãe: "));
                contaPF[cont].setNomePaiP(JOptionPane.showInputDialog("Digite o nome do pai (não obrigatório): "));
                contaPF[cont].setTelP(JOptionPane.showInputDialog("Digite seu telefone/celular: "));

                JOptionPane.showMessageDialog(null,
                        "Nome: " + contaPF[cont].getNomeP() + "\n" + "Idade: " + contaPF[cont].getIdadeP() + "\n"
                                + "Data de Nascimento: " + contaPF[cont].getDatNasc() + "\n" + "CPF: "
                                + contaPF[cont].getcPF() + "\n" + "Endereço: " + contaPF[cont].getEndeP() + "\n"
                                + "E-mail: " + contaPF[cont].getEmailP() + "\n" + "Nome da Mãe: "
                                + contaPF[cont].getNomeMaeP() + "\n" + "Nome do Pai: " + contaPF[cont].getNomePaiP()
                                + "\n" + "Telefone: " + contaPF[cont].getTelP());

                corSen = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Seus dados estão corretos?" + "\n" + "1- SIM" + "\n" + "2- NÃO"));

                if (corSen == 1) {

                    senha = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite sua senha:" + "\n" + "SUA SENHA DEVE CONTER 6 NUMEROS"));
                    JOptionPane.showMessageDialog(null, "O NOME DA EMPRESA É: " + contaPJ[cont].getNomeEmp() + "\n"
                            + "O NUMERO DE SUA CONTA É: " + contaPF[cont].getNumeroConta() + "\n" + "SUA SENHA É: "
                            + senha);
                } else {
                    JOptionPane.showMessageDialog(null, "PREENCHA NOVAMENTE");
                }

            }

            if (acao == 1 && acao1 == 2) {

                // contruir o objeto
                contaPJ[cont] = new ContaPJ(null, null, null, null, null);
                // preencher

                contaPJ[cont].setNomeEmp(JOptionPane.showInputDialog("Digite o nome de sua empresa:"));
                contaPJ[cont].setcNPJ(JOptionPane.showInputDialog("Digite seu  CNPJ: "));
                contaPJ[cont].setEndeEmp(JOptionPane.showInputDialog("Digite o endereço de sua empresa: "));
                contaPJ[cont].setEmailEmp(JOptionPane.showInputDialog("Digite o e-mail de sua empresa:"));
                contaPJ[cont].setTelEmp(JOptionPane.showInputDialog("Digite o telefone da sua empresa: "));

                JOptionPane.showMessageDialog(null,
                        "Nome: " + contaPJ[cont].getNomeEmp() + "\n" + "CNPJ: " + contaPJ[cont].getcNPJ() + "\n"
                                + "Endereço: " + contaPJ[cont].getEndeEmp() + "\n" + "E-mail: "
                                + contaPJ[cont].getEmailEmp() + "\n" + "Telefone: " + contaPJ[cont].getTelEmp());

                corSen = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Seus dados estão corretos?" + "\n" + "1- SIM" + "\n" + "2- NÃO"));

                if (corSen == 1) {

                    senha = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite sua senha:" + "\n" + "SUA SENHA DEVE CONTER 6 NUMEROS"));

                    JOptionPane.showMessageDialog(null,
                            "O NOME DA EMPRESA É: " + contaPJ[cont].getNomeEmp() + "\n" + "O NUMERO DE SUA CONTA É: "
                                    + contaPJ[cont].getNumeroConta() + "\n" + "SUA SENHA É: " + senha);
                } else {
                    JOptionPane.showMessageDialog(null, "PREENCHA NOVAMENTE");
                }

            }
            /* (2- Permitir busca de conta pelo n° da conta/ou nome) */
            if (acao == 2 && acao1 == 1) {
                int pesqu = 0;
                int nContaDig;
                String nomeDig;

                pesqu = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Escolha uma ação" + "\n" + "1- Acessar por n° Conta" + "\n" + "2- Acessar por Nome"));

                if (pesqu == 1) {
                    nContaDig = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite n° da conta: "));
                    if (contaPF[cont].getNumeroConta().equals(nContaDig)) {
                        JOptionPane.showMessageDialog(null, "Acesso permitido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Acesso negado");
                    }
                } else {
                    nomeDig = JOptionPane.showInputDialog(null,
                            "Digite seu nome: ");
                    if (contaPF[cont].getNomeP().equals(nomeDig)) {
                        JOptionPane.showMessageDialog(null, "Acesso permitido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Acesso negado");
                    }
                }

                acao2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "N° DA CONTA: " + contaPF[cont].getNumeroConta() + "\n" + "USUÁRIO: " + contaPF[cont].getNomeP()
                                + "\n" + "ESCOLHA UMA FUNÇÃO:" + "\n" + "1- SALDO \n 2- SAQUE"
                                + "\n" + "3- DESPÓSITO " + "\n" + "4- EMPRÉSTIMO" + "\n" + "5- SAIR"));

                switch (acao2) {
                    case 1:
                        contaPF[cont].getSaldo();
                        break;

                    case 2:
                        contaPF[cont]
                                .saque(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a sacar: ")));
                        break;

                    case 3:
                        contaPF[cont].deposito();
                        break;

                    case 4:
                        contaPF[cont].emprestimo();
                        break;
                    case 5:
                        ligado = false;

                    default:
                        JOptionPane.showMessageDialog(null, "INFORME UMA AÇÃO EXISTENTE");
                }
            } else {
                int pesqu = 0;
                int nContaDig;
                String nomeDig;

                pesqu = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Escolha uma ação" + "\n" + "1- Acessar por n° Conta" + "\n" + "2- Acessar por Nome"));

                if (pesqu == 1) {
                    nContaDig = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite n° da conta: "));
                    if (contaPJ[cont].getNumeroConta().equals(nContaDig)) {
                        JOptionPane.showMessageDialog(null, "Acesso permitido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Acesso negado");
                    }
                } else {
                    nomeDig = JOptionPane.showInputDialog(null,
                            "Digite seu nome: ");
                    if (contaPJ[cont].getNomeEmp().equals(nomeDig)) {
                        JOptionPane.showMessageDialog(null, "Acesso permitido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Acesso negado");
                    }
                }

                acao2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "N° DA CONTA: " + contaPJ[cont].getNumeroConta() + "\n" + "USUÁRIO: "
                                + contaPJ[cont].getNomeEmp()
                                + "\n" + "ESCOLHA UMA FUNÇÃO:" + "\n" + "1- SALDO \n 2- SAQUE"
                                + "\n" + "3- DESPÓSITO " + "\n" + "4- EMPRÉSTIMO" + "\n" + "5- SAIR"));

                switch (acao2) {
                    case 1:
                        contaPJ[cont].getSaldo();
                        break;

                    case 2:
                        contaPJ[cont]
                                .saque(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a sacar: ")));
                        break;

                    case 3:
                        contaPJ[cont].deposito();
                        break;

                    case 4:
                        contaPJ[cont].emprestimo();
                        break;
                    case 5:
                        ligado = false;

                    default:
                        JOptionPane.showMessageDialog(null, "INFORME UMA AÇÃO EXISTENTE");
                }

            }
        }
    }
}