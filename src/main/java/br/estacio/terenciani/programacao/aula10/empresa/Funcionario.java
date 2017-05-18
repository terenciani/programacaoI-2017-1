/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aula10.empresa;

/**
 *
 * @author Marcelo
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private String nomeSuperior;

    public Funcionario(){}
    
    public Funcionario(String nome, String cargo, String nomeSuperior) {
        this.nome = nome;
        this.cargo = cargo;
        this.nomeSuperior = nomeSuperior;
    }
 
    //retorna o nome do usuario
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNomeSuperior() {
        return nomeSuperior;
    }

    public void setNomeSuperior(String nomeSuperior) {
        this.nomeSuperior = nomeSuperior;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + "(" + cargo + ") - " + nomeSuperior ;
    }

    
}
