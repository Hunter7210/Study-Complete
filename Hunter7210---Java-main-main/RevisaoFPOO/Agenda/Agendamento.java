package RevisaoFPOO.Agenda;

public class Agendamento {
    
    String data;
 /*    String mes; */
/*     String ano; */
    String hora;
    String dataHora;
    


    public Agendamento(String dia, String mes, String ano, String hora) {
        /*   this.dia = dia;
        this.mes = mes; */
        /* this.ano = ano; */
        this.hora = hora;
    }


    public Agendamento() {
    }

    /* public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }/*  
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    } */
    public String getHora() {
        return hora;
    }
    public Agendamento(String dataHora) {
        this.dataHora = dataHora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDataHora() {
        dataHora = data+hora;
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

    
}
