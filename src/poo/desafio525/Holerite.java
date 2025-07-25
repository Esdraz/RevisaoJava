package poo.desafio525;

public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    void imprimir() {
        System.out.println("--------- Holerite ---------");
        System.out.println("Funcionário: " + funcionario.nome);
        System.out.println("Horas Normais: R$" + valorTotalHorasNormais);
        System.out.println("Horas Extras: R$" + valorTotalHorasExtras);
        System.out.println("Adicional Filhos: R$" + valorAdicionalFilhos);
        System.out.println("----------------------------");
        System.out.println("TOTAL A PAGAR: R$" + calcularValorTotal());
        System.out.println("----------------------------");
    }
}
