/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.aula10;

/**
 *
 * @author Marcelo
 */
public class TesteDaClasseArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaração do objeto
        Arrays objetoDaClasseArrays;
        //Instanciação
        objetoDaClasseArrays = new Arrays();

        boolean retorno;

        for (int i = 0; i < 15; i++) {
            retorno = objetoDaClasseArrays.insereDadosNoVetor(i, 2);
            if (retorno) {
                System.out.println("O valor " + 2 + " foi inserido na posicao " + i);
            } else {
                System.out.println("O valor " + 2 + " não foi inserido na posicao " + i);
            }

        }

        int resultadoDaSoma;

        resultadoDaSoma = objetoDaClasseArrays.soma();

        System.out.println(
                "O valor da soma eh: " + resultadoDaSoma);
    }

}
