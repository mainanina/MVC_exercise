
public class ProdutoView {
	public void imprimeProduto(Integer id, String nome, String descricao, Float preco) {
		System.out.println("Detalhes do Produto: ");
		System.out.println("Código do Produto: " + id);
		System.out.println("Nome do Produto: " + nome);
		System.out.println(descricao);
		System.out.println("Preço do produto R$: " + preco);
	}
}
