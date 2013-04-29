package model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import util.Math;


public class NotaFiscal {
	
	private Cliente cliente;
	private NumberFormat formatadorDinheiro = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
	private Date data;
	
	public NotaFiscal(){}
	
	public NotaFiscal(Cliente cliente){
		this.cliente = cliente;
	}
	
	public void imprimeDetalhes(){
		
		data = new Date(System.currentTimeMillis());
		SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");  
		System.out.println("Data: " + formatadorData.format(data));
		
		for (int i=0; i < cliente.getPedidos().size(); i++){
			Pedido pedido = cliente.getPedidos().get(i);
			if(pedido.getProduto().getImposto() > 0){
				System.out.println(pedido.getQuantidade() + " " + pedido.getProduto().getNome() + " " + formatadorDinheiro.format(pedido.getProduto().getValor()) + "(unidade)");
			}
		}
		System.out.println("");
		System.out.println("Valor: " + formatadorDinheiro.format(getValorBruto()));
		System.out.println("Impostos: " + formatadorDinheiro.format(getValorImposto()));
		
	}
	
	public Double getValorBruto(){
		Double valor = (double) 0;
		for (int i=0; i < cliente.getPedidos().size(); i++){
			Pedido pedido = cliente.getPedidos().get(i);
			if(pedido.getProduto().getImposto() > 0){
				valor += pedido.getProduto().getValor() * pedido.getQuantidade() + Math.calculaImposto(pedido.getProduto().getValor() * pedido.getQuantidade(), pedido.getProduto().getImposto());
			}
		}
		return valor;
	}
	
	public Double getValorImposto(){
		Double valor = (double) 0;
		for (int i=0; i < cliente.getPedidos().size(); i++){
			Pedido pedido = cliente.getPedidos().get(i);
			if(pedido.getProduto().getImposto() > 0){
				valor += Math.calculaImposto(pedido.getProduto().getValor() * pedido.getQuantidade(), pedido.getProduto().getImposto());
			}
		}
		return valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
