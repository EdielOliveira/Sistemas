package Agenda07_DS_I;

import javax.swing.JOptionPane; // Importa a classe JOptionPane do pacote javax.swing.

public class FeedBackTudoWeb {
	public static void main(String[] args) {

		int resposta = 0; // Declaração e inicialização de uma variável inteira chamada resposta, que será
							// usada para armazenar a resposta do usuário.
		int Fe = 0, Fb = 0, Fr = 0; // Declaração e inicialização de três variáveis inteiras Fe, Fb e Fr, que
									// representam o número de feedbacks Excelente, Bom e Ruim, respectivamente.

		for (int i = 1; i <= 10; i++) { // Inicia um loop for que vai de 1 a 10, onde cada iteração representa uma
										// pesquisa de feedback.
			resposta = Integer.parseInt(JOptionPane.showInputDialog("O Nosso Site TudoWeb, está realizando uma "
					+ "pesquisa para saber o grau de satisfação dos" + "\n nosso clientes, "
					+ "Por favor, nos avalie com: \n 1 - Excelente \n 2 - Bom \n 3 - Ruim"));// Exibe uma caixa de
																								// diálogo para o
																								// usuário inserir sua
																								// resposta (1 para
																								// Excelente,
																								// 2 para Bom, 3 para
																								// Ruim) e armazena o
																								// valor convertido para
																								// inteiro na variável
																								// resposta.

			switch (resposta) { // Inicia uma estrutura switch para determinar o que fazer com base na resposta
								// do usuário.

			case 1: // Caso a resposta seja 1 (Excelente), executa o bloco de código abaixo.

				Fe += 1; // Incrementa o contador de feedbacks Excelentes (Fe).

				break; // Sai do switch.

			case 2: // Caso a resposta seja 2 (bom), executa o bloco de código abaixo.

				Fb += 1; // Incrementa o contador de feedbacks Bons (Fb).

				break; // Sai do Switch

			case 3: // Caso a resposta seja 3 (ruim), executa o bloco de código abaixo.

				Fr += 1; // Incrementa o contador de feedbacks Ruim (Fr).

				break; // Sai do Switch

			}
		}
		JOptionPane.showMessageDialog(null, "O FeedBack foi: \n Excelente: " + Fe + "\n Ruim: " + Fr); // Exibe uma
																										// caixa de
																										// diálogo
																										// mostrando o
																										// número de
																										// feedbacks
																										// Excelentes e
																										// Ruins
																										// coletados.

	}
}