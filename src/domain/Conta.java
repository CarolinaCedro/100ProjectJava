package domain;

import java.math.BigDecimal;

public class Conta {
    private User user;
    private long amount;
    private TypeConta typeConta;
    private String accountNumber;
    private String agencia;

    public Conta(User user, long amount, TypeConta typeConta, String accountNumber, String agencia) {
        this.user = user;
        this.amount = amount;
        this.typeConta = typeConta;
        this.accountNumber = accountNumber;
        this.agencia = agencia;
    }

    public void deposit(long amount) {
        this.amount += amount;
    }

    public void withdraw(long amount) {
        this.amount -= amount;
    }

    public long getBalance(long id) {
        return this.amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public TypeConta getTypeConta() {
        return typeConta;
    }

    public void setTypeConta(TypeConta typeConta) {
        this.typeConta = typeConta;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
}
