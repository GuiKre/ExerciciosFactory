public class PayPalFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PayPal("usuario@exemplo.com");
    }
}