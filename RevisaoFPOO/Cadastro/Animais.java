package RevisaoFPOO.Cadastro;

public class Animais {
    //Toda classe tem atributos(caracteristicas/variaveis) e metodos()
    //atributos:
    String porte;  //ela não uma variavel primitiva
    String propietario;
    String genero;
    String especie;
    double peso;
    //Métodos
    //função do construtor (por padrao sempre existe um construtor, se não declarado é chamado de construtor vazio) um construtor criado serve para a criação de obj, porem sem atribuição de valor
    //construtor nada mais é doq um metodo que tem o nome da minha classe
    //os construtores são os responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida
    //construtor cheio
    public Animais(String porte, String propietario, String genero, String especie, double peso) {
        this.porte = porte;
        this.propietario = propietario;
        this.genero = genero;
        this.especie = especie;
        this.peso = peso;
    }
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
