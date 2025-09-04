public class CriptomoedaFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new Criptomoeda(500.00);
    }
}