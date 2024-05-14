package Agenda06_DS_I;

import javax.swing.JOptionPane; // importando o JOtionPane da Biblioteca Java

public class ValeCardControleIPVA {
	public static void main(String[] args) {

		int NumeroPlaca; // Criação de uma Vairavel tipo Inteiro Responsavel pelo numero da Placa
		String MensagemPagamento; // Criaçao de Varivel String Forma de Pagamento(Exibira um mensagem)
		String Propietario; // Variavel Tipo String Proprietario(Nome do Dono do Veiculo)

		Propietario = JOptionPane.showInputDialog("Digite o seu Nome: "); // caixa de dialogo para inserçao do Nome
		NumeroPlaca = Integer.parseInt(JOptionPane.showInputDialog("Digite o ultimo numero da Placa do seu Veiculo: ")); // caixa de dialogo para inserção do numero final da placa

		MensagemPagamento = "Olá" + Propietario // mensagem que sera Exibida apos inserção dos dados fornecidos
				+ " Após nos fornecer o número final da placa do seu veículo \n" // | ->
				+ "estaremos prontos para orientá-lo sobre as formas de pagamento disponíveis: \n" // | ->
				+ " - Pagamento Online \n " + "- Boleto Bancario \n " + "- Débito Automático \n "
				+ "- Atendimento Presencial"; // | ->

		switch (NumeroPlaca) { // introdução do Switch nova dinamica do If Else | -> chamando a variavel tipo
								// Inteiro "NumeroPlaca"
		case 1: { // se o final da placa do carro for 1 Devera aparecer uma mensagem

			JOptionPane.showMessageDialog(null, "Voce Devera Pagar seu IPVA até: \n --> 30/04 (Trinta de abril)"); // mensagem dizendo o respectivo dia do IPVA a ser pago
			JOptionPane.showMessageDialog(null, MensagemPagamento); // mensagem da linha de codigo "Forma de Pagamento", aparecerá quando for finalizado o campo de preechimento de informações

			break; // quebra de linha para que o Case nao fique percorendo toda a extensão
		}
		case 2: { // se o final da placa do carro for 2 Devera aparecer uma mensagem

			JOptionPane.showMessageDialog(null, "Voce Devera Pagar seu IPVA até: \n --> 31/05 (Trinta e Um de Maio)"); // mensagem dizendo o respectivo dia do IPVA a ser pago
			JOptionPane.showMessageDialog(null, MensagemPagamento); // mensagem da linha de codigo "Forma de Pagamento", aparecerá quando for finalizado o campo de preechimento de informações

			break; // quebra de linha para que o Case nao fique percorendo toda a extensão
		}
		case 3: { // se o final da placa do carro for 3 Devera aparecer uma mensagem

			JOptionPane.showMessageDialog(null, "Voce Devera Pagar seu IPVA até: \n --> 30/06 (Trinta de Junho"); // mensagem dizendo o respectivo dia do IPVA a ser pago
			JOptionPane.showMessageDialog(null, MensagemPagamento); // mensagem da linha de codigo "Forma de Pagamento", aparecerá quando for finalizado o campo de preechimento de informações

			break; // quebra de linha para que o Case nao fique percorendo toda a extensão
		}
		case 4: { // se o final da placa do carro for 4 Devera aparecer uma mensagem

			JOptionPane.showMessageDialog(null, "Voce Devera Pagar seu IPVA até: \n --> 31/07 (Trinta e Um de Julho"); // mensagem dizendo o respectivo dia do IPVA a ser pago
			JOptionPane.showMessageDialog(null, MensagemPagamento); // mensagem da linha de codigo "Forma de Pagamento", aparecerá quando for finalizado o campo de preechimento de informações

			break; // quebra de linha para que o Case nao fique percorendo toda a extensão
		}
		case 5: { // se o final da placa do carro for 5 Devera aparecer uma mensagem

			JOptionPane.showMessageDialog(null, "Voce Devera Pagar seu IPVA até: \n --> 31/08 (Trinta e Um de Agosto)"); // mensagem dizendo o respectivo dia do IPVA a ser pago
			JOptionPane.showMessageDialog(null, MensagemPagamento); // mensagem da linha de codigo "Forma de Pagamento", aparecerá quando for finalizado o campo de preechimento de informações

			break; // quebra de linha para que o Case nao fique percorendo toda a extensão
		}
		case 6: {  // se o final da placa do carro for 6 Devera aparecer uma mensagem

			JOptionPane.showMessageDialog(null, "Voce Devera Pagar seu IPVA até: \n --> 30/09 (Trinta de Setembro)"); // mensagem dizendo o respectivo dia do IPVA a ser pago
			JOptionPane.showMessageDialog(null, MensagemPagamento); // mensagem da linha de codigo "Forma de Pagamento", aparecerá quando for finalizado o campo de preechimento de informações

			break; // quebra de linha para que o Case nao fique percorendo toda a extensão
		} 
		case 7: {  // se o final da placa do carro for 7 Devera aparecer uma mensagem

			JOptionPane.showMessageDialog(null, "Voce Devera Pagar seu IPVA até: \n --> 31/10 (Trinta e Um de Outubro"); // mensagem dizendo o respectivo dia do IPVA a ser pago
			JOptionPane.showMessageDialog(null, MensagemPagamento); // mensagem da linha de codigo "Forma de Pagamento", aparecerá quando for finalizado o campo de preechimento de informações

			break; // quebra de linha para que o Case nao fique percorendo toda a extensão
		}
		case 8: {  // se o final da placa do carro for 8 Devera aparecer uma mensagem

			JOptionPane.showMessageDialog(null, "Voce Devera Pagar seu IPVA até: \n --> 30/11 (Trinta de Novembro)"); // mensagem dizendo o respectivo dia do IPVA a ser pago
			JOptionPane.showMessageDialog(null, MensagemPagamento); // mensagem da linha de codigo "Forma de Pagamento", aparecerá quando for finalizado o campo de preechimento de informações

			break; // quebra de linha para que o Case nao fique percorendo toda a extensão
		}
		case 0, 9: {  // se o final da placa do carro for 0 ou 9 Devera aparecer uma mensagem

			JOptionPane.showMessageDialog(null,
					"Voce Devera Pagar seu IPVA até: \n --> 31/12 (Trina e Um de Dezembro)"); // mensagem dizendo o respectivo dia do IPVA a ser pago
			JOptionPane.showMessageDialog(null, MensagemPagamento); // mensagem da linha de codigo "Forma de Pagamento", aparecerá quando for finalizado o campo de preechimento de informações
			break; // quebra de linha para que o Case nao fique percorendo toda a extensão
		}
		default:
			JOptionPane.showMessageDialog(null, "Por favor verifique Denovo as Informações \nERRO"); // mensagem de Erro caso as infomaçoes estiverem errada enao apareceraa mensagem "Forma de Pagamento"
		}

	}

}
// Fim do programa :D