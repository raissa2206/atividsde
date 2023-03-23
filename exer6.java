package exer6;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        int A,B,X;
        Scanner valor = new Scanner(System.in);
        System.out.println("digite valor A:");
          A = valor.nextInt();
        System.out.println("digite valor B:");
         B = valor.nextInt();
         X=A;
         A=B;
         B=X;
         System.out.println(" INVERTIDO valor A:"+A);
         System.out.println("           valor B:"+X);


    }
    
}
