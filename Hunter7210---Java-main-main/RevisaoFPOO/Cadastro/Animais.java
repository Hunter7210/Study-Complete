package RevisaoFPOO.Cadastro;

public abstract class Animais {
    //Toda classe tem atributos(caracteristicas/variaveis) e metodos()
    //atributos:
    String porte;  //ela não uma variavel primitiva
    String propietario;
    String genero;
    String especie;
    String peso;
    String nome;
    

    //Métodos
    //função do construtor (por padrao sempre existe um construtor, se não declarado é chamado de construtor vazio) um construtor criado serve para a criação de obj, porem sem atribuição de valor
    //construtor nada mais é doq um metodo que tem o nome da minha classe
    //os construtores são os responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida
    //construtor cheio
    /* public Animais(String porte, String propietario, String genero, String especie, double peso) {
        this.porte = porte;
        this.propietario = propietario;
        this.genero = genero;
        this.especie = especie;
    } */  //CLASSE ABSTRATA N FAZ SENTIDO TER CONSTRUTORES
    //construtor vazio
    public Animais() {
    
    }

    //gets and sets
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte; //this está la para diferenciar "porte" que faz referencia ao atributo do "porte" que faz referencia ao metodo, pois ambos possuem o mesmo nome. this é usado para diferencia-las
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getPeso() {
        return peso;
    }
    public Animais(String nome) {
        this.nome = nome;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
