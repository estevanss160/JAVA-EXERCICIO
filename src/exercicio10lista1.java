import java.util.Scanner;
public class exercicio10lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Comprimento da parede em metros: ");
        float Comprimento = sc.nextFloat();
        System.out.print("Altura da parede em metros: ");
        float Altura = sc.nextFloat();
        System.out.print("Area a ser pintada é:  "+(Comprimento * Altura)+"\nTinta necessária para a pintura em Litros: "+((Comprimento * Altura)/2));
    }
}
//Comprimento da parede em metros: 3
//Altura da parede em metros: 2,75
//Area a ser pintada é:  8.25
//Tinta necessária para a pintura em Litros: 4.125