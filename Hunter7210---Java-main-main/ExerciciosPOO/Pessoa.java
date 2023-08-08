package ExerciciosPOO;


public class Pessoa {
    // Declarar os atributos
    private String nome;
    private double altura;
    private int dNascimento;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    // metodos
    // construtor - mesmo nome da classe
    public Pessoa(String nome, double altura, int dNascimento, int diaNascimento, int mesNascimento,
            int anoNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.dNascimento = dNascimento;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    // construtor vazio
   /*  public Pessoa() {
    } */

    // getters and setters get(pega) set(atribui)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getdNascimento() {
        return dNascimento;
    }

    public void setdNascimento(int dNascimento) {
        this.dNascimento = dNascimento;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    //Metodos imprimir  metodo void (não retorna nada(atribuir algo)) metodo return(retorna algo(pegar algo))
    public void imprimir() {
/*         JOptionPane.showMessageDialog(null, "Nome: " +nome);  JOptionPane é uma especie de ALERT, Não funciona no CODESPACE
        JOptionPane.showMessageDialog(null, "Altura: "+altura); 
        JOptionPane.showMessageDialog(null,"Nascimento: "+dNascimento+"/"+mesNascimento+"/"+anoNascimento);*/

        System.out.println("Nome: "+ nome);
        System.out.println("Altura: "+ altura);
        System.out.println("Nascimento: "+dNascimento+"/"+mesNascimento+"/"+anoNascimento);    
    }
    //metodo para calcular a idade

    public int idade() {
        int calculo;
        if (dNascimento<=5 && mesNascimento<=6) {
            calculo = 2023- anoNascimento;
        }
        else{
            calculo = 2023 - anoNascimento - 1;
        }
        return calculo;  //retorna um valor de algo
    }
    
}

/*
 * /* int aaaa;
 * int id;
 */

/*
 * public Pessoa(int aaaa, int id) {
 * this.aaaa = aaaa;
 * this.id = id;
 * }
 * 
 * @Override
 * public int getId() {
 * 
 * return (2023-aaaa);
 * }
 * 
 * @Override
 * public String getNome() {
 * // TODO Auto-generated method stub
 * return null;
 * }
 * 
 * @Override
 * public double getPrint() {
 * // TODO Auto-generated method stub
 * return 0;
 * }
 */
