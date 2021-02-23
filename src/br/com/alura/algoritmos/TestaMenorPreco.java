package br.com.alura.algoritmos;

public class TestaMenorPreco {
    public static void main(String[] args) {

        /*
        Produto produtos[] = new Produto[5];
        produtos[0] = new Produto("Lamborghini" , 1000000);
        produtos[1] = new Produto("Jipe" , 46000);
        produtos[2] = new Produto("Brasília" , 16000);
        produtos[3] = new Produto("Smart" , 46000);
        produtos[4] = new Produto("Fusca" , 17000);
        */

        Produto[] produtos = {
                new Produto("Lamborghini" , 1000000),
                new Produto("Jipe" , 46000),
                new Produto("Brasília" , 116000),
                new Produto("Smart" , 46000),
                new Produto("Fusca" , 17000)
        };

        int maisBarato = buscaMenor(produtos , 0 ,4);
        int maisCaro = buscaMaior(produtos, 0 , 4);


        System.out.println(maisBarato);
        System.out.println("O Carro " + produtos[maisBarato].getNome() + " é o mais barato e custa " + produtos[maisBarato].getPreco());
        System.out.println("");
        System.out.println(maisCaro);
        System.out.println("O Carro " + produtos[maisCaro].getNome() + " é o mais caro e custa " + produtos[maisCaro].getPreco());
    }

    private static int buscaMaior(Produto[] produtos, int inicio, int termino) {

        int maisCaro = inicio;

        for (int atual = 0; atual <= termino ; atual++) {

            if(produtos[atual].getPreco() >= produtos[maisCaro].getPreco()){
                maisCaro = atual;
            }
        }
        return maisCaro;
    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {

        int maisBarato = inicio;

        for (int atual = 0; atual <= termino ; atual++) {

            if(produtos[atual].getPreco() <= produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

}
