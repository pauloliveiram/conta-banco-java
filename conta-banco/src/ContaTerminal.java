import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM-VINDO À SIMULAÇÃO DE CONTA BANCÁRIA VIA TERMINAL");

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do titular da conta!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}