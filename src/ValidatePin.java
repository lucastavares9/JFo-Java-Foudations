import java.util.Scanner;

public class ValidatePin {
     public static void main(String[] args) {
        System.out.println("Bem vindo ao progama Validate Pin! ");
        Scanner sc = new Scanner(System.in);
        double userPIN = 9998;
        System.out.print("Insira o PIN: ");
        double inserirPIN = sc.nextDouble(); 

        Scanner tecladoScanner = new Scanner(System.in);

        inserirPIN = sc.nextDouble();
        


        while (userPIN == inserirPIN){
            
            System.out.println("PIN correto. Você tem permissão para entrar na conta");
        }


        while ( userPIN != inserirPIN){
            System.out.println("PIN incorreto,Digite um PIN que seja valido ");
            inserirPIN = tecladoScanner.nextDouble();
            if (inserirPIN == userPIN ){
                System.out.println("PIN correto,Você tem permissão para entrar na conta");

            }
        
        }

        tecladoScanner.close();
        
        
        sc.close();
        }

    }

