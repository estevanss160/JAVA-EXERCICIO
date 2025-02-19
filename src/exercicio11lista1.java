//Desenvolva uma programa em Java que leia os valores de A, B e C de uma
//equação do segundo grau e mostre o valor de Delta. (formula Δ = b**2 – 4ac)
import java.util.Scanner;
public class exercicio11lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o valor de A: ");
        float a = sc.nextFloat();
        System.out.print("digite o valor de B: ");
        float b = sc.nextFloat();
        System.out.print("digite o valor de C: ");
        float c = sc.nextFloat();
        float d = (float) ((b * b) - (4 * a * c));
        sc.close();
        System.out.print("valor de delta é: "+d);
    }
}
//digite o valor de A: 5
//digite o valor de B: 3
//digite o valor de C: 2
//valor de delta é: -31.0