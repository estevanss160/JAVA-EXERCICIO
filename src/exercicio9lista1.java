import java.util.Scanner;
public class exercicio9lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("valor em reais R$: ");
        float reais = sc.nextFloat();
        float dolarEUA = (float) (reais/6.0973);
        System.out.printf("%.2f Reais Brasileiro equivale a %.2f Dólar Estadunidense em 13/02/2025", reais, dolarEUA);
    }
}
//valor em reais R$: 100
//100,00 Reais Brasileiro equivale a 16,40 Dólar Estadunidense em 13/02/2025