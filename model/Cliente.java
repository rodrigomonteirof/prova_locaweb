package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
	
	private Long id;
	private String nome;
	private String email;
	private String cpfCnpj;
	private Date dataCadastro;
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public Cliente(){ }
	
	public Cliente (Long id, String nome, String email, String cpfCnpj, Date dataCadastro){
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfCnpj = cpfCnpj;
		this.dataCadastro = dataCadastro;
	}
	
	public void adicionarPedido(Pedido pedido){
		pedidos.add(pedido);
	}
	
	public void imprimeDetalhes(){
		System.out.println("Nome=" + nome + ", E-mail=" + email + ", CPF/CNPJ=" + cpfCnpj + ", Data De Cadastro=" + dataCadastro);
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", cpfCnpj=" + cpfCnpj + ", dataCadastro=" + dataCadastro
				+ ", pedidos=" + pedidos + "]";
	}

}
