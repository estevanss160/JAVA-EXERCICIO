import java.util.Scanner;
public class exercicio2lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu nome?: ");
        String NOME = sc.next();
        System.out.print("qual a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá "+NOME+", é um prazer te conhecer!");
        System.out.print("Sua idade é: "+idade);


    }

}
//Qual é o seu nome? João da Silva
//Olá João da Silva, é um prazer te conhecer!
//sua idade é: