package application;



import application.impl.*;
import application.model.*;

import java.util.*;

public class demo {

    private static Unidades unidades;
    private static ConversionImplArea area = new ConversionImplArea();
    private static ConversionImplComprimento comprimento = new ConversionImplComprimento();
    private static ConversionImplMassa massa = new ConversionImplMassa();
    private static ConversionImplTemperatura temperatura = new ConversionImplTemperatura();
    private static ConversionImplTempo tempo = new ConversionImplTempo();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        Unidades unidadesSelecionada;

        do {

            System.out.println();
            System.out.println("Entre com a unidade de Conversão");
            System.out.println("Suas opções de conversão no momento são: ");
            System.out.println(unidadesAvaible());
            System.out.println("Escolha sua unidade de conversão: ");
            String unidade = sc.nextLine();
            unidadesSelecionada = validadeUnidadeAvaible(unidade);

            if (unidadesSelecionada != null) {
                switch (unidadesSelecionada) {
                    case AREA -> converstionArea();
                    case COMPRIMENTO -> converstionComprimento();
                    case MASSA -> converstionMassa();
                    case TEMPERATURA -> converstionTemperatura();
                    case TEMPO -> converstionTempo();
                    case SAIR -> {
                        System.out.println("Encerrando o programa...");
                        System.exit(0);
                    }
                    default -> System.out.println("Opção Inválida");
                }
            } else {
                System.out.println("Opção Inválida");
            }
            sc.nextLine();
        } while (true);
    }

    public static Unidades validadeUnidadeAvaible(String unidade) {
        String value = unidade.trim().toUpperCase();
        boolean exists = unidadesAvaible().stream().anyMatch(res -> res.equals(value));
        if (exists) {
            return Unidades.valueOf(value);
        } else {
            System.out.println("Unidade não existe!");
            return null;
        }

    }

    public static List<String> unidadesAvaible() {
        List<String> unidades = new ArrayList<>();
        for (Unidades unidade : Unidades.values()) {
            unidades.add(unidade.getUnidade());
        }
        return unidades;
    }

    public static void converstionArea() {
        System.out.println("Conversao de Area");
        System.out.println("Entre com a unidade em centimetros: ");
        Double centimetro = sc.nextDouble();
        System.out.println("A conversao para metros e: " + area.unitConversion(centimetro));
    }

    public static void converstionComprimento() {
        System.out.println("Conversao de Comprimento");
        System.out.println("Entre com a unidade em centimetros: ");
        Double centimetro = sc.nextDouble();
        System.out.println("A conversao para metros e: " + comprimento.unitConversion(centimetro));
    }

    public static void converstionMassa() {
        System.out.println("Conversao de Massa");
        System.out.println("Entre com a unidade em quilogramas: ");
        Double quilogramas = sc.nextDouble();
        System.out.println("A conversao para gramas e: " + massa.unitConversion(quilogramas));
    }

    public static void converstionTemperatura() {
        System.out.println("Conversao de Temperatura");
        System.out.println("Entre com a unidade em Celsius: ");
        Double celsius = sc.nextDouble();
        System.out.println("A conversao para Fahrenheit e: " + temperatura.unitConversion(celsius));
    }

    public static void converstionTempo() {
        System.out.println("Conversao de Tempo");
        System.out.println("Entre com a unidade em segundos: ");
        Double segundos = sc.nextDouble();
        System.out.println("A conversao para Minutos e: " + tempo.unitConversion(segundos));
    }
}
