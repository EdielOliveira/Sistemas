package Agenda10_DS_I;

import javax.swing.JOptionPane; // Importa a classe JOptionPane do pacote javax.swing

public class SomaMatriz { // Declaração da classe SomaMatriz
    public static void main(String[] args) { // Declaração do método principal
        int[][] matriz = new int[3][3]; // Declaração e inicialização de uma matriz 3x3 de inteiros

        // Solicitar a digitação dos valores para preencher a matriz
        JOptionPane.showMessageDialog(null, "Digite os valores para preencher a matriz 3x3:"); // Exibe uma mensagem de diálogo
        for (int i = 0; i < 3; i++) { // Loop para percorrer as linhas da matriz
            for (int j = 0; j < 3; j++) { // Loop para percorrer as colunas da matriz
                String input = JOptionPane.showInputDialog(null, "Digite o valor para a posição [" + i + "][" + j + "]:"); // Solicita entrada do usuário através de uma janela de diálogo
                matriz[i][j] = Integer.parseInt(input); // Converte a entrada do usuário para inteiro e atribui à posição correspondente na matriz
            }
        }

        // Calcular a soma de todos os elementos da matriz
        int soma = 0; // Inicializa a variável soma
        for (int i = 0; i < 3; i++) { // Loop para percorrer as linhas da matriz
            for (int j = 0; j < 3; j++) { // Loop para percorrer as colunas da matriz
                soma += matriz[i][j]; // Adiciona o valor da posição atual da matriz à variável soma
            }
        }

        // Construir a string com a matriz para exibição
        StringBuilder matrizStr = new StringBuilder(); // Declaração de um StringBuilder para construir a representação da matriz em forma de string
        matrizStr.append("Matriz 3x3 inserida:\n"); // Adiciona uma linha de cabeçalho à representação da matriz
        for (int i = 0; i < 3; i++) { // Loop para percorrer as linhas da matriz
            for (int j = 0; j < 3; j++) { // Loop para percorrer as colunas da matriz
                matrizStr.append(matriz[i][j]).append(" "); // Adiciona o valor da posição atual da matriz à representação da matriz
            }
            matrizStr.append("\n"); // Adiciona uma quebra de linha ao final de cada linha da matriz
        }

        // Exibir a matriz e a soma dos elementos
        JOptionPane.showMessageDialog(null, matrizStr.toString() + "\nA soma de todos os elementos da matriz é: " + soma); // Exibe uma mensagem de diálogo com a representação da matriz e a soma dos elementos
    }
}