package trabalhoUninter;

// CLASSE EXTENDS "FILHA" DA CLASSE MOEDA 
public class Dolar extends Moeda{
	
	// CONSTRUTOR DA CLASSE DOLAR COM VALOR INICIAL
	public Dolar(double primeiroValor) {
		this.valor = primeiroValor;	
	}
	
	// MÉTODO INFO DA CLASSE PAI Moeda
	@Override
	public void info() {
		System.out.println("Dolar -> " + valor);
		
	}
	
	// MÉTODO CONVERTER DA CLASSE PAI Moeda
	@Override
	public double converter() {
		return this.valor * 4.81; // CONVERSÃO DO VALOR COM O DOLAR ATUAL
	}
	
	// MÉTODO EQUALS PARA COMPARAR SE DOIS OBJETOS SÃO IGUAIS
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDolar = (Dolar) objeto;
		
		if(this.valor != objetoDolar.valor) {
			return false;
		}
		
		return true;
	}

}
