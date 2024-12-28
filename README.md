<h1 align="center">
   Employee Management App
</h1>

O Employee Management App é um sistema desenvolvido em Java que gerencia colaboradores de uma empresa. Ele oferece funcionalidades para cadastrar, calcular bonificações e exibir informações detalhadas sobre diferentes tipos de funcionários , como CLT e PJ.   

## Requisitos

- Sintaxe Java
- Java JDK 8+
- IDE para desenvolvimento Java

## Estrutura do Projeto   

**Pacote** me.dio.models   

O pacote contém as seguintes classes e interfaces:

- CalcularBonificacao **(Interface)**
Define o método calcularBonificacao(Double porcentagemBonificacao) para implementar o cálculo de bonificação.

- Endereco **(Classe)**
Representa o endereço de um colaborador com os atributos:

   - rua, bairro e complemento.
- FuncionarioCLT **(Classe)**
Classe base para funcionários CLT, com atributos:

   - nome, documento, valorSalario e endereco.
- FuncionarioPJ **(Classe)**
Classe base para funcionários PJ, com atributos:

   - nome, documento, horasTrabalhadas, valorHora, valorRemuneracao e complemento.
   - Método calculaRemuneracao() para calcular o valor da remuneração.
- Gerente **(Classe)**
Extende FuncionarioPJ e implementa CalcularBonificacao.
Adiciona o cálculo de bonificação com um bônus fixo de 100.

- OperadorDeCaixa **(Classe)**
Extende FuncionarioCLT.
Representa colaboradores operacionais da empresa.

- Vendedor **(Classe)**
Extende FuncionarioCLT e implementa CalcularBonificacao.
Adiciona o cálculo de bonificação com base no salário.

- Main **(Classe)**
Classe principal que demonstra:

   - Instanciação de objetos.
   - Configuração de atributos.
   - Uso de métodos das classes.   


## Funcionamento   

**Exemplo de Instanciação   

No método **main, exemplos incluem:   

### 1. Criando um Endereço:   

```   

Endereco endereco = new Endereco("Rua do Horto", "Bairro do Ferroviários", "complemento");   

```   

### 2. Criando um Vendedor e calculando bonificação:   

```   
Vendedor vendedor = new Vendedor();
vendedor.setNome("José");
vendedor.setDocumento("123.456.789-00");
vendedor.setValorSalario(2100.00);
vendedor.setEndereco(endereco);
vendedor.calcularBonificacao(2d);

```   

### 3. Criando um Gerente e calculando remuneração e bonificação:   

```   
Gerente gerente = new Gerente();
gerente.setNome("Flávia");
gerente.setDocumento("789.123.456-00");
gerente.setHorasTrabalhadas(20d);
gerente.setValorHora(100d);
gerente.calculaRemuneracao();
gerente.calcularBonificacao(3d); 

```   

## Tecnologias Utilizadas   

- **Linguagem:** Java   
- **Paradigmas:** Orientação a Objetos (Herança, Polimorfismo e Interfaces)   

## Como Executar   

1. Clone o repositório e navegue até a pasta employee-management-app.   
2. Compile o projeto:   

```   
javac -d bin src/me/dio/models/*.java

```   

3. Execute o programa:   

```   
java -cp bin me.dio.models.Main

```   

