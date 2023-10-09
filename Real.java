package trabalhoUninter;

// CLASSE EXTENDS "FILHA" DA CLASSE MOEDA 
public class Real extends Moeda{
	
	// CONSTRUTOR DA CLASSE REAL COM VALOR INICIAL
	public Real(double primeiroValor) {
		this.valor = primeiroValor;	// DEFINE O VALOR MOEDA REAL COM O VALOR INFORMADO
	}
	
	// MÉTODO INFO DA CLASSE PAI Moeda
	@Override
	public void info() {
		System.out.println("Real -> " + valor); // EXIBE AS INFORMAÇÕES DO VALOR EM REAL
		
	}
	
	// MÉTODO CONVERTER DA CLASSE PAI Moeda
	@Override
	public double converter() {
		return this.valor; // RETORNA O VALOR REAL SEM CONVERSÃO
	}
	
	// MÉTODO EQUALS PARA COMPARAR SE DOIS OBJETOS SÃO IGUAIS
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false; // VERIFICA SE O OBJETO PASSADO COMO PARÂMETRO NÃO É UMA INSTANCIA DE REAL
		}
		
		Real objetoReal = (Real) objeto; // CONVERTE O OBJETO PASSADO PARA O TIPO REAL
		
		if(this.valor != objetoReal.valor) {
			return false; // VERIFICA SE OS VALORES DAS MOEDAS SÃO DIFERENTES
		}
		
		return true; //  RETORNA TRUE SE AS MOEDAS POSSUEM O MESMO VALOR
	}
	
}
