package org.example;

/*
 * Jogo da Forca: Implemente o clássico jogo da forca, onde o jogador deve adivinhar uma palavra oculta antes que um número definido de tentativas se esgote.
 * */

import java.util.*;

public class Main {

    public static WordsSecrets wordsSecrets = new WordsSecrets();
    public static String[] wordSecretsArray = wordsSecrets.getWordSecrets();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu(generatorValue());
    }

    private static void menu(String secretWorld) {
        System.out.println("Bem vindo ao jogo da forca");
        System.out.println("Você terá 5 chances de acertar a palavra misteriosa");

        char[] worldArrayPosition = secretWorld.toCharArray();

        final int chances = 5;
        System.out.println(worldArrayPosition);

        for (int i = 1; i <= chances; i++) {
            System.out.println("Essa é sua tentativa de número " + i);
            System.out.println("Entre com uma letra: ");
            char letra = sc.next().charAt(0);

            System.out.println(hasPalavra(letra, worldArrayPosition));
            forcaView(letra, worldArrayPosition);

            if (hasPalavra(letra, worldArrayPosition)) {
                System.out.println("Parabéns! Você acertou a letra!");
            } else if (i == chances) {
                System.out.println("Você esgotou suas tentativas. A palavra era: " + secretWorld);
            } else {
                System.out.println("Tente novamente.");
            }
        }
    }

    private static void forcaView(char letra, char[] worldArray) {
        int size = worldArray.length;
        String[] view = new String[size];

        // Inicializa a visualização com espaços vazios
        Arrays.fill(view, "_");

        // Preenche os espaços vazios com letras adivinhadas corretamente
        for (int i = 0; i < size; i++) {
            if (worldArray[i] == letra) {
                view[i] = String.valueOf(letra);
            }
        }
        System.out.println(view.length);

        // Exibi a visualização da palavra
        for (String character : view) {
            System.out.print(character + " ");
        }
        System.out.println();
    }



    private static boolean hasPalavra(Character character, char[] worldArray) {

        for (char c : worldArray) {
            if (c == character) {
                return true;
            }
        }

        return false;
    }


    private static String generatorValue() {
        int indice = (int) (Math.random() * wordSecretsArray.length);
        return wordSecretsArray[indice];
    }
}
