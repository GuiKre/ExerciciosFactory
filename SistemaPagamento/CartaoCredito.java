public class CartaoCredito implements Pagamento {

    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    private boolean isNumeroCartaoValido() {
        return numeroCartao != null && numeroCartao.replaceAll("\\s+", "").length() == 16;
    }

    @Override
    public String processarPagamento(double valor) {
        System.out.println("Iniciando pagamento de R$ " + String.format("%.2f", valor) + " com Cartão de Crédito...");
        if (isNumeroCartaoValido()) {
            return "Pagamento com Cartão de Crédito no valor de R$ " + String.format("%.2f", valor) + " realizado com sucesso.";
        } else {
            return "Erro: Número do cartão de crédito inválido.";
        }
    }
}