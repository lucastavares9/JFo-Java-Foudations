import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao progama Color Range! ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o comprimento da onda: ");
        double compOnda = sc.nextDouble();

        if (compOnda >= 380 && compOnda <450){
            System.out.println("A cor é Violeta");
        } else if (compOnda >= 450 && compOnda <495){
            System.out.println("A cor é Azul");
        } else if (compOnda >= 495 && compOnda <570){
            System.out.println("A cor é Verde");
        } else if (compOnda >= 570 && compOnda <590){
            System.out.println("A cor é Amarela");
        } else if (compOnda >= 590 && compOnda <620){
            System.out.println("A cor é Laranja");
        } else if (compOnda >= 620 && compOnda <750){
            System.out.println("A cor é Vermelha");
        } else {
            System.out.println("O comprimento de onda não está dentro do espectro visível");
        }
        sc.close();
    }
}
