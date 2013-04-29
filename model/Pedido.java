package model;

public class Pedido {
	
	private Produto produto;
	private Integer quantidade;
	private Double valor;
	
	public Pedido(){}
	
	public Pedido(Produto produto, Integer quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = produto.getValor();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Pedido [produto=" + produto + ", quantidade=" + quantidade
				+ "]";
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
