import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*
         * Declaracao de atributos
        */
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.05;
        Scanner scanner = new Scanner(System.in);

        /*
         * Entrada de dados do usuario
         */
        System.out.println("Bem-vindo!");
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.next();
        System.out.print("Agora, digite o número da Conta: ");
        numero = scanner.nextInt();
        System.out.print("Informe o nome do cliente: ");
        nomeCliente = scanner.next();

        /*
         * Imprimindo valores
         */
        String mensagem = "Olá %s, obrigado por criar uma conta em" +
        " nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f" +
        " já está disponível para saque";
        System.out.println(String.format(
            mensagem, nomeCliente, agencia, numero, saldo
            ));
    }
}
