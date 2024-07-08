import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Formula formula = new Formula();


        System.out.println("diga uma temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        System.out.println("a temperatura escolhida em Fahrenheit é: " + temperaturaFahrenheit);
        formula.trasformarParaCelcius(temperaturaFahrenheit);


    }
}