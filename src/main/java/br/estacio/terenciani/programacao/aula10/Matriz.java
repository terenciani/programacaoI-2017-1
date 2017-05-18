/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aula10;

/**
 *
 * @author Marcelo
 */
public class Matriz {

    //visibilidade tipoRetorno nomeMetodo (tipos parametros){}
    public void imprimeMatriz(int quantidadeLinhas,
            int quantidadeColunas, int[][] matriz) {

        for (int i = 0; i < quantidadeLinhas; i++) {
            for (int j = 0; j < quantidadeColunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public int[][] somaDuasMatrizes(int quantidadeLinhas,
            int quantidadeColunas, int[][] matrizA, int[][] matrizB) {
        int[][] matrizC;
        matrizC = new int[quantidadeLinhas][quantidadeColunas];
        for (int i = 0; i < quantidadeLinhas; i++) {
            for (int j = 0; j < quantidadeColunas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }

}
