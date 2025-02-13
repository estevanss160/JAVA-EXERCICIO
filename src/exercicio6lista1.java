import java.util.Scanner;
public class exercicio6lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("insira um valor: ");
        float valor = sc.nextFloat();
        float antecessor = valor - 1;
        float sucessor = valor + 1;
        System.out.println("O antecessor de "+valor+" é "+antecessor+"\nO sucessor de "+valor+" é "+sucessor);

    }
}
