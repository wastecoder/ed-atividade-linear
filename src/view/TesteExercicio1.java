package view;

import controller.Exercicio1;

public class TesteExercicio1 {
    public static void main(String[] args) {
        Exercicio1 nomes = new Exercicio1();

        System.out.println("Está vazia? " + nomes.estaVazia());
        System.out.println("Nomes cadastrados: " + nomes.quantidadeDeNomesCadastrados());

        System.out.println("========================");
        nomes.adicionar("bRENo");
        nomes.adicionar("cARLOS");
        nomes.adicionar("biANcA");
        nomes.adicionar("CaMiLa");
        nomes.adicionar("beatRIZ");
        nomes.adicionar("ZuleIKA");
        nomes.adicionar("zoraide");
        nomes.adicionar("ZaZa");
        nomes.exibir();

        System.out.println("========================");
        System.out.println("Contem [Carlos]? " + nomes.contem("CarLoS"));
        System.out.println("Contem [Carla]? " + nomes.contem("Carla"));

        System.out.println("========================");
        System.out.println("Removeu [Carlos]? " + nomes.remover("CarLoS"));
        System.out.println("Removeu [Carla]? " + nomes.remover("Carla"));
        nomes.exibir();
        System.out.println("Nomes cadastrados: " + nomes.quantidadeDeNomesCadastrados());

        System.out.println("========================");
        System.out.println("Renomeou [Carla] para [Carlos]? " + nomes.renomear("Carla", "Carlos"));
        System.out.println("Renomeou [Zaza] para [Zozo]? " + nomes.renomear("Zaza", "Zozo"));
        nomes.exibir();

        System.out.println("========================");
        System.out.println("Está vazia? " + nomes.estaVazia());
        System.out.println("Nomes cadastrados: " + nomes.quantidadeDeNomesCadastrados());
        nomes.exibir();
    }
}
