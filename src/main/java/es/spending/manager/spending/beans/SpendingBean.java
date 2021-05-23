package es.spending.manager.spending.beans;

import es.spending.manager.spending.model.SpendingType;

import java.io.Serializable;
import java.math.BigDecimal;

public class SpendingBean implements Serializable {

    private String name;
    private BigDecimal amount;
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
}
