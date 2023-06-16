package POOInterface;

public interface FigurasGeometricas {  //INTERFACE SERVE APENAS DITAR ALGUMAS REGRAS, SENDO OBRIGATORIAMENTE SEGUIR ESSAS REGRAS NOS METODOS QUE FOREM UTILIZAR ESSA CLASSE
    //TODOS OS METODOS DENTRO DA CLASSE INTERFACE SÃO ABSTRACT, OU SEJA, NÃO PODEM SER INSTANCIADOS
    
    public String getNomeFigura();

    public double getArea();

    public double getPerimetro();
    
}
