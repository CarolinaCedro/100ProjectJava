package domain;

import java.math.BigDecimal;

public class Conta {
    private User user;
    private long amount;
    private TypeConta typeConta;
    private String accountNumber;
    private String agencia;


    public void deposit(long amount) {
        this.amount += amount;
    }

    public void withdraw(long amount) {
        this.amount -= amount;
    }

    public long getBalance(long id) {
        return this.amount;
    }


}
