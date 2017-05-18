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
public class TestaEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.setNome("Joao");
        System.out.println(func1.toString());
        
        Funcionario func2 = new Funcionario("Pedro", "Programad"
                + "or", "Bill Gates");
        System.out.println(func2.toString());
        
        Empresa terensaCode = new Empresa();
        
        terensaCode.cadastrarFuncionario(func1);
        terensaCode.cadastrarFuncionario(func2);
        
        terensaCode.listarFunciarios();
        
        terensaCode.excluirFuncionario(func1);
        
        System.out.println("Apos exclusao");
        
        terensaCode.listarFunciarios();
        
    }
    
}
