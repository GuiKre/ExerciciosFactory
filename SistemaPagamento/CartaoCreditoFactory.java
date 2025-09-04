public class CartaoCreditoFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new CartaoCredito("1234 5678 9012 3456");
    }
}