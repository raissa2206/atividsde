package exer3;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
       Scanner  variavel = new Scanner(System.in);
       float gasolina, km,gasto;
       System.out.println("digite o numero gasto de gasolina:");
       gasolina = variavel.nextInt();
       System.out.println("digite o numero de km");
       km = variavel.nextInt();
        gasto= gasolina +km/2;
        System.out.print("media gasta é:"+gasto);


    }
}
