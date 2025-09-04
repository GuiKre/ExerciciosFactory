public class Criptomoeda implements Pagamento {

    private double saldoCarteira;

    public Criptomoeda(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    private boolean temSaldoSuficiente(double valorTransacao) {
        return saldoCarteira >= valorTransacao;
    }

    @Override
    public String processarPagamento(double valor) {
        System.out.println("Iniciando pagamento de R$ " + String.format("%.2f", valor) + " com Criptomoedas...");
        if (temSaldoSuficiente(valor)) {
            this.saldoCarteira -= valor;
            return "Pagamento com Criptomoedas no valor de R$ " + String.format("%.2f", valor) + " realizado com sucesso. Saldo restante: " + String.format("%.2f", saldoCarteira);
        } else {
            return "Erro: Saldo insuficiente na carteira de criptomoedas.";
        }
    }
}