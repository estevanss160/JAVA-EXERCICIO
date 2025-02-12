import java.util.Scanner;
public class exercicio3lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Salário: ");
        float salario = sc.nextFloat();
        System.out.print("O funcionário(a) "+nome+" tem um salário de R$"+salario+" em junho");

    }
}
