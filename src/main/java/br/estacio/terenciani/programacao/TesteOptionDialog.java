/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class TesteOptionDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Object[] opcoes = {"Ok", "Cancelar", "Voltar"};
        
        int retorno = JOptionPane.showOptionDialog(null, "Escolha uma " 
                + "opção", "JOptionPane Titulo",
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,  
                null, opcoes, opcoes[1]);
        
        System.out.println(retorno);
    }
    
}
