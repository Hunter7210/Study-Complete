package EstruturaDecisãoIfElse;

import java.util.Scanner;

public class DecisaoIfElse
{
    Scanner sc = new Scanner(System.in);
    public void decisaoIf()
    {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        //Se precoProduto>100 então desconto=5
        if (precoProduto>= 100) 
        {
            desconto=5;    
        }
        //Se precoProduto>200 então desconto=10
        if (precoProduto>=200 && precoProduto<300) 
        {
            desconto=10;
        }
        if (precoProduto>=300)
        {
            desconto=15;
        }
        //Realizar a conta
        double valorDesconto = precoProduto*desconto/100;
        double precoFinal = precoProduto-valorDesconto;
        System.out.println("O valor do produto é R$ "+precoFinal); 
    } 
    //IF ENCADEADO(IF-ELSE)
    public void decisaoIfElse()
    {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        // Estrutura de decisão encadeada if-else
         if (precoProduto>=300)
        {
            desconto=15;
        }
         else if (precoProduto>= 200)
        {
            desconto=10;
        }
         else if(precoProduto>=100)
        {
            desconto= 5;
        }

        else
        {
            desconto=0;
        }
        //Realizar a conta
        double valorDesconto = precoProduto*desconto/100;
        double precoFinal = precoProduto-valorDesconto;
        System.out.println("O valor do produto é R$ "+precoFinal);
    }
}