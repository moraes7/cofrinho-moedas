package trabalhoUninter;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas; // LISTA DE MOEDAS ARMAZENADAS NO COFRINHO
	
	// CONSTRUTOR COFRINHO
	public Cofrinho() {
		this.listaMoedas = new ArrayList(); 
	}
	
	// MÉTODO PARA ADICIONAR UMA MOEDA NA LISTA
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	// MÉTODO PARA REMOVER UMA MOEDA DA LISTA
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	// MÉTODO PARA LISTAR AS MOEDAS NO COFRINHO
	public void listagemMoedas() {
		if(this.listaMoedas.isEmpty()) {
			System.out.println("O cofrinho está vazio!"); // PRINT EXIBIDO CASO O COFRINHO ESTEJA VAZIO
			return;
		}
		for(Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}

	// MÉTODO PARA CONVERTER O TOTAL DO VALOR DAS MOEDAS
	public double totalConvertido() {
		double valorAcumulado = 0;
		
		for(Moeda moeda : this.listaMoedas) {
			valorAcumulado += moeda.converter(); // ACUMULA O VALOR CONVERTIDO
		}
		
		if(this.listaMoedas.isEmpty()) {
			return 0; // RETORNA 0 SE O COFRINHO ESTIVER VAZIO
		}
		
		return valorAcumulado; // RETORNA O VALOR TOTAL ACUMULADO
		
	}
	
	
}
