package es.spending.manager.spending.model;

import javax.persistence.*;
import java.math.BigDecimal;

@MappedSuperclass
public class Spending {

    @Column
    private String name;

    @Column
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private SpendingType type;

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

    @Override
    public String toString() {
        return "Spending{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }
}
