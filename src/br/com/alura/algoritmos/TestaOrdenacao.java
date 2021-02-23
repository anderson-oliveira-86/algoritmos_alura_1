package br.com.alura.algoritmos;

public class TestaOrdenacao {
    public static void main(String[] args) {

        Produto[] produtos = {
                new Produto("Lamborghini" , 1000000),
                new Produto("Jipe" , 46000),
                new Produto("Brasília" , 16000),
                new Produto("Smart" , 46000),
                new Produto("Fusca" , 17000)
        };

        ordenar(produtos , produtos.length);

        System.out.println("Lista ordenada:");

        for(Produto produto : produtos) {
            System.out.println(produto.getNome() + " custa " + produto.getPreco());
        }
    }

    private static void ordenar(Produto[] produtos , int quantidadeDeElementos) {

        for (int atual = 0; atual < quantidadeDeElementos - 1 ; atual++) { // atual = 2 quantidadeDeElemtos = 4 // atual = 1 quantidadeDeElemtos = 4

            // System.out.println("Estou na casinha " + atual); // estou na casinha 1

            int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);

            // System.out.println("Trocando " + atual + " com o " + menor);

            Produto produtoAtual = produtos[atual]; //
            Produto produtoMenor = produtos[menor]; //

            // System.out.println("Trocando "+ produtoAtual.getNome() + " com o " + produtoMenor.getNome());

            produtos[atual] = produtoMenor; // produto 2 brasilia
            produtos[menor] = produtoAtual; // produto 0 lamborguini
        }
    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = inicio;

        for (int atual = inicio; atual <= termino ; atual++) {

            if(produtos[atual].getPreco() <= produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}