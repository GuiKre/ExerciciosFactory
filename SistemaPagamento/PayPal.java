public class PayPal implements Pagamento {

    private String emailUsuario;

    public PayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    private boolean isContaVinculada() {
        return emailUsuario != null && emailUsuario.equals("usuario@exemplo.com");
    }

    @Override
    public String processarPagamento(double valor) {
        System.out.println("Iniciando pagamento de R$ " + String.format("%.2f", valor) + " com PayPal...");
        if (isContaVinculada()) {
            return "Pagamento com PayPal no valor de R$ " + String.format("%.2f", valor) + " realizado com sucesso.";
        } else {
            return "Erro: Conta PayPal não está vinculada ao e-mail fornecido.";
        }
    }
}