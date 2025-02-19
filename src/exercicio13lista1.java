//Faça um programa em Java que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.

import java.util.Scanner;
public class exercicio13lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("insira o valor do salário: ");
        float salario = sc.nextFloat();
        float aumento = (float) (salario + (salario * 0.15));
        sc.close();
        System.out.print("seu salário com aumento é: "+ aumento);
    }
}
//insira o valor do salário: 1500
//seu salário com aumento é: 1725.0