package controller;

public class Exercicio2<T> {
    private Object[] vetorCircular;
    private int frente, fim;

    public Exercicio2(int tamanho) {
        vetorCircular = new Object[tamanho];
        frente = fim = -1;
    }

    public Exercicio2() {
        this(5);
    }

    public void enfileirar(Object novoElemento) {
        if (cheia()) throw new IllegalStateException("Vetor cheio: desenfileire algum elemento primeiro");

        fim++;
        if (fim == vetorCircular.length) fim = 0;
        if (frente == -1) frente = 0;

        vetorCircular[fim] = novoElemento;
    }

    public Object desenfileirar() {
        if (vazia()) throw new IllegalStateException("Vetor vazio: enfileire algum elemento primeiro");

        Object primeiroElemento = vetorCircular[frente];
        vetorCircular[frente] = null;

        if (frente == fim) frente = fim = - 1; //Vetor com um elemento
        else if (frente == vetorCircular.length - 1) frente = 0; //Frente no final do vetor
        else frente++;

        return primeiroElemento;
    }

    public Object cabeca() {
        return (vazia()) ? null : vetorCircular[frente];
    }

    public Object cauda() {
        return (fim == -1) ? null : vetorCircular[fim];
    }

    public boolean vazia() {
        return frente == -1;
    }

    public boolean cheia() {
        return  (frente - 1 == fim)
                ||
                (frente == 0 && fim == vetorCircular.length - 1);
    }

    public void exibir() {
        if (vazia()) {
            System.out.println("[]");
        } else {
            StringBuilder builder = new StringBuilder("[");
            for (int i = frente; ; i++) {
                if (i == vetorCircular.length) i = 0;
                builder.append(vetorCircular[i]);

                if (i != fim) builder.append(", ");
                else break;
            }
            builder.append("]");

            System.out.println(builder);
        }
    }

    public boolean pesquisar(Object elemento) {
        if (vazia()) return false;

        for (int i = frente; ; i++) {
            if (i == vetorCircular.length) i = 0;
            if (vetorCircular[i].equals(elemento)) return true;
            if (i == fim) break;
        }
        return vetorCircular[fim] == elemento;
    }

    public int tamanho() {
        if (vazia()) return 0;

        if (frente < fim) return (fim - frente) + 1;
        else return (vetorCircular.length - frente) + (fim + 1);
    }
}
