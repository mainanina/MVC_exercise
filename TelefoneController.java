
public class TelefoneController {
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setDDD (String ddd) {
		model.setDDD(ddd);
	}
	
	public String getDDD() {
		return model.getDDD();
	}
	
	public void setNumTelefone (String numero) {
		model.setNumero(numero);
	}
	
	public String getNumTelefone() {
		return model.getNumero();
	}
	
	public void updateView() {
		view.imprimeTelefone(model.getDDD(), model.getNumero());
	}

}
