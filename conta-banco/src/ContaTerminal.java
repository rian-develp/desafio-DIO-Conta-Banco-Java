import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Qual o número da sua conta? ");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual a sua agência? ");
        String agencia = scanner.next();

        System.out.println("Qual seu nome completo? ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor insira seu saldo: ");
        double saldo = scanner.nextDouble();
         
        System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é :" +
        agencia + ", conta: " + numeroConta + " e seu saldo: " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
