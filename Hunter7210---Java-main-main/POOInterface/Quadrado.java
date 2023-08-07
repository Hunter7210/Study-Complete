package POOInterface;

public class Quadrado implements FigurasGeometricas{  //A CLASSE QUADRADO PRECISA SEGUIR AS REGRAS DE FigurasGeometricas
    
    int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        int area = lado*lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = lado*4;
        return perimetro;
    }

    public Quadrado(int lado) { //Construtor com 1 parametro
        this.lado = lado;
    }


    
}
