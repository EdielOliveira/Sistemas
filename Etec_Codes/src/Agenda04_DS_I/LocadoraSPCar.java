package Agenda04_DS_I;

import java.util.Scanner;

public class LocadoraSPCar {
	public static void main(String[] args) {
		// olá!! Aqui criei a Solicitação do Scanner para a entrada e iserção de Dados
		Scanner scanner = new Scanner(System.in);

		// Solicitando e leitura dos dados
		System.out.print("Digite o modelo do carro alugado: ");
		String modeloCarro = scanner.nextLine();

		System.out.print("Digite o valor da diária para locação: ");
		double valorDiaria = scanner.nextDouble();

		System.out.print("Digite a quantidade de dias de locação: ");
		int quantidadeDias = scanner.nextInt();

		System.out.print("Digite a quantidade de Km percorridos: ");
		double quantidadeKm = scanner.nextDouble();

		// finalizei o Sacnner cumprindo as exigencias da atividade
		scanner.close();

		// Cálculo do preço total a pagar(usei o Double)
		double precoTotal = calcularPrecoTotal(valorDiaria, quantidadeDias, quantidadeKm);

		// Exibição dos resultados
		System.out.println("\nResumo do Aluguel:");
		System.out.println("Modelo do carro: " + modeloCarro);
		System.out.println("Valor total a pagar: R$" + precoTotal);
		System.out.println("Obrigado por usar o nosso meio!");
	}

	// Função para calcular o preço total
	public static double calcularPrecoTotal(double valorDiaria, int quantidadeDias, double quantidadeKm) {
		// Cálculo do preço total
		double precoDiarias = valorDiaria * quantidadeDias;
		double precoKm = 0.20 * quantidadeKm;
		double precoTotal = precoDiarias + precoKm;

		return precoTotal;
	}
}
