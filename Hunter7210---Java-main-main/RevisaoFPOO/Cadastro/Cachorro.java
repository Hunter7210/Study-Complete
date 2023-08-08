package RevisaoFPOO.Cadastro;

/**
 * Cachorro
 */
public class Cachorro extends Animais {

    String cor;
    String caramelo;
   
   
/*     public Cachorro(String porte, String propietario, String genero, String especie, double peso, String cor,
            String caramelo) 
    {
        super(porte, propietario, genero, especie, peso);
        this.cor = cor;
        this.caramelo = caramelo;
    } */

    
    public Cachorro(String cor, String caramelo) {
        this.cor = cor;
        this.caramelo = caramelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCaramelo() {
        return caramelo;
    }
    public void setCaramelo(String caramelo) {
        this.caramelo = caramelo;
    }

    
}