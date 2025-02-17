//Crie um programa em Java que leia o preço de um produto, calcule e mostre o seu
//PREÇO PROMOCIONAL, com 5% de desconto.

import java.util.Scanner;
public class exercicio12lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor do produto: ");
        float valor = sc.nextFloat();
        float valor1 = (valor - (valor * 5/100));
        System.out.print("Valor do produto com 5% de desconto é:"); System.out.printf("%.2f",valor1);
    }
}
//Insira o valor do produto: 10
//Valor do produto com 5% de desconto é:9,50