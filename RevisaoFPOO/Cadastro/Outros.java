package RevisaoFPOO.Cadastro;

/**
 * Outros
 */
public class Outros extends Animais{

    String habitat;
    String porte;
    String cor;
    
    
/*     public Outros(String porte, String propietario, String genero, String especie, double peso, String porte2,
            String cor) 
    {
        super(porte, propietario, genero, especie, peso);
        porte = porte2;
        this.cor = cor;
    } */

    public Outros(String porte, String cor) {
        this.porte = porte;
        this.cor = cor;
    }

    public Outros(String habitat) {
        this.habitat = habitat;
    }


    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    

}