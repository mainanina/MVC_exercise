
public class Programa_MVC_Loja {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente();
		ClienteView clv1 = new ClienteView();
		
		ClienteController clc1 = new ClienteController(cl1, clv1);
		
		clc1.setNomeCliente("Maina");
		clc1.setRGCliente("000000000-0");
		clc1.updateView();
	
	}
}
