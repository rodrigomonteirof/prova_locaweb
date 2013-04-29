package start;

import java.util.List;

import model.Cliente;
import model.NotaFiscal;

import teste.Teste;

public class Start {
	
	public static void main(final String args[]){
		testar();
	}
	
	public static void testar(){
		Teste teste = new Teste();
		List<Cliente> clientes = teste.getClientes();
		
		for (int i=0; i < clientes.size(); i++){
			
			System.out.println("=========================");
			
			Cliente cliente = clientes.get(i);
			System.out.println("Cliente:");
			cliente.imprimeDetalhes();
			
			System.out.println("");
			
			NotaFiscal nota = new NotaFiscal(cliente);
			System.out.println("Nota fiscal:");
			nota.imprimeDetalhes();
			
			System.out.println("");
			
		}
	}
}
