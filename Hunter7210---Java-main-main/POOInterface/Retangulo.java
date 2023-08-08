package POOInterface;

public class Retangulo implements FigurasGeometricas{
    int base;
    int altura;
    
    //contrutor
    public Retangulo(int base, int altura) {
        this.base = base;  //Atribui parametros obrigatorios, sendo preciso declara-los na montagem do obj
        this.altura = altura;
    }


    @Override
    public double getArea() {
        return base*altura;
    }
    @Override
    public String getNomeFigura() {
        return "Retangulo";
    }
    @Override
    public double getPerimetro() {
        return (base+altura)*2;
    }

}
