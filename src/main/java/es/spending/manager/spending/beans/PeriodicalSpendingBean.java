package es.spending.manager.spending.beans;

import java.util.Date;

public class PeriodicalSpendingBean extends SpendingBean {

    private static final Long serialVersionUID = 1L;

    private Integer id;
    private Date startDate;
    private Date payDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}
