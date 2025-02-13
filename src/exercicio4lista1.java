import java.util.Scanner;
public class exercicio4lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("variável A:");
        float A = sc.nextFloat();
        System.out.print("variável B: ");
        float B = sc.nextFloat();
        float soma = (A + B);
        System.out.print(soma);
    }
}