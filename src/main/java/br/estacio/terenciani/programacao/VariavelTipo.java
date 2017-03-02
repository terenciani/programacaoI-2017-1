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
public class VariavelTipo {

    /**
     * @param args the command line arguments
     */
    
   
     
    public static void main(String[] args) {
        //imprime();
        //variavel inteira chamada "x" recebe o valor 10
        int x = 10;
        //variavel inteira chamada "y" recebe o valor 4
        int y = 4;
        
        int resultado;
        
        resultado = multiplica(x,y);
        
        System.out.println("O resultado eh: " + resultado);
        
    }
    
    public static int multiplica (int x, int y){
        return x * y;
    }
    
     public static void imprime(){
        System.out.println("-----");
        System.out.println("Teste");
        System.out.println("-----");
    }
   
    
}
