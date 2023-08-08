package AtivFinal_Java;

public class ContaPJ extends Conta {
    String nomeEmp;
    String cNPJ;
    String endeEmp;
    String emailEmp;
    String telEmp;

    /* String tipEmp; (MEI;ME;EPP;MEDIO PORTE;GRANDE PORTE) */
    public ContaPJ(String nomeEmp, String cNPJ, String endeEmp, String emailEmp, String telEmp) {
        this.nomeEmp = nomeEmp;
        this.cNPJ = cNPJ;
        this.endeEmp = endeEmp;
        this.emailEmp = emailEmp;
        this.telEmp = telEmp;
    }

    public ContaPJ() {
    }

    public String getNomeEmp() {
        return nomeEmp;
    }

    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public String getcNPJ() {
        return cNPJ;
    }

    public void setcNPJ(String cNPJ) {
        this.cNPJ = cNPJ;
    }

    public String getEndeEmp() {
        return endeEmp;
    }

    public void setEndeEmp(String endeEmp) {
        this.endeEmp = endeEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public String getTelEmp() {
        return telEmp;
    }

    public void setTelEmp(String telEmp) {
        this.telEmp = telEmp;
    }

}
