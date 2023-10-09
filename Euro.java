package trabalhoUninter;

//CLASSE EXTENDS "FILHA" DA CLASSE MOEDA 
public class Euro extends Moeda{

	// CONSTRUTOR DA CLASSE EURO COM VALOR INICIAL
	public Euro(double primeiroValor) {
		this.valor = primeiroValor;	
	}

	// MÉTODO INFO DA CLASSE PAI Moeda
	@Override
	public void info() {
		System.out.println("Euro -> " + valor);
	}

	// MÉTODO CONVERTER DA CLASSE PAI Moeda
	@Override
	public double converter() {
		return this.valor * 5.36; // CONVERSÃO DO VALOR COM O EURO ATUAL
	}
	
	// MÉTODO EQUALS PARA COMPARAR SE DOIS OBJETOS SÃO IGUAIS
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Euro objetoEuro = (Euro) objeto;
		
		if(this.valor != objetoEuro.valor) {
			return false;
		}
		
		return true;
	}

}
