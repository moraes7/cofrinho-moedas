package trabalhoUninter;

import java.util.Scanner;

// CLASSE MenuCofrinho
public class MenuCofrinho {
	
	private Cofrinho cofrinhoMoeda; // OBJETO PARA ARMAZENAR AS MOEDAS
	private Scanner input; // OBJETO SCANNER PARA LEITURA DE ENTRADA
	
	// CONSTRUTOR DA CLASSE
	public MenuCofrinho() {
		cofrinhoMoeda = new Cofrinho(); // INICIALIZA O OBJETO
		input = new Scanner(System.in); // INICIALIZA O SCANNER
		
	}
	
	// MÉTODO PARA EXIBIR O MENU DO COFRINHO
	public void MenuMoedas() {
		System.out.println("COFRINHO: ");
		System.out.println("1) Adicionar Moeda");
		System.out.println("2) Remover Moeda");
		System.out.println("3) Listar Moedas");
		System.out.println("4) Calcular valor total convertido para Real");
		System.out.println("0) Encerrar programa");
		
		String opcao = input.next(); // LEITURA DA OPÇÃO DIGITADA 
		
		// EXECUTAR DIFERENTES BLOCOS DO CÓDIGO
		switch(opcao) {
			case "0":
				System.out.println("Encerrando o programa...");
				break;
				
			case "1":
				System.out.println("Escolha uma Moeda:");
				System.out.println("1) Real");
				System.out.println("2) Dolar");
				System.out.println("3) Euro");
				int moedaSelecionada = input.nextInt(); // LEITURA DA OPÇÃO DA MOEDA SELECIONADA
				System.out.println("Digite o valor: ");
				double moedaValor = input.nextDouble(); // LEITURA DO VALOR DA MOEDA
				System.out.println("Valor Adicionado: " + moedaValor);
				Moeda moeda = null;
				if(moedaSelecionada == 1) {
					moeda = new Real(moedaValor); // INSTÂNCIA CRIADA DA CLASSE REAL
					//cofrinhoMoeda.adicionar(moeda);	
				}else if(moedaSelecionada == 2) {
					moeda = new Dolar(moedaValor); // INSTÂNCIA CRIADA DA CLASSE DOLAR
					//cofrinhoMoeda.adicionar(moeda);	
				}else if(moedaSelecionada == 3) {
					moeda = new Euro(moedaValor); // INSTÂNCIA CRIADA DA CLASSE EURO
					//cofrinhoMoeda.adicionar(moeda);	
				}else {
					System.out.println("ERRO! Tente novamente");
					System.out.println();
					MenuMoedas();
				}
				cofrinhoMoeda.adicionar(moeda); // ADICIONA A MOEDA NO COFRINHO
				System.out.println("Moeda adicionada com sucesso!");
				System.out.println();
				MenuMoedas(); // RETORNA AO MENU
				break;
				
			case "2":
				removerMenuMoedas(); // MÉTODO PARA REMOVER MOEDA 
				MenuMoedas();
				break;
				
			case "3":
				System.out.println("Lista de moedas no Cofrinho:");
				cofrinhoMoeda.listagemMoedas(); // EXIBE A LISTA DE MOEDAS NO COFRINHO
				System.out.println();
				MenuMoedas();
				break;
				
			case "4":
				double valorTotalConvertido = cofrinhoMoeda.totalConvertido(); // CALCULA O VALOR TOTAL CONVERTIDO DAS MOEDAS
				System.out.println("O valor total convertido para real é: " + valorTotalConvertido);
				System.out.println();
				MenuMoedas();
				break;
				
			default:
				System.out.println("Opção Inválida. Digite novamente: "); // CASO O VALOR DIGITADO ESTEJA DIFERENTE DAS OPÇÕES
				MenuMoedas();
				break;
		}
		
	}
	
	// MÉTODO PARA REMOVER MOEDA DO COFRINHO PARECIDO COM O DE ADICIONAR
	public void removerMenuMoedas() {
		System.out.println("Escolha uma Moeda:");
		System.out.println("1) Real");
		System.out.println("2) Dolar");
		System.out.println("3) Euro");
		int moedaSelecionada = input.nextInt();
		System.out.println("Digite o valor: ");
		double moedaValor = input.nextDouble();
		System.out.println("Valor Removido: " + moedaValor);
		Moeda moeda = null;
		if(moedaSelecionada == 1) {
			moeda = new Real(moedaValor);
			
		}else if(moedaSelecionada == 2) {
			moeda = new Dolar(moedaValor);
			
		}else if(moedaSelecionada == 3) {
			moeda = new Euro(moedaValor);
				
		}else {
			System.out.println("ERRO! Tente novamente");
			MenuMoedas();
			System.out.println();
		}
		cofrinhoMoeda.remover(moeda); // INVÉS DE ADICIONAR, AGORA É REMOVER
		System.out.println("Moeda removida com sucesso!");
		System.out.println();
	}

}
