package Agenda08DS_I; 

import javax.swing.JOptionPane; // Importação da classe JOptionPane do pacote javax.swing

public class CinemaAnalitics { // Declaração da classe CinemaAnalitics
    public static void main(String[] args) { // Declaração do método principal main

        int idade; // Declaração da variável idade
        int FA = 0, FB = 0, FC = 0, FD = 0, FE = 0; // Declaração e inicialização das variáveis FA, FB, FC, FD e FE
        int somaIdadeRuim = 0; // Declaração e inicialização da variável somaIdadeRuim

        String FeedBack; // Declaração da variável FeedBack

        try { // Início do bloco try para capturar exceções
            for (int i = 1; i <= 10; i++) { // Início do loop for para coletar feedback de até 40 pessoas

                idade = Integer.parseInt(JOptionPane.showInputDialog( // Exibe uma caixa de diálogo para entrada da idade do usuário
                        "Olá somos da Equipe de Cinema Analitics, gostariamos de Saber sua opnião sobre o Filme! \n \n Escreva sua Iadade: "));

                FeedBack = JOptionPane.showInputDialog( // Exibe uma caixa de diálogo para entrada do feedback do usuário sobre o filme
                        "Porfavor O que voce Achou do Filme? \n A - Ótimo   B- Bom   C - Regular   D - Ruim   E - Péssimo");

                switch (FeedBack) { // Início da estrutura switch para processar o feedback fornecido

                    case "A": // Caso o feedback seja "A" (Ótimo)
                        FA += 1; // Incrementa a contagem de feedback "Ótimo"
                        break;

                    case "B": // Caso o feedback seja "B" (Bom)
                        FB += 1; // Incrementa a contagem de feedback "Bom"
                        break;

                    case "C": // Caso o feedback seja "C" (Regular)
                        FC += 1; // Incrementa a contagem de feedback "Regular"
                        break;

                    case "D": // Caso o feedback seja "D" (Ruim)
                        FD += 1; // Incrementa a contagem de feedback "Ruim"
                        somaIdadeRuim += idade; // Soma a idade das pessoas que votaram "Ruim"
                        break;

                    case "E": // Caso o feedback seja "E" (Péssimo)
                        FE += 1; // Incrementa a contagem de feedback "Péssimo"
                        break;
                }
            }

            double PorcE = FE * 100 / 10; // Calcula a porcentagem de pessoas que votaram "Péssimo"
            double mediaIdadeRuim = 0.0; // Declaração da variável mediaIdadeRuim
            if (FD != 0) { // Verifica se há votos "Ruim"
                mediaIdadeRuim = (double) somaIdadeRuim / FD; // Calcula a média de idade das pessoas que votaram "Ruim"
            }

            JOptionPane.showMessageDialog(null, // Exibe uma caixa de diálogo com os resultados
                    "Quantidade Resposta Otimo: " + FA +
                            "\n Media de idade das pessoas que votaram Ruim: " + mediaIdadeRuim +
                            "\n Porcentagem de Pessoas que votaram Péssimo: " + PorcE + "%");

        } catch (NumberFormatException e) { // Captura exceções ao converter a idade do usuário para inteiro
            JOptionPane.showMessageDialog(null, " Apenas Numeros \n \n ERRO:404"); // Exibe uma caixa de diálogo informando que apenas números devem ser inseridos
        }
    }
}