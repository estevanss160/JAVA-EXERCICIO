//Faça um programa em Java que leia as duas notas de um aluno em uma matéria e
//mostre na tela a sua média na disciplina.

import java.util.Scanner;
public class exercicio5lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("valor da primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("valor da segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.print("A média entre "+nota1+" e "+nota2+" é igual à "+((nota1 + nota2)/2));

    }
}
//Nota 1: 10.0
//Nota 2: 20.0
//A média entre 10.0 e 20.0 é igual à 15.0