
public class ClienteView {
	public void imprimeCliente(Integer id, String nome, String cpf, String rg, String email, String dn) {
		System.out.println("Cliente: ");
		System.out.println("Código do Cliente: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("E-mail: " + email);
		System.out.println("Data de Nascimetno: " + dn);
	}
}
