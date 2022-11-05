package exercicios;

import java.util.Scanner;

public class impostoDeRenda {  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    double salario;
    double imposto = 0;
    double diferenca;
    System.out.println("digite seu salário");
    salario = sc.nextDouble();

    if(salario > 4500){
        imposto = 1000 * (8.00/100)+1500*0.18;
        diferenca = salario - 4500;
        imposto = imposto + diferenca * 0.28;

    }
    else if(salario > 3000){
        imposto = 1000*0.08;
        diferenca = salario - 3000;
        imposto += diferenca * 0.18;

    }
    else if(salario > 2000){
        diferenca = salario - 2000;
        imposto = diferenca * 0.08;

    }
    System.out.println("R$" + imposto);


}
}
