/*
 *
Criar uma classe Arrays que contém um 
array de inteiros 
Criar um método “soma” que percorra e
retorne a soma de todos os elementos do 
vetor
Criar um método main que:
Crie uma instância da classe Arrays
Leia inteiros do console e armazene os 
valores no vetor da classe Arrays.
Imprima a soma dos números através do método
soma

 */
package br.estacio.terenciani.programacao.aula10;

/**
 *
 * @author Marcelo
 */
public class Arrays {

    int[] vetorDeInteiros = new int[10];

    public boolean insereDadosNoVetor(int posicao, int valor) {
        if (posicao < vetorDeInteiros.length) {
            vetorDeInteiros[posicao] = valor;
            return true;
        } else {
            return false;
        }
    }

    public int soma() {
        int soma = 0;

        for (int i = 0; i < vetorDeInteiros.length; i++) {
            soma = soma + vetorDeInteiros[i];
        }

        return soma;
    }
}
