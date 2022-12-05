import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        System.out.println("Progama Traffic Light Checker! ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a cor do semaforo: ");
        int cor = sc.nextInt();

        if ( cor== 1){
        System.out.println("A proxima cor do semaforo será Verde!");
        } else if ( cor== 3){
        System.out.println("A proxima cor do semaforo será Vermelha!");
        } else {
        System.out.println("Cor inválida");
        }
        sc.close();
    }
}
