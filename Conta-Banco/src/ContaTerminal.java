import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        int conta = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Qual valor deseja depositar?");
        double saldo = sc.nextDouble();
       
    
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " + "Sua Agência: " + agencia + "  Conta: " + conta + " e seu saldo:"+ saldo +  " Já disponível para saque.");

        sc.close();
    }
}

