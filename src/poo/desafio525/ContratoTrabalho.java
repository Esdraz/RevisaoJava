package poo.desafio525;

public class ContratoTrabalho {

    Funcionario funcionario;
    double qtdeHorasNormais;
    double qtdeHorasExtras;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean possuiAdicionalParaFilhos() {
        return funcionario != null && funcionario.possuiFilhos();
    }

}
