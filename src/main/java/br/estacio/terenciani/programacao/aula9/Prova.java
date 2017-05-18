package br.estacio.terenciani.programacao.aula9;
public class Prova {

    public static void main(String[] args) {
        int a, b, c;
        for (a = 2; a <= 10; a += 2) {
            for (b = a; b <= 2; b++) {
                for (c = 1; c <= a; c += b) {
                    System.out.print("" + a + b + c);
                }
            }
        }
    }
}


