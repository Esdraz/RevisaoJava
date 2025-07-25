package poo.desafio525;

public class Main {

    public static void main(String[] args) {

        FolhaPagamento folha = new FolhaPagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Joao Pedro";
        funcionario.qtdeFilhos = 1;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.qtdeHorasNormais = 40;
        contrato.qtdeHorasExtras = 10;
        contrato.valorHoraNormal = 40.0;
        contrato.valorHoraExtra = 75.0;
        contrato.funcionario = funcionario;

        Holerite holeriteFuncionario = folha.calcularSalario(contrato);

        holeriteFuncionario.imprimir();
    }
}
