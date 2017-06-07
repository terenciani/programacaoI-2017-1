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
public class Gerente extends Funcionario {
    private String senha;
    
    @Override
    public void calculaSalario(float salarioBase) {
        setSalario(salarioBase + (salarioBase * 0.5f));
    }
    
    public Gerente(){
        this.senha = "12345";
    }
    
    public Gerente(String nome){
        this.setNome(nome);
    }
    
    public Gerente (String nome, String cpf, float salario){
        this.setCpf(cpf);
        this.setNome(nome);
        this.setSalario(salario);
        this.setSenha("12345");
    }
    
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Gerente "+ getNome();
    }
    
    
    
}
