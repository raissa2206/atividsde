package exer10;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        float produto,parcelas;
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
          produto = valor.nextFloat();
          parcelas = produto / 5;
         System.out.println("o valor das parcelas sera de R$"+parcelas+"reais."); 

    }
    
}
