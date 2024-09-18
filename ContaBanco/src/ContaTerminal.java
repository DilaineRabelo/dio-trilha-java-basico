import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o osso usuário
        //Obter pela classe scanner os valore digitados no terminal
        //Exibir a mensagem final

        String nomeCliente = "";
        String agencia = "";
        int numero = 0;
        float saldo = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = ler.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = ler.nextLine();
        System.out.println("Por favor, digite o número da conta!");
        numero = ler.nextInt();
        System.out.println("Por favor, digite o saldo!");
        saldo = ler.nextFloat();

        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", seu saldo é de R$" + saldo + " e já está disponível para saque\".");
    }
}
