package fundamentos;

public class TiposDadosEOperadores {

/*
* DADOS PRIMITIVOS:
* Numéricos: byte, short, int, long, float, double.
* Caracteres: char.
* Booleanos: boolean.
*
* OPERADORES:
* Aritméticos: +, -, *, /, %.
* Relacionais: <, >, <=, >=, ==, !=.
* Lógicos: &&, ||, !.
*
* */
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
        System.out.println("Resto Divisão: " + (num1 % num2));

        boolean isTrue = true, isFalse = false;

        System.out.println("E: " + (isTrue && isFalse));
        System.out.println("OU: " + (isTrue || isFalse));
        System.out.println("Negação: " + (!isTrue));
    }
}
