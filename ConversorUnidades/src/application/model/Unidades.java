package application.model;

//Temperatura,Comprimento,Massa,Volume,Tempo,Área

public enum Unidades {

    TEMPERATURA("TEMPERATURA"),
    COMPRIMENTO("COMPRIMENTO"),
    MASSA("MASSA"),
    TEMPO("TEMPO"),
    AREA("AREA"),

    SAIR("SAIR");

    private String unidade;

    Unidades(String unidade) {
        this.unidade = unidade;
    }

    public String getUnidade() {
        return unidade;
    }

}
