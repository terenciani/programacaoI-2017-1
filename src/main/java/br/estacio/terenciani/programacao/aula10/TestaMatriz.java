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
public class TestaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizA;
        matrizA = new int[2][2];
        
        int[][] matrizB;
        matrizB = new int[2][2];
        
        int[][] matrizResultante;
        matrizResultante = new int[2][2];
        
        
        //Dados de teste para a matriz
        matrizA[0][0] = 10;
        matrizA[1][0] = 7;
        matrizA[0][1] = 5;
        matrizA[1][1] = 9;
        
        matrizB[0][0] = 2;
        matrizB[1][0] = 4;
        matrizB[0][1] = 3;
        matrizB[1][1] = 5;
        
        Matriz gerenciadorDeMatriz = new Matriz();
        System.out.println("Matriz A");
        gerenciadorDeMatriz.imprimeMatriz(2, 2, matrizA);
        
        System.out.println("Matriz B");
        gerenciadorDeMatriz.imprimeMatriz(2, 2, matrizB);
        
        
        matrizResultante = 
                gerenciadorDeMatriz.somaDuasMatrizes(2, 2, matrizA, matrizB);
        
        System.out.println("Matriz resultante");
        gerenciadorDeMatriz.imprimeMatriz(2, 2, matrizResultante);
    }
    
}
