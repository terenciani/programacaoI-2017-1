/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aula12;

/**
 *
 * @author Marcelo
 */
public class TestaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        
        Endereco endereco = new Endereco();
        endereco.setBairro("Jardim TV Morena");
        endereco.setRua("Zaran");
        endereco.setNumero(1234);
        
        
        gerente.setEndereco(endereco);
        gerente.setNome("Claudir");
        
        System.out.println(gerente.toString());
    }
    
}
