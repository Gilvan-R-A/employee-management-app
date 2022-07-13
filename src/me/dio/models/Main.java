package me.dio.models;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua do Horto", "Bairro do Ferroviários", "complemento");

        System.out.println(endereco);
        System.out.println("---------------------");
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Gilvan");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(2100.00);
        vendedor.setEndereco(endereco);
        vendedor.calcularBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("---------------------");
        OperadorDeCaixa operadorDeCaixa =
                new OperadorDeCaixa("Magalhães","456.123.789-00", 1000.00,endereco);
        System.out.println(operadorDeCaixa);
        System.out.println("---------------------");
        Gerente gerente = new Gerente();
        gerente.setNome("Gilvan");
        gerente.setDocumento("789.123.456-00");
        gerente.setComplemento(endereco);
        gerente.setHorasTrabalhadas(20d);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        gerente.calcularBonificacao(3d);
        System.out.println(gerente);
    }
}
