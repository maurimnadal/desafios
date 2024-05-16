import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome");
        String sobrenomeCliente = scanner.next();

        System.out.println("Qual é o código da sua Agência ?");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Informe seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá ".concat(nomeCliente + " " + sobrenomeCliente) +", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) +", sua conta é "+ numero + " e seu saldo de " + saldo + "R$ já está disponível para saque.");

        
    }
}
