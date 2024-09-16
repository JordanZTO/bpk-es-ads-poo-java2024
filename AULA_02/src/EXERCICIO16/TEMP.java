import java.util.Scanner;

public class TEMP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão desejada:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.print("Digite o valor da temperatura: ");
        double temperatura = scanner.nextDouble();

        switch (escolha) {
            case 1:
                double fahrenheit = celsiusParaFahrenheit(temperatura);
                System.out.println(temperatura + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
                break;
            case 2:
                double celsius = fahrenheitParaCelsius(temperatura);
                System.out.println(temperatura + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");
                break;
            default:
                System.out.println("Escolha inválida. Por favor, selecione 1 ou 2.");
                break;
        }

        scanner.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

