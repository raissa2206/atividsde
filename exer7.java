package exer7;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        int c;
        float f;
        Scanner valor = new Scanner(System.in);
        System.out.println("digite a temperatura em celsius:");
          c = valor.nextInt();
          f = (9*c+160)/5;
          System.out.printf("temperatura em fahrenheit:"+f);

    }
    
}
