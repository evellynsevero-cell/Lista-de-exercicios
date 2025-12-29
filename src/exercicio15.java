import java.util.Random;

public class exercicio15 {
    public static void main(String[] args) { System.out.println("Hello and welcome!");

        double saldoAtual = 100.0 + (Math.random() * 900.0);
        System.out.printf("Saldo Inicial: R$ %.2f%n", saldoAtual);

        int opcaoTransacao = new Random().nextInt(3) + 1;
        System.out.println("Opção de Transação Escolhida (simulada): " + opcaoTransacao);

        double valorTransacao = 50.0 + (Math.random() * 150.0);
        System.out.printf("Valor da Transação (simulado): R$ %.2f%n", valorTransacao);

        switch (opcaoTransacao) {
            case 1:

                saldoAtual += valorTransacao;
                System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valorTransacao);
                System.out.printf("Novo Saldo: R$ %.2f%n", saldoAtual);
                break;
            case 2:

                if (saldoAtual >= valorTransacao) {
                    saldoAtual -= valorTransacao;
                    System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valorTransacao);
                    System.out.printf("Novo Saldo: R$ %.2f%n", saldoAtual);
                } else {

                    System.out.println("Saldo insuficiente para realizar o saque.");
                }
                break;
            case 3:
                System.out.printf("Saldo Atual: R$ %.2f%n", saldoAtual);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
