
public class Pedido {
	private Integer nfe;
	private String data_emissao;
	private Float valor_total;
	private String status_pedido;
	private Integer fk_cliente;
	
	public Integer getNfe() {
		return nfe;
	}
	public void setNfe(Integer nfe) {
		this.nfe = nfe;
	}
	public String getData_emissao() {
		return data_emissao;
	}
	public void setData_emissao(String data_emissao) {
		this.data_emissao = data_emissao;
	}
	public Float getValor_total() {
		return valor_total;
	}
	public void setValor_total(Float valor_total) {
		this.valor_total = valor_total;
	}
	public String getStatus_pedido() {
		return status_pedido;
	}
	public void setStatus_pedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}
	public Integer getFk_cliente() {
		return fk_cliente;
	}
	public void setFk_cliente(Integer fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
}
