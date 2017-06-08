/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aulafinal;

import br.estacio.terenciani.programacao.aula12.Gerente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class ImplementacaoDoPaulo implements CreateReadUpadateDeleteGerente{
    List<Gerente> listaDeGerentes = new ArrayList<Gerente>();
    @Override
    public boolean atualizar(Gerente gerente) throws ExceptionDoPaulo{
        try {
            int posicao  = listaDeGerentes.indexOf(gerente);
            listaDeGerentes.add(posicao, gerente);
        } catch (Exception e) {
            throw new ExceptionDoPaulo("Deu erro ao Atualizar");
        }
        
        return true;
    }

    @Override
    public boolean excluir(Gerente gerente) {
        return listaDeGerentes.remove(gerente);
    }

    @Override
    public List<Gerente> listarTodos() {
        return listaDeGerentes;
    }

    @Override
    public boolean salvar(Gerente gerente) {
        listaDeGerentes.add(gerente);
        return true;
    }
    
}
