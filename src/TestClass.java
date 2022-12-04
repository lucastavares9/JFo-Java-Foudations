import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        ComputeMethods calculadora = new ComputeMethods();
        
        Scanner sc = new Scanner(System.in);
        int temperatura= sc.nextInt();

        System.out.println("Conversor: " + calculadora.transF(temperatura));
        System.out.println("Hipotenusa: " + calculadora.hipotenusa(4, 8));
        System.out.println("Dados: " + calculadora.roll());
        sc.close();   
    }

}
