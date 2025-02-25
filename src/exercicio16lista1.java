//Escreva um programa em Java para calcular a redução do tempo de vida de
//um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já
//fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos
//dias de vida um fumante perderá e exiba o total em dias.

import java.util.Scanner;
public class exercicio16lista1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos cigarros você fuma por dia atualmente? ");
        int qtd_cigarros = teclado.nextInt();
        System.out.print("Quantos anos você fuma? ");
        float qtd_anos = teclado.nextFloat();
        teclado.close();
        int qtd_dias = ((int) qtd_anos) * 365;
        if ((qtd_anos - (int) qtd_anos) != 0) {
            qtd_dias += (qtd_anos - (int) qtd_anos) * 12 * 30;
        }
        int minutos_perdidos = qtd_dias * qtd_cigarros * 10;
        int dias_perdidos = (minutos_perdidos / 60) / 24;
        System.out.print("Você perderá " + dias_perdidos + " dias de vida.");
    }
}
//Quantos cigarros você fuma por dia? 8
//Quantos anos você fuma? 53,5
//Você perderá 1084 dias de vida.