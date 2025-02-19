//Crie um programa Java que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
//hora trabalhada.

import java.util.Scanner;
public class exercicio15lista1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantidade de dias trabalhados: ");
    int dias = sc.nextInt();
    float salario = (float) (dias * 200);
    System.out.print("salário do mês "+salario);
    }
}
