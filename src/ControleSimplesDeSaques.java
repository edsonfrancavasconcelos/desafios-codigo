import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu saldo");

        double limiteDiario = scanner.nextDouble();

        // Loop infinito para continuar solicitando saques até que o usuário insira 0:
        while (true) {
            // Solicite ao usuário o valor do saque:
            System.out.print("Digite o valor do saque (ou 0 para encerrar): ");
            double valorSaque = scanner.nextDouble();

            // Verifique se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break; // Encerra o loop
            }

            // Verifique se o valor do saque ultrapassa o limite diário:
            if (valorSaque > limiteDiario) {
                System.out.println("O valor do saque excede o limite diário.");
                continue; // Volta ao início do loop para solicitar outro valor
            }

            // Subtraia o valor do saque do limite diário:
            limiteDiario -= valorSaque;

            // Informe que o saque foi realizado e mostre o limite restante:
            System.out.println("Saque de " + valorSaque + " realizado. Limite restante: " + limiteDiario);
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
