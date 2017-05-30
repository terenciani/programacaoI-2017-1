/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aula11;

/**
 *
 * @author Marcelo
 */
public class PessoaFisica extends Pessoa{
    public String cpf;

    @Override
    public String toString() {
        String nome = super.getNome();
        String toStringPai = super.toString();
        return toStringPai + " cpf=" + cpf;
    }

    @Override
    public String retornaCampoFormatado() {
        return cpf.substring(0, 3)+
                '.'+cpf.substring(3,6) +
                '.'+cpf.substring(6,9) +
                '-'+cpf.substring(9,11);
        
    }
    
    
    
}
