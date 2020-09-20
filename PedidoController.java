
public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setNfe (Integer nfe) {
		model.setNfe(nfe);
	}
	
	public Integer getNfe() {
		return model.getNfe();
	}
	
	public void setData_emissao (String data) {
		model.setData_emissao(data);
	}
	
	public String getData_emissao() {
		return model.getData_emissao();
	}
	
	public void setStatusPedido (String pedido) {
		model.setStatus_pedido(pedido);
	}
	
	public String getStatus_pedido() {
		return model.getStatus_pedido();
	}
	
	public void setValor_total (Float valor) {
		model.setValor_total(valor);
	}
	
	public Float getValor_total() {
		return model.getValor_total();
	}
	
	public void updateView() {
		view.imprimePedido(model.getNfe(), model.getData_emissao(), model.getValor_total(), model.getStatus_pedido());
	}

}
