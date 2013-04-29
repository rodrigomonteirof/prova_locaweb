package teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Cliente;
import model.Pedido;
import model.Produto;

public class Teste {
	
	Produto hospedagem = new Produto( (long)1, "Hospedagem de Site", 29.90, (double) 0);
	Produto cloud = new Produto( (long)2, "Servidor Cloud", 299.90, (double) 5);
	Produto loja = new Produto( (long)3, "Loja Virtual", 49.90, (double) 5);
	
	Pedido pedido1 = new Pedido(hospedagem, 2);
	Pedido pedido2 = new Pedido(cloud, 10);
	Pedido pedido3 = new Pedido(loja, 21);
	
	public List<Cliente> getClientes(){
		List<Cliente> clientes = new ArrayList<Cliente>();  
		@SuppressWarnings("deprecation")
		Date data = new Date(2013,04,27);
		
		Cliente cliente = new Cliente((long) 1 ,"Rodrigo Monteiro Ferreira", "rodrigomonteirof@gmail.com", "357.961.958-67", data);
		cliente.adicionarPedido(pedido1);
		cliente.adicionarPedido(pedido2);
		cliente.adicionarPedido(pedido3);
		clientes.add(cliente);
		
		Cliente cliente1 = new Cliente((long) 2 ,"Mauricio Martins Ferreira", "mauriciomartinsf@gmail.com", "357.961.958-68", data);
		cliente1.adicionarPedido(pedido2);
		clientes.add(cliente1);
		
		Cliente cliente2 = new Cliente((long) 3 ,"Luzia Aparecida Monteiro", "luziaaparecidamonteiro@gmail.com", "357.961.958-69", data);
		cliente2.adicionarPedido(pedido3);
		clientes.add(cliente2);
		
		return clientes;
	}
	
	

}
