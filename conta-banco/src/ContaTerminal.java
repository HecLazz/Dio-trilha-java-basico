import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0d;
        System.out.println("----------------------------------------------");
        System.out.println("Digite seu nome por favor:");
        nomeCliente = ler.nextLine();

        System.out.println("\nPor favor, digite o número da Agência!");
        agencia = ler.nextLine();

        System.out.println("\nAgora o número da conta:");
        numero = ler.nextInt();

        System.out.println("\nInforme o saldo:");
        saldo = ler.nextDouble();
        System.out.println("----------------------------------------------");

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        ler.close();
    }
}
