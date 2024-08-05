import java.util.Scanner;


public class Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int number1 = scan.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int number2 = scan.nextInt();
        System.out.println();

        try {
            count(number1, number2);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void count(int number1, int number2) throws InvalidParametersException {
        if (number1 > number2) {
            throw new InvalidParametersException("O 1º numero precisa ser menor que o segundo numero!");
        }

        int count = number2 - number1;
        for (int i = 0; i <= count; i++) {
            System.out.println(number1 + i);
        }
    }
}

