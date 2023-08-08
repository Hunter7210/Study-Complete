import java.util.Scanner;

public class ExerciciosWhile {
    Scanner sc= new Scanner(System.in);

    public void exercicio1() {
        int vetorA[] = new int[]{5,7,9,10,13};
        int vetorB[] = new int[5];

        int i=0;
        while (i<5) {
            vetorB[i]=vetorA[i];        
            System.out.println("O vetorB ["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio2() {
        int vetorA[] = new int[]{5,7,9,10,13,20,40,45};
        int vetorB[] = new int[8];
        int i=0;
        while (i<8) {
            System.out.println("------------------"); 
            vetorB[i]= vetorA[i]*2;
            System.out.println("O vetorA ["+i+"]=" +vetorA[i]);
                  
            System.out.println("O vetorB ["+i+"]="+vetorB[i]);
            System.out.println("------------------");  
            i++;
        }
        
    }
    public void exercicio3() {
        int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vetorB[] = new int[15];
        int i=0;
        while (i<15) {
            System.out.println("------------------"); 
            vetorB[i]= vetorA[i]*vetorA[i];
            System.out.println("O vetorA ["+i+"]=" +vetorA[i]);
                  
            System.out.println("O vetorB ["+i+"]="+vetorB[i]);
            System.out.println("------------------");  
            i++;
        }
        
    }
    public void exercicio4() {
        double vetorA[] = new double[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        double vetorB[] = new double[15];
        int i=0;
        while (i<15) {
            System.out.println("------------------"); 
            vetorB[i]= Math.sqrt(vetorA[i]);
            System.out.println("O vetorA ["+i+"]=" +vetorA[i]);
                  
            System.out.println("O vetorB ["+i+"]="+vetorB[i]);
            System.out.println("------------------");  
            i++;
        }
        
    }
    public void exercicio5() {
        int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int vetorB[] = new int[10];
        int i=0;
        while (i<10) {
            System.out.println("------------------"); 
            vetorB[i]= vetorA[i]*i;
            System.out.println("O vetorA ["+i+"]=" +vetorA[i]);
                  
            System.out.println("O vetorB ["+i+"]="+vetorB[i]);
            System.out.println("------------------");  
            i++;
        }
        
    }
    public void exercicio6() {
        int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vetorB[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vetorC[] = new int[10];
        int i=0;
        while (i<15) {
            System.out.println("------------------"); 
            vetorC[i]= vetorA[i]+vetorB[i];
            System.out.println("O vetorA ["+i+"]=" +vetorA[i]);
            System.out.println("O vetorB ["+i+"]="+vetorB[i]);
            System.out.println("O vetorc ["+i+"]="+vetorC[i]);
            System.out.println("------------------");  
            i++;
        }
    }
}
