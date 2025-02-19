//A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um
//programa em Java que pergunte a quantidade de Km percorridos por um carro alugado e
//a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo
//que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.

import java.util.Scanner;
public class exercicio14lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de quilômetro percorrido: ");
        float km = sc.nextFloat();
        System.out.print("Quantidade de dias alugado: ");
        float dias = sc.nextFloat();
        float total = (float) ((km * 0.20) + (dias * 90));
        System.out.print("total a ser pago pelo aluguel: "+total);
    }
}
//Quantidade de quilômetro percorrido: 700
//Quantidade de dias alugado: 5
//total a ser pago pelo aluguel: 590.0