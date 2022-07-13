package me.dio.models;

public class Vendedor extends FuncionarioCLT implements CalcularBonificacao{

    private Double valorBonificacao;

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
     this.valorBonificacao = super.getValorSalario() * porcentagemBonificacao/100d;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorBonificacao=" + valorBonificacao +
                '}';
    }
}
