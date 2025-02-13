import java.util.Scanner;
public class exercicio8lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("insira o valor em metro(s): ");
        float metros = sc.nextFloat();
        float cm = (metros * 100);
        float km = (metros / 10000);
        float mm = (metros * 1000);
        System.out.print("A medida de "+metros+" metros é igual a:\n"+mm+" em milímetros\n"+cm+" em centímetros\n"+km+" em quilômetros");
    }
}
//A medida de 100.0 metros é igual a:
//100000.0 em milímetros
//10000.0 em centímetros
//0.01 em quilômetros