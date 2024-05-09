import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          double saldo = 0;

          // Loop infinito para manter o programa em execução até que o usuário decida encerrar
          while (true) {
              System.out.println("Escolha uma opção:");
              System.out.println("1. Depositar");
              System.out.println("2. Sacar");
              System.out.println("3. Consultar Saldo");
              System.out.println("0. Encerrar");

              int opcao = scanner.nextInt();

              switch (opcao) {
                  case 1:
                      System.out.println("Digite o valor a ser depositado:");
                      double valorDeposito = scanner.nextDouble();
                      saldo += valorDeposito;
                      System.out.println("Depósito de " + valorDeposito + " realizado com sucesso.");
                      break;
                  case 2:
                      System.out.println("Digite o valor a ser sacado:");
                      double valorSaque = scanner.nextDouble();
                      if (valorSaque > saldo) {
                          System.out.println("Saldo insuficiente. Operação não realizada.");
                      } else {
                          saldo -= valorSaque;
                          System.out.println("Saque de " + valorSaque + " realizado com sucesso.");
                      }
                      break;
                  case 3:
                      System.out.println("Saldo atual: " + saldo);
                      break;
                  case 0:
                      System.out.println("Encerrando programa. Obrigado por utilizar nossos serviços.");
                      return; // Termina o programa
                  default:
                      System.out.println("Opção inválida. Tente novamente.");
              }
          }
        }
    }
}

