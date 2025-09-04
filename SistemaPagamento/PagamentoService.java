public class PagamentoService {

    public void processarPagamento(PagamentoFactory factory, double valor) {
        Pagamento metodoPagamento = factory.criarPagamento();

        String resultado = metodoPagamento.processarPagamento(valor);

        System.out.println(resultado);
        System.out.println("----------------------------------------");
    }
}