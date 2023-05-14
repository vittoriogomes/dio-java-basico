import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String clearCode = "\033c";

        System.out.print("\nDigite o primeiro número: ");
        int firstNumber = scanner.nextInt();
        System.out.print(clearCode);

        System.out.print("Digite o segundo número: ");
        int secondNuber = scanner.nextInt();
        System.out.print(clearCode);
        scanner.close();

        try {
            count(firstNumber, secondNuber);
        } catch (ParametrosInvalidosException pie) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void count(int firstNumber, int secondNumber) throws ParametrosInvalidosException{
        if (firstNumber >= secondNumber) {
            throw new ParametrosInvalidosException();
        }

        int count = secondNumber - firstNumber;

        for (int i = 1; i <= count; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
