
public class EnderecoController {
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setLograd (String logradouro) {
		model.setLogradouro(logradouro);
	}
	
	public String getLograd() {
		return model.getLogradouro();
	}
	
	public void setBairro (String bairro) {
		model.setBairro(bairro);
	}
	
	public String getBairro() {
		return model.getBairro();
	}
	
	public void setCidade (String cidade) {
		model.setCidade(cidade);
	}
	
	public String getCidade() {
		return model.getCidade();
	}
	
	public void setEstado (String estado) {
		model.setEstado(estado);
	}
	
	public String getEstado() {
		return model.getEstado();
	}
	
	public void updateView() {
		view.imprimeEndereco(model.getLogradouro(), model.getBairro(), model.getCidade(), model.getEstado());
	}

}
