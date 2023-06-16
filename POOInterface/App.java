package POOInterface;

/**
 * App
 */
public class App { 

    public static void Main(String[] args){

        Quadrado figura1 = new Quadrado(7);

        Retangulo figura2 = new Retangulo(4, 8);

        Trapezio figura3 = new Trapezio(5, 3, 2, 4, 6);

        //array de objetos; ARRAY É UM VETOR DE OBJETOS
        Trapezio figTrapezio[] = new Trapezio[5];
        figTrapezio[0] = new Trapezio(10, 5, 6, 7, 8);
        
        //ARRAY DE CLASSE, E OBJETOS DESSAS CLASSES; FOR PARA AUXILIAR NO PREENCHIMENTO
        for (int i = 0; i < figTrapezio.length; i++) {
            figTrapezio[i]= new Trapezio(+5, i, i+1, i+2, i+3);
        }


        System.out.println("Nome figura é "+ figura1.getNomeFigura()+"/n Area = "+figura1.getArea()+"/n Perimetro = "+figura1.getPerimetro());    
        System.out.println("Nome figura é "+ figura2.getNomeFigura()+"/n Area = "+figura2.getArea()+"/n Perimetro = "+figura2.getPerimetro());
        System.out.println("Nome figura é "+ figura3.getNomeFigura()+"/n Area = "+figura3.getArea()+"/n Perimetro = "+figura3.getPerimetro());
    }
}
