package AtivFinal_Java;

public class ContaPF extends Conta {
    // Construit ContaPessa Física
    // Atributos da ContaPF

    String nomeP;
    String idadeP;
    String datNasc;
    String cPF;
    String endeP;
    String emailP;
    String nomeMaeP;
    String nomePaiP;
    String telP;

    // Construtor
    public ContaPF(String nomeP, String idadeP, String datNasc, String cPF, String endeP, String emailP,
            String nomeMaeP, String nomePaiP, String telP) {
        this.nomeP = nomeP;
        this.idadeP = idadeP;
        this.datNasc = datNasc;
        this.cPF = cPF;
        this.endeP = endeP;
        this.emailP = emailP;
        this.nomeMaeP = nomeMaeP;
        this.nomePaiP = nomePaiP;
        this.telP = telP;
    }

    // contruir os metodos
    // set and gets

    public ContaPF() {
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public String getIdadeP() {
        return idadeP;
    }

    public void setIdadeP(String idadeP) {
        this.idadeP = idadeP;
    }

    public String getDatNasc() {
        return datNasc;
    }

    public void setDatNasc(String datNasc) {
        this.datNasc = datNasc;
    }

    public String getcPF() {
        return cPF;
    }

    public void setcPF(String cPF) {
        this.cPF = cPF;
    }

    public String getEndeP() {
        return endeP;
    }

    public void setEndeP(String endeP) {
        this.endeP = endeP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public String getNomeMaeP() {
        return nomeMaeP;
    }

    public void setNomeMaeP(String nomeMaeP) {
        this.nomeMaeP = nomeMaeP;
    }

    public String getNomePaiP() {
        return nomePaiP;
    }

    public void setNomePaiP(String nomePaiP) {
        this.nomePaiP = nomePaiP;
    }

    public String getTelP() {
        return telP;
    }

    public void setTelP(String telP) {
        this.telP = telP;
    }

}
