package Agenda05_DS_I;

import javax.swing.JOptionPane; // importando o JOption na biblioteca Java

public class SistemaDeDesconto {
	public static void main(String[] args){
		
		double ValorCompra;    // <- criação de variavel do Tipo Double
		double Desconto;       // <-|
		double ValorFinal = 0; // <-|
		
		
		// Ultilizando o novo metodo JOptionPane
		ValorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
		
		
		//criando Condições exigidas pelo Trabalho proposto
		if (ValorCompra <= 200) {                          // 1° Condição Se ValorCompra for maio ou igual a 200 Receba desconto de 5% na compra
			Desconto = ValorCompra * 0.05;                 // Desconto Recebe ValorCompra VEZES(*) o Desconto(5%)
			ValorFinal = ValorCompra - Desconto;   // Soma dos Valorese e Aplicando o Desconto
		}else {
			if (ValorCompra >= 200 && ValorCompra < 300) { // 2° Condição se ValorCompra for MAIOR ou IGUAL a 200 e MENOR que 300 receba desconto de 10% na compra
				Desconto = ValorCompra * 0.10;             // Desconto Recebe ValorCompra VEZES(*) o Desconto(10%)
				ValorFinal = ValorCompra - Desconto;   // Soma dos Valorese e Aplicando o Desconto
			}else {
				if (ValorCompra >= 300) {                  // 3° Condição Ultima Condição Se ValorCOmpra for MAIOR ou IGUAL a 300 Receba Desconto de 15% na compra
					Desconto = ValorCompra * 0.15;         // Desconto Recebe ValorCompra VEZES(*) o Desconto(15%)
					
				}	
			}
		}
		JOptionPane.showMessageDialog(null, "Valor final com Desconto aplicado: " + ValorFinal); // Mensagem Final Concatenado o "ValorFinal"
	}
	
}