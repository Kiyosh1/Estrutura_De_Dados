public class ContaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;
    private String numeroConta;

    // Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
         if (valor <= 0) {
            System.out.println("Valor de saque inválido. O valor deve ser positivo.");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para consultar o saldo
    public double consultarSaldo() {
        return this.saldo;
    }

    // Método para exibir os dados da conta
    public String exibirDadosConta() {
        return String.format(
            "    Dados da Conta    \n" +
            "Titular: %s\n" +
            "Número da Conta: %s\n" +
            "Saldo Atual: R$ %.2f\n" +
            "                      ",
            this.titular, this.numeroConta, this.saldo);
    }
}
