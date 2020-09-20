
public class PedidoView {
	public void imprimePedido(Integer nfe, String data_emissao, Float valor_total, String status_pedido) {
		System.out.println("Resumo do pedido: ");
		System.out.println("NFE: " + nfe);
		System.out.println("Data de Emissão: " + data_emissao);
		System.out.println("Valor Total R$: " + valor_total);
		System.out.println("Status do Pedido: " + status_pedido);
	}
}
