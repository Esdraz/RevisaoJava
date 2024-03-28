package fundamentos;

public class EstruturasDeControle {

    public static void main(String[] args) {
        int num = 10;
        int idade = 21;
        int nota = 1;
        String descricaoNota;

//        IF-ELSE
        if (num > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

//        ELSE-IF
        if (idade < 15) {
            System.out.println("Criança");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

//        SWITCH
        switch (nota) {
            case 1:
                descricaoNota = "Muito ruim";
                break;
            case 2:
                descricaoNota = "Ruim";
                break;
            case 3:
                descricaoNota = "Razoável";
                break;
            case 4:
                descricaoNota = "Muito boa";
                break;
            case 5:
            case 6:
                descricaoNota = "Excelente";
                break;
            default:
                descricaoNota = "Nota inválida";
        }
        System.out.println(descricaoNota);

//        FOR
        for (int i= 0; i < 5; i++) {
            System.out.println("Número: " + i);
        }

//        WHILE
        int count = 1;
        while (count <= 3) {
            System.out.println("Contagem: " + count);
            count++;
        }
    }
}
