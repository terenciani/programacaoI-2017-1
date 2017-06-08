/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aulafinal;

import br.estacio.terenciani.programacao.aula12.Gerente;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public interface CreateReadUpadateDeleteGerente {
    public boolean atualizar(Gerente gerente) throws ExceptionDoPaulo;
    public boolean excluir(Gerente gerente);
    public List<Gerente> listarTodos();
    public boolean salvar(Gerente gerente);
}
