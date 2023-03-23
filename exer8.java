package exer8;

import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        float real, dolar ,cota;
        Scanner valor = new Scanner(System.in);
        System.out.println("digite a quantidade de dolar :");
          dolar = valor.nextFloat();
        System.out.println("digite a cota do dolar:");
         cota = valor.nextFloat();
         real = dolar *cota;
         System.out.println("QUANTIDADE EM REAIS:"+real);

       
    }
    
}
