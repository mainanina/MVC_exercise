
public class ProdutoController {
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setId_produto (Integer id) {
		model.setId_produto(id);
	}
	
	public Integer getId_produto() {
		return model.getId_produto();
	}
	
	public void setNomeProduto (String nome) {
		model.setNome(nome);
	}
	
	public String getNomeProduto() {
		return model.getNome();
	}
	
	public void setDescricao (String descricao) {
		model.setDescricao(descricao);
	}
	
	public String getDescricao() {
		return model.getDescricao();
	}
	
	public void setPrecoProduto (Float preco) {
		model.setPreco(preco);
	}
	
	public Float getPrecoProduto() {
		return model.getPreco();
	}
	

	public void updateView() {
		view.imprimeProduto(model.getId_produto(), model.getNome(), model.getDescricao(), model.getPreco());
		}
}
