package org.example;

import java.util.*;

public class WordsSecrets {

    private String[] wordSecrets = {
            "banana",
            "elefante",
            "computador",
            "abacaxi",
            "chocolate",
            "girafa",
            "amarelo",
            "laranja",
            "macaco",
            "escola",
            "bicicleta",
            "maravilha",
            "flor",
            "pizza",
            "telefone",
            "vermelho",
            "sapato",
            "planta",
            "velocidade",
            "felicidade"
    };

    public String[] getWordSecrets() {
        return wordSecrets;
    }

    @Override
    public String toString() {
        return "WordsSecrets{" +
                "wordSecrets=" + Arrays.toString(wordSecrets) +
                '}';
    }
}
