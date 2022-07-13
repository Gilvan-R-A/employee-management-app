package me.dio.models;

public class FuncionarioPJ {

    private String nome;
    private String documento;
    private Double horasTrabalhadas;
    private Double valorHora;
    private Double valorRemuneracao;
    private Endereco complemento;

    public void calculaRemuneracao(){
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    public Endereco getComplemento() {
        return complemento;
    }

    public void setComplemento(Endereco complemento) {
        this.complemento = complemento;
    }


}
