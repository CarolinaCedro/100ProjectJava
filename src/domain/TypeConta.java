package domain;

public enum TypeConta {
    CORRENTE("Cliente"),
    POUPANCA("Poupanca"),
    INVESTIMENTO("Investimento");

    private String type;

    TypeConta(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

