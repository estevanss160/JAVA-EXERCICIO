import java.util.Scanner;
public class exercicio15lista1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantidade de dias trabalhados: ");
    int dias = sc.nextInt();
    float salario = (float) (dias * 200);
    System.out.print("salário do mês "+salario);
    }
}
//Quantidade de dias trabalhados: 10
//salário do mês 2000.0