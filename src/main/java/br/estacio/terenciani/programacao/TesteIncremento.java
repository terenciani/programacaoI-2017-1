/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao;

/**
 *
 * @author Marcelo
 */
public class TesteIncremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prefixo;
        int sufixo;
        
        int numero = 5;
        
        prefixo = ++numero;
        System.out.println("Número apos prefixo: " + numero);
        
        sufixo = numero++;
        
        System.out.println("Número apos sufixo: " + numero);
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Sufixo: " + sufixo);
        
        int  a = 5;
        int x = a++;
        System.out.println("X: " + x);
        
        int  b = 5;
        x = ++b;
        System.out.println("X: " + x);
        
    }
    
}
