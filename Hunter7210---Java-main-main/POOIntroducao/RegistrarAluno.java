package POOIntroducao;

/**
 * RegistrarAluno
 */
public class RegistrarAluno {
   //DECLARAÇÃO DE ATRIBUTOS DO OBJETO
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;
    //é private pois essa informação é somente para uma classe
    
    
    
    //crição de metodos
        //retorna o nome do estudante
        public String getNome() {
            return nome;
        }
        public String getEndereco() {
            return endereco;
        }
        public double getIdade() {
            return idade;
        }
/*         public String getMedia() {
            double resultado = 0;
            resultado = (notaMatematica+notaCiencias+notaPortugues)/3;
        /*    return resultado;         
        }
        //retorna a quantidade de estudantes cadastrados
        public static int getQuantidadeAluno() {
            return contadorEstudante;
        } */
        

        //Metodos de set (Altera informações do objeto)
        //Define ou altera o nome do estudante
        public void setNome(String temp) {
            nome = temp;
        }
        public void setEndereco(String temp) {
            nome = temp;
        }
        public void setIdade(String temp) {
            nome = temp;
        }

}  