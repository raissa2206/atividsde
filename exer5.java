package exer5;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class exer5 {
    public static void main(String[] args) {
        String nome;
        int numero1,numero2,numero3;
        float media;
        Scanner valor = new Scanner(System.in);
        System.out.println("digite o nome do aluno:");
        nome = valor.nextLine();
        System.out.println("digite nota 1:");
        numero1 = valor.nextInt();
        System.out.println("digite nota 2:");
        numero2 = valor.nextInt();
        System.out.println("digite nota 3:");
        numero3 = valor.nextInt();
        media = (float) ((numero1 + numero2 + numero3) / 3);
        System.out.println("O aluno:"+nome);
        System.out.printf("A MEDIA É:"+media);
        


        
    }

   
    
}
