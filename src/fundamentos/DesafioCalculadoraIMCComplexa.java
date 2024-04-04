package fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraIMCComplexa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();
        input.nextLine();

        System.out.print("Digite o seu sexo: ");
        String sexo = input.nextLine();

        double resultado = peso / (altura * altura);

        System.out.printf("%.2f", resultado);

        input.close();
    }
}
