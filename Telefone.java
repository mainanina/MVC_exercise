
public class Telefone {
	private Integer fk_cliente;
	private String DDD;
	private String numero;
	
	public Integer getFk_cliente() {
		return fk_cliente;
	}
	public void setFk_cliente(Integer fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
	public String getDDD() {
		return DDD;
	}
	public void setDDD(String dDD) {
		DDD = dDD;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
