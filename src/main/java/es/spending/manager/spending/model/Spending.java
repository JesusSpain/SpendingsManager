package es.spending.manager.spending.model;

import javax.persistence.*;
import java.math.BigDecimal;

@MappedSuperclass
public class Spending {

    @Id
    private int id;
    private String name;
    private BigDecimal amount;
    private SpendingType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public SpendingType getType() {
        return type;
    }

    public void setType(SpendingType type) {
        this.type = type;
    }
}
