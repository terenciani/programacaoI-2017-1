/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aula10.empresa;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.nomeSuperior, other.nomeSuperior)) {
            return false;
        }
        return true;
    }

    
}
