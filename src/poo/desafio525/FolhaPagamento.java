package poo.desafio525;

public class FolhaPagamento {

    Holerite calcularSalario(ContratoTrabalho contrato) {

        Holerite holerite = new Holerite();

        holerite.funcionario = contrato.funcionario;

        holerite.valorTotalHorasNormais = contrato.qtdeHorasNormais * contrato.valorHoraNormal;
        holerite.valorTotalHorasExtras = contrato.qtdeHorasExtras * contrato.valorHoraExtra;

        double salarioBase = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            holerite.valorAdicionalFilhos = salarioBase * 0.10;
        }

        return holerite;
    }
}
