package br.estacio.terenciani.programacao;

import javax.swing.*;

public class TesteJOptionPane {

    
    public static void main(String[] args) {
        String retorno = JOptionPane.showInputDialog
                (null, "Digite o seu nome");
        System.out.println(retorno);
        
        JOptionPane.showMessageDialog(null, "Bem Vindo " 
                + retorno, "Login com Sucesso", 
                JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
