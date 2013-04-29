package model;

public class Produto {
	
	private Long id;
	private String nome;
	private Double valor;
	private Double imposto;
	
	public Produto(){ }
	
	public Produto (Long id, String nome, Double valor, Double imposto){
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.setImposto(imposto);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", valor=" + valor
				+ "]";
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
}
