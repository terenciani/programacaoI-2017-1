/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aulafinal;

import br.estacio.terenciani.programacao.aula12.Gerente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo
 */
public class TesteCRUDGerente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreateReadUpadateDeleteGerente inteface = new ImplementacaoDoPaulo();

        Gerente gerente = new Gerente();
        gerente.setNome("Illgner");

        Gerente gerente2 = new Gerente();
        gerente2.setNome("Josmar");

        Gerente gerente3 = new Gerente();
        gerente3.setNome("Alexandre");

        Gerente gerente4 = new Gerente();
        gerente4.setNome("Vitor");

        
        inteface.salvar(gerente);
        inteface.salvar(gerente2);
        inteface.salvar(gerente3);
        
        try {
            inteface.atualizar(gerente4);
        } catch (ExceptionDoPaulo ex) {
            inteface.salvar(gerente);
                    
        }

        List<Gerente> listaDoBanco = inteface.listarTodos();

        for (Gerente g : listaDoBanco) {
            System.out.println(g.getNome());
        }

    }

}
