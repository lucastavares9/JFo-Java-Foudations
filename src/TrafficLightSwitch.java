import java.util.Scanner;

public class TrafficLightSwitch {
    public static void main(String[] args) {
        System.out.println("Progama Traffic Light Checker! ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a cor do semaforo: ");
        int corS = sc.nextInt();

        switch (corS){
            case 1:
            System.out.println("A proxima cor do semaforo será Verde!");
            break;
            
            case 3: 
            System.out.println("A proxima cor do semaforo será Vermelha!");
            break;

            default: 
            System.out.println("Cor inválida");

        }
        sc.close();
    }
}
