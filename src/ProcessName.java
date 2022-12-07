import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao progama Process Name !");
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu nome:  ");
        String nome = sc.nextLine();
        String[] nomeSeparado = nome.split(" ");
        System.out.println(nomeSeparado[(nomeSeparado.length - 1)] + " " + nomeSeparado[0].substring(0,1));
        sc.close();
    }
}
