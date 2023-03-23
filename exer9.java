package exer9;

import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        float poupança, juros, rendeu;
        Scanner valor = new Scanner(System.in);
        System.out.println("digite o valor da poupança:");
          poupança = valor.nextFloat();
          juros=(float) (poupança*0.70)/100;
          rendeu= juros + poupança;
          System.out.println("em um mes rendeu :R$"+rendeu);



    }
    
}
