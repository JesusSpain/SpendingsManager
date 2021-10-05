package es.spending.manager.spending.dto;

import java.sql.Date;

public class BasicSpending extends Spending {

    private Integer id;
    private Date payDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

}
