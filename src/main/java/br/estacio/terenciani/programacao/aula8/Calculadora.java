/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aula8;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tipo da variável + nome
        Scanner scan = new Scanner(System.in);
        double primeiroOperando, segundoOperando;
        String operacao;
        double resultado;
        
        System.out.println("Digite o primeiro operando");
        primeiroOperando = scan.nextDouble();
        
        System.out.println("Digite operador");
        operacao = scan.next();
        
        System.out.println("Digite o segundo operando");
        segundoOperando = scan.nextDouble();
        resultado=0;
        if (operacao.equals("+")){
            resultado = primeiroOperando + segundoOperando;
        }
        System.out.println(resultado);
        
        
    }
    
}
