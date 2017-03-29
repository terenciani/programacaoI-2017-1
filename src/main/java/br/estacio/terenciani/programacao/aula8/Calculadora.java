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
        
        resultado = calcular(primeiroOperando, operacao, segundoOperando);
         
        Calculadora calc = new Calculadora();
        calc.impressaoDeResultado(resultado);
          
    }
    
    public static double calcular(double primeiroOperando,
            String operacao, double segundoOperando){
        double resultado=0;
        
        if (operacao.equals("+")){
            resultado = primeiroOperando + segundoOperando;
        }
        if (operacao.equals("-")){
            resultado = primeiroOperando - segundoOperando;
        }
        if (operacao.equals("*")){
            resultado = primeiroOperando * segundoOperando;
        }
        if (operacao.equals("/")){
            resultado = primeiroOperando / segundoOperando;
        }
        
        return resultado;
    }
    
    public void impressaoDeResultado(double resultado) {
        System.out.println("****************************");
        System.out.println("|O Resutaldo é: " + resultado +"|");
        System.out.println("****************************");
        
    }
    
}
