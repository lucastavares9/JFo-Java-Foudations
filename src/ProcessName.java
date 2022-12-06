import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao progama Process Name!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu nome:");
        String nome1 = sc.nextLine();

        String[] nomeseparado = nome1.split("");

        System.out.println(nomeseparado[(nomeseparado.length - 1)]+ "" +nomeseparado[0].substring(0,1));
       
        
        sc.close();

    }
}
