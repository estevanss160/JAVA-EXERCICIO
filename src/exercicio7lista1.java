import java.util.Scanner;
public class exercicio7lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um valor: ");
        float numero = sc.nextFloat();
        System.out.print("O dobro de "+numero+" é "+(numero * 2)+"\nA terça parte de "+numero+" é "+(numero/3));
    }
}
//digite um valor: 3,5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.1666666