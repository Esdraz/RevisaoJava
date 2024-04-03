package fundamentos;

import java.util.Scanner;

public class DesafioOpIgualdadeLogicos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um ano (ex: 1991): ");
        int ano = input.nextInt();

/*        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {

            System.out.println("O ano é Bissexto");
        } else {
            System.out.println("O ano não é Bissexto");
        }*/

        boolean anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
        System.out.printf("Ano Bissexto: %b%n", anoBissexto);

        input.close();
    }
}
