import java.util.Scanner;

public class DisplayMultiples {
public static void main(String[] args) {
       System.out.println("Bem vindo ao progama Multiples Display");
       System.out.print("Insira um número: ");
       System.out.println();
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i=1; i<= 12; i++){
        System.out.println(numero + "x" + i + " = "+ numero*i);
        }
        sc.close();
    }
}
