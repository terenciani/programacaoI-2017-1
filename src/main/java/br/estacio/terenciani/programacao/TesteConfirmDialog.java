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
public class TesteConfirmDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int opcaoSelecionada = JOptionPane.showConfirmDialog(null, "Deseja realmente sair", 
                "Logout", JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE);
        System.out.println(opcaoSelecionada);
        
        
        if (opcaoSelecionada==0){
            JOptionPane.showMessageDialog(null, "Logout efetuado "
                    + "com sucesso");
        } else{
            JOptionPane.showMessageDialog(null, "Você cancelou o "
                    + "Logout");
        }
    }
    
}
