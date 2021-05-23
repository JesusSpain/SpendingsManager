package es.spending.manager.spending.beans;

import java.util.Date;

public class BasicSpendingBean extends SpendingBean {

    private static final Long serialVersionUID = 0L;

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
