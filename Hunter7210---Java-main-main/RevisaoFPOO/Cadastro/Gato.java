package RevisaoFPOO.Cadastro;

public class Gato extends Animais {
    String cor;
    String Temperamento;
    
    
    
    public Gato(String cor, String temperamento) {
        this.cor = cor;
        Temperamento = temperamento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTemperamento() {
        return Temperamento;
    }

    public void setTemperamento(String temperamento) {
        Temperamento = temperamento;
    }
}
    

