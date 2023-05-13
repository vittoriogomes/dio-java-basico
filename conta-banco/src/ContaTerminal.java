import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class ContaTerminal {
    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;

    public static void main(String[] args) throws Exception, IOException, InterruptedException {
        Scanner scanner  = new Scanner(System.in).useLocale(Locale.US);
        String clearCode = "\033c";

        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.print(clearCode);
        
        System.out.print("Digite a agência: ");
        agencia = scanner.next();
        System.out.print(clearCode);

        System.out.print("Digite o nome: ");
        nomeCliente = scanner.next();
        System.out.print(clearCode);

        System.out.print("Digite o saldo: ");
        saldo = scanner.nextDouble();
        System.out.print(clearCode);
        scanner.close();

        String message = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está dísponivel para saque.", nomeCliente, agencia, numero, saldo);

        System.out.println(message);
    }
}
