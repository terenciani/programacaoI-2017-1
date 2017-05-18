/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aula10.matriz;

/**
 *
 * @author Marcelo
 */
public class Matriz {

    public void imprime(int[][] matriz, int m, int n) {
        for (int i = 0; i < m; i++) {
            System.out.println("\n");
            for (int j = 0; j < n; j++) {
                System.out.println(matriz[i][j] + " ");
            }
        }
    }

    public int[][] soma(int[][] matrizA, int[][] matrizB, int m, int n) {
        int[][] matriz;
        matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matriz;
    }

    public int[][] multiplica(int[][] matrizA, int[][] matrizB, int m, int n) {
        int[][] matrizC;
        matrizC = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int soma = 0;
                for (int k = 0; k < n; k++) {
                    soma = soma + (matrizA[i][k] * matrizB[k][j]);
                }
                matrizC[i][j] = soma;
            }
        }
        return matrizC;
    }
}
