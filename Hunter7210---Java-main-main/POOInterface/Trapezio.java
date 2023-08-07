package POOInterface;

public class Trapezio implements FigurasGeometricas{
    int baseMaior;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;
    
    public Trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
       int area = (baseMaior+baseMenor)*altura/2;
        return area;
    }

    @Override
    public String getNomeFigura() {
       String nome= "Trapezio";
        return nome;
    }

    @Override
    public double getPerimetro() {
       int perimetro = lado1+lado2+baseMaior+baseMenor;
        return perimetro;
    }

    


}
