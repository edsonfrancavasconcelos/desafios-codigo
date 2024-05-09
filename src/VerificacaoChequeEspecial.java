import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite o saldo disponível na conta:");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o valor do saque desejado:");
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        // Verifica se o saque não ultrapassa o saldo disponível na conta:
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else if (saque <= saldo + limiteChequeEspecial) {
            // Se o saque ultrapassar apenas o saldo disponível
            System.out.println("Transação realizada. Limite do cheque especial atingido.");
        } else {
            // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
