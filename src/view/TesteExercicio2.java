package view;

import controller.Exercicio2;

public class TesteExercicio2 {
    public static void main(String[] args) {
        Exercicio2<Integer> filaCircular = new Exercicio2<>(5);

        System.out.println("Está cheia? " + filaCircular.cheia());
        System.out.println("Está vazia? " + filaCircular.vazia());
        filaCircular.exibir();

        System.out.println("==================");
        filaCircular.enfileirar(1);
        filaCircular.enfileirar(2);
        filaCircular.enfileirar(3);
        filaCircular.enfileirar(4);

        filaCircular.exibir();
        System.out.println("Cabeça: " + filaCircular.cabeca());
        System.out.println("Cauda: " + filaCircular.cauda());
        System.out.println("Tamanho da lista circular: " + filaCircular.tamanho());


        System.out.println("==================");
        System.out.println("Tentando desenfileirar: " + filaCircular.desenfileirar());
        System.out.println("Tentando desenfileirar: " + filaCircular.desenfileirar());

        filaCircular.exibir();
        System.out.println("Cabeça: " + filaCircular.cabeca());
        System.out.println("Cauda: " + filaCircular.cauda());
        System.out.println("Está cheia? " + filaCircular.cheia());
        System.out.println("Está vazia? " + filaCircular.vazia());
        System.out.println("Tamanho da lista circular: " + filaCircular.tamanho());


        System.out.println("==================");
        filaCircular.enfileirar(6);
        filaCircular.enfileirar(7);
        filaCircular.enfileirar(8);

        filaCircular.exibir();
        System.out.println("Cabeça: " + filaCircular.cabeca());
        System.out.println("Cauda: " + filaCircular.cauda());
        System.out.println("Está cheia? " + filaCircular.cheia());
        System.out.println("Está vazia? " + filaCircular.vazia());
        System.out.println("Tamanho da lista circular: " + filaCircular.tamanho());


        System.out.println("==================");
        System.out.println("Elemento [1] está na fila? " + filaCircular.pesquisar(1));
        System.out.println("Elemento [7] está na fila? " + filaCircular.pesquisar(7));
        System.out.println("Tamanho da lista circular: " + filaCircular.tamanho());
    }
}
