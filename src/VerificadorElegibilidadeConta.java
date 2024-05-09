// Importação da classe Scanner
import java.util.Scanner;

// Definição da classe VerificadorElegibilidadeConta
public class VerificadorElegibilidadeConta {

    // Método principal
    public static void main(String[] args) {
        // Inicialização do objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");

        // Leitura da idade fornecida pelo usuário
        int idade = scanner.nextInt();        

        // Verificação da elegibilidade com base na idade
        if (idade >= 18) {
            System.out.println("Você é elegível para criar uma conta bancária.");
        } else {
            System.out.println("Você não é elegível para criar uma conta bancária.");
        }

        // Fechamento do objeto Scanner para liberar recursos
        scanner.close();
    }
}
