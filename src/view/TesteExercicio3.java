package view;

import controller.Exercicio3;

public class TesteExercicio3 {
    public static void main(String[] args) {
        Exercicio3<Integer> pilha = new Exercicio3<>();

        System.out.println("Tamanho A: " + pilha.tamanhoA());
        System.out.println("Tamanho B: " + pilha.tamanhoB());
        System.out.println("A Vazia? " + pilha.vaziaA());
        System.out.println("B Vazia? " + pilha.vaziaB());
        pilha.exibirA();
        pilha.exibirB();


        System.out.println("==================");
        pilha.empilhaA(1);
        pilha.empilhaA(2);
        pilha.empilhaB(3);
        pilha.empilhaB(4);
        pilha.empilhaB(5);
        pilha.empilhaB(6);

        pilha.exibirA();
        pilha.exibirB();
        System.out.println("Tamanho A: " + pilha.tamanhoA());
        System.out.println("Tamanho B: " + pilha.tamanhoB());
        System.out.println("Topo A: " + pilha.topoA());
        System.out.println("Topo B: " + pilha.topoB());


        System.out.println("==================");
        System.out.println("Desempilhando A: " + pilha.desempilhaA());
        System.out.println("Desempilhando A: " + pilha.desempilhaA());
        System.out.println("Desempilhando B: " + pilha.desempilhaB());
        System.out.println("Desempilhando B: " + pilha.desempilhaB());

        pilha.exibirA();
        pilha.exibirB();
        System.out.println("Tamanho A: " + pilha.tamanhoA());
        System.out.println("Tamanho B: " + pilha.tamanhoB());
        System.out.println("Topo A: " + pilha.topoA());
        System.out.println("Topo B: " + pilha.topoB());
    }
}
