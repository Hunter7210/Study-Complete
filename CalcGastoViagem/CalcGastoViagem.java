package CalcGastoViagem;

public class CalcGastoViagem
{
    public static void main(String[] args)
    {  
        System.out.println("===Calculadora de Custo de Viagem===");
        int distanciaPiPf = 300;
        int tempoPiPf = 3;
        float consumoMedCarro = 10.8f;
        float preçoDaGaso = 5.50f;
        float custoPedagio = 52.5f;
        float gasoUsada = distanciaPiPf/consumoMedCarro;
        float custoGaso = gasoUsada*preçoDaGaso;
        float custoFinal = custoGaso+custoPedagio;
        System.out.println("Distancia Percorrida= "+ distanciaPiPf+" km/h");
        System.out.println("Tempo gasto= " + tempoPiPf + " horas");
        System.out.println("Custo final= " + custoFinal+ " reais");

    }
}
