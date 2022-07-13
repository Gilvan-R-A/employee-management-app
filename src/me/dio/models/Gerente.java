package me.dio.models;

public class Gerente extends FuncionarioPJ implements CalcularBonificacao {

    private Double valorBonificacao;

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * porcentagemBonificacao/100) + 100d;
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", complemento=" + super.getComplemento() +
                ", valorBonificação=" + this.valorBonificacao +
                '}';
    }





}
