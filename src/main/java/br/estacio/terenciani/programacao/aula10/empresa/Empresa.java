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
class Empresa {
    private Funcionario[] vetorDeFuncionarios = new Funcionario[50];
    private int contadorDeFuncionarios = 0;
    
    
    public void listarFunciarios(){
        Funcionario funcionario;
        for (int i=0;i<contadorDeFuncionarios;i++){
            funcionario = vetorDeFuncionarios[i];
            if (funcionario != null)
                System.out.println(funcionario.toString());
        }
    } 

    public void cadastrarFuncionario(Funcionario funcionario) {
        if (contadorDeFuncionarios < vetorDeFuncionarios.length){
            vetorDeFuncionarios[contadorDeFuncionarios] = funcionario;
            System.out.println("Funcionario Cadastrado com Sucesso");
            contadorDeFuncionarios++;
        }else{
            System.out.println("Funcionario Não Cadastrados");
        }
    }
    public boolean excluirFuncionario(Funcionario funcionario){
        
        int posicao = retornaPosicaoDoFuncionario(funcionario);
        
        if (posicao != -1){
            vetorDeFuncionarios[posicao] = vetorDeFuncionarios[contadorDeFuncionarios-1];
            vetorDeFuncionarios[contadorDeFuncionarios] = null;
            contadorDeFuncionarios--;
            return true;
        }
        
        return false;
    }
    public int retornaPosicaoDoFuncionario(Funcionario funcionario){
        
        for (int i=0;i<contadorDeFuncionarios;i++){
            if (vetorDeFuncionarios[i].equals(funcionario))
                return i;
        }
        return -1;
    }
}







