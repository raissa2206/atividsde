package exer4;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        String nome;
        float comissao,salario,tovenda,salafinal;
        Scanner valor = new Scanner(System.in);
        System.out.println("Didite o nome do funcionario:");
        nome = valor.nextLine();
        System.out.println("Digite salario fixo:");
        salario = valor.nextFloat();
        System.out.println("Digite total de vendas:");
        tovenda = valor.nextFloat();
        System.out.println("O nome do funcionario"+nome);
        System.out.printf("Salario fixo "+salario);
        System.out.printf("total de vendas"+tovenda+"/");
        comissao = (float) (tovenda * 15.0);
        salafinal = salario + comissao;
        System.out.printf("salario final do funcionario: "+salafinal);

        
    
        

        
    
    



    }
    
}
