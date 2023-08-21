package domain;

import java.math.BigDecimal;
import java.util.Date;

public class User {

    private Long id;
    private String name;
    private String cidade;
    private Date createdAt;


    public User() {
    }

    public User(Long id, String name, String cidade, Date createdAt) {
        this.id = id;
        this.name = name;
        this.cidade = cidade;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}