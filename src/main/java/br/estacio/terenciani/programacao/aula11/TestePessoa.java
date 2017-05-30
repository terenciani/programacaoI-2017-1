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
public class TestePessoa {
    public static void  main(String[] args){
        /*Pessoa pessoa = new Pessoa();
        pessoa.dataNascimento="2017-01-01";
        pessoa.nome="João";
        pessoa.endereco="Rua da Saudade, nº 135, Jardim América";
        
        System.out.println(pessoa.toString());*/
        
        PessoaFisica pessoaFisica = new PessoaFisica();
        
        pessoaFisica.setNome("Maria");
        
        pessoaFisica.cpf="11211311411";
        
        System.out.println(pessoaFisica.retornaCampoFormatado());
        
        Aluno aluno = new Aluno();
        
    }
}
