public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        System.out.println("Pagamento por Cartão de Crédito");
        service.processarPagamento(new CartaoCreditoFactory(), 150.00);

        System.out.println("Pagamento por PayPal");
        service.processarPagamento(new PayPalFactory(), 75.00);

        System.out.println("Pagamento por Criptomoeda (saldo suficiente)");
        service.processarPagamento(new CriptomoedaFactory(), 300.00);
        
        System.out.println("Pagamento por Criptomoeda (saldo insuficiente)");
        PagamentoFactory criptoFactory = new CriptomoedaFactory();
        Pagamento criptoPagamento = criptoFactory.criarPagamento();
        System.out.println(criptoPagamento.processarPagamento(400.00));
        System.out.println(criptoPagamento.processarPagamento(150.00));
        System.out.println("----------------------------------------");
    }
}