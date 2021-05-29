package es.spending.manager.spending.dto;

import es.spending.manager.spending.model.SpendingType;

import java.math.BigDecimal;

public class Spending {

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
