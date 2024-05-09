import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = 1500.0; // Definimos um limite diário inicial de R$ 1500.0

        // Loop para iterar sobre os saques:
        while (true) {
            // Solicita ao usuário o valor do saque:
            System.out.println("Digite o valor do saque (ou digite 0 para encerrar):");
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Encerrando transações. Obrigado!");
                break; // Sai do loop
            }

            // Verifica se o valor do saque ultrapassa o limite diário:
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diário excedido. Transação não realizada.");
            } else {
                // Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                limiteDiario -= valorSaque;
                // Informa que o saque foi realizado e mostra o limite restante:
                System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso. Limite restante: R$ " + limiteDiario);
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
