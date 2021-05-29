package es.spending.manager.spending.dto;

import java.util.Date;

public class BasicSpending extends Spending {

    private Integer id;
    private Date payDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

}
