package exer2;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {

        Scanner variavel = new Scanner(System.in);
        int soma, menos, n1, n2;
        float divisão, multiplicação;
        System.out.println("Digite um valor inteiro");
        n1 = variavel.nextInt();
        System.out.println("Digite um valor inteiro");
        n2 = variavel.nextInt();
        soma = n1 + n2;
        menos = n1 - n2;
        multiplicação = n1 * n1;
        divisão = n1 / n2;
        System.out.println("resultados o resultado da soma e:" + soma);
        System.out.println("o resultado da subtracao e:" + menos);
        System.out.println("o resultado da divisao e:" + divisão);
        System.out.println("o resultado da multiplicacao e:" + multiplicação);
    }
}
