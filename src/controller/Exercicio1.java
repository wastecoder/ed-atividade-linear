package controller;

import java.util.Collections;
import java.util.LinkedList;

public class Exercicio1 {
    private LinkedList<String>[] nomes; //Duplamente encadeada
    private final int TAMANHO = 26;
    private int nomesCadastrados;

    public Exercicio1() {
        nomes = new LinkedList[TAMANHO];

        inicializarLinkedList();
    }

    private void inicializarLinkedList() {
        for (int i = 0; i < TAMANHO; i++)
            nomes[i] = new LinkedList<>();
    }

    private int indice(String nome) {
        final int VALOR_DO_A = 97;
        int valorDaLetra = nome.toLowerCase().charAt(0);

        return valorDaLetra - VALOR_DO_A;
    }

    public void adicionar(String nome) {
        String nomeFormatado = primeiraLetraMaiuscula(nome);
        int indice = indice(nomeFormatado);
        nomes[indice].add(nomeFormatado);

        ordenarLinkedList(indice);

        nomesCadastrados++;
    }

    private static String primeiraLetraMaiuscula(String palavra) {
        if (palavra == null || palavra.isEmpty()) return palavra;

        char primeiraLetra = Character.toUpperCase(palavra.charAt(0));
        String restante = palavra.substring(1).toLowerCase();

        return primeiraLetra + restante;
    }

    private void ordenarLinkedList(int indice) {
        Collections.sort(nomes[indice]);
    }

    public boolean contem(String nome) {
        String nomeFormatado = primeiraLetraMaiuscula(nome);
        int indice = indice(nomeFormatado);

        return nomes[indice].contains(nomeFormatado);
    }

    public boolean remover(String nome) {
        String nomeFormatado = primeiraLetraMaiuscula(nome);
        int indice = indice(nomeFormatado);

        boolean removeu = nomes[indice].remove(nomeFormatado);

        if (removeu) nomesCadastrados--;
        return removeu;
    }

    public boolean renomear(String nomeAntigo, String nomeNovo) {
        String nomeAntigoFormatado = primeiraLetraMaiuscula(nomeAntigo);
        if (!contem(nomeAntigoFormatado)) return false;

        remover(nomeAntigoFormatado);
        adicionar(nomeNovo);
        return true;
    }

    public boolean estaVazia() {
        return nomesCadastrados == 0;
    }

    public int quantidadeDeNomesCadastrados() {
        return nomesCadastrados;
    }

    public void exibir() {
        for (int i = 0; i < nomes.length; i++) {
            if (!nomes[i].isEmpty()) {
                System.out.print((char) ('A' + i) + " >>> " + nomes[i]);
                System.out.println();
            }
        }
    }
}
