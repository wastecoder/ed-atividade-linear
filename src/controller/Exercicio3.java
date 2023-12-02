package controller;

public class Exercicio3<T> {
    private Object[] pilha;
    private int topoA; //Começa no -1
    private int topoB; //Começa no vetor.length

    public Exercicio3(int tamanho) {
        pilha = new Object[tamanho];
        topoA = -1;
        topoB = tamanho;
    }

    public Exercicio3() {
        this(6);
    }

    public void empilhaA(Object elemento) {
        if (cheiaA()) throw new IllegalStateException("Pilha A cheia: desempilhe algum primeiro");

        pilha[++topoA] = elemento;
    }

    public void empilhaB(Object elemento) {
        if (cheiaB()) throw new IllegalStateException("Pilha B cheia: desempilhe primeiro");

        pilha[--topoB] = elemento;
    }

    public Object desempilhaA() {
        if (vaziaA()) throw new IllegalStateException("Pilha A vazia: empilhe primeiro");

        Object topoAntigo = pilha[topoA];
        pilha[topoA--] = null;
        return topoAntigo;
    }

    public Object desempilhaB() {
        if (vaziaB()) throw new IllegalStateException("Pilha B vazia: empilhe primeiro");

        Object topoAntigo = pilha[topoB];
        pilha[topoB++] = null;
        return topoAntigo;
    }

    public boolean vaziaA() {
        return topoA == -1;
    }

    public boolean vaziaB() {
        return topoB == pilha.length;
    }

    public boolean cheiaA() {
        return (topoA + 1) == topoB;
    }

    public boolean cheiaB() {
        return (topoB - 1) == topoA;
    }

    public Object topoA() {
        return (vaziaA()) ? null : pilha[topoA];
    }

    public Object topoB() {
        return (vaziaB()) ? null : pilha[topoB];
    }

    public void exibirA() {
        StringBuilder builder = new StringBuilder("PilhaA >> [");
        for (int i = 0; i < topoA; i++) {
            builder.append(pilha[i]).append(", ");
        }
        builder.append(topoA()).append("]");

        System.out.println(builder);
    }

    public void exibirB() {
        int fim = pilha.length - 1;
        StringBuilder builder = new StringBuilder("PilhaB >> [");
        for (int i = fim; i > topoB; i--) {
            builder.append(pilha[i]).append(", ");
        }
        builder.append(topoB()).append("]");

        System.out.println(builder);
    }

    public int tamanhoA() {
        return topoA + 1;
    }

    public int tamanhoB() {
        return pilha.length - topoB;
    }
}
