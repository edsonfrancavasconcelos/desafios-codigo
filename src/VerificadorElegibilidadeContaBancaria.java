// Importação da classe Scanner
import java.util.Scanner;

public class VerificadorElegibilidadeContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite sua idade
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        if(idade >= 18) {
            System.out.println("Você está elegível para criar uma conta bancária.");
        }else  {// Verifica se a idade é maior ou igual a 18
            System.out.println("Você não está elegível para criar uma conta bancária.");
        } 
        

        scanner.close();
    }
}