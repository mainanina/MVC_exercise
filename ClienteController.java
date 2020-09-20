
public class ClienteController {
	private Cliente model;
	private ClienteView view;
	
	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setNomeCliente (String nome) {
		model.setNome(nome);
	}
	
	public String getNomeCliente() {
		return model.getNome();
	}
	
	public void setID_cliente (Integer id) {
		model.setId_cliente(id);
	}
	
	public Integer getID_cliente() {
		return model.getId_cliente();
	}
	
	public void setCPFCliente (String cpf) {
		model.setCPF(cpf);
	}
	
	public String getCPFCliente() {
		return model.getCPF();
	}
	
	public void setRGCliente (String rg) {
		model.setRG(rg);
	}
	
	public String getRGCliente() {
		return model.getRG();
	}
	
	public void setEmailCliente (String mail) {
		model.setEmail(mail);
	}
	
	public String getEmailCliente() {
		return model.getEmail();
	}
	
	public void setDNCliente (String dn) {
		model.setDN(dn);
	}
	
	public String getDNCliente() {
		return model.getDN();
	}
	
	
	public void updateView() {
		view.imprimeCliente(model.getId_cliente(), model.getNome(), model.getCPF(), model.getRG(), model.getEmail(), model.getDN());
	}

}
